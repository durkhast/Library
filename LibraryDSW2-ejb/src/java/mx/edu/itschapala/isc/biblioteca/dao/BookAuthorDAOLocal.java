/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.BookAuthor;

/**
 *
 * @author Administrador
 */
@Local
public interface BookAuthorDAOLocal {

    void create(BookAuthor bookAuthor);

    void edit(BookAuthor bookAuthor);

    void remove(BookAuthor bookAuthor);

    BookAuthor find(Object id);

    List<BookAuthor> findAll();

    List<BookAuthor> findRange(int[] range);

    int count();
    
}
