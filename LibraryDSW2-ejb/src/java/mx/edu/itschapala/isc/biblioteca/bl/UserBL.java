/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.UserDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.User;

/**
 *
 * @author Administrador
 */
@Stateless
public class UserBL implements UserBLLocal {
    
    @EJB
    private UserDAOLocal userDAO;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean register(User user) {
        userDAO.create(user);
        return true;
    }

    @Override
    public boolean remove(User user) {
        userDAO.remove(user);
        return true;
    }

    @Override
    public boolean modify(User User) {
        userDAO.edit(User);
        return true;
    }

    @Override
    public List<User> retrieveCollectionList() {
        return userDAO.findAll();
    }

    @Override
    public User getById(int id) {
        return userDAO.find(id);
    }
    
    
}
