/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Author;

/**
 *
 * @author Administrador
 */
@Local
public interface AuthorBLLocal {

    boolean register(Author author);

    boolean remove(Author author);

    boolean modify(Author author);

    List<Author> retrieveCollectionList();

    Author getById(int id);
    
}
