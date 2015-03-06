/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.AuthorDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.Author;

/**
 *
 * @author Administrador
 */
@Stateless
public class AuthorBL implements AuthorBLLocal {
    @EJB
    private AuthorDAOLocal authorDAO;

    @Override
    public boolean register(Author author) {
        authorDAO.create(author);
        return true;
    }
    
    @Override
    public boolean remove(Author author) {
        authorDAO.remove(author);
        return true;
    }

    @Override
    public boolean modify(Author author) {
        authorDAO.edit(author);
        return true;
    }

    @Override
    public List<Author> retrieveCollectionList() {
        return authorDAO.findAll();
    }

    @Override
    public Author getById(int id) {
        return authorDAO.find(id);
    }
    
    
    
    
    
    
    
}
