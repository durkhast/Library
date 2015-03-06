/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Author;

/**
 *
 * @author Administrador
 */
@Local
public interface AuthorDAOLocal {

    void create(Author author);

    void edit(Author author);

    void remove(Author author);

    Author find(Object id);

    List<Author> findAll();

    List<Author> findRange(int[] range);

    int count();
    
}
