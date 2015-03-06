/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.User;

/**
 *
 * @author Administrador
 */
@Local
public interface UserBLLocal {

    boolean register(User user);

    boolean remove(User user);

    boolean modify(User User);

    List<User> retrieveCollectionList();

    User getById(int id);
    
}
