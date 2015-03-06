/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Book;

/**
 *
 * @author Administrador
 */
@Local
public interface BookPLLocal {

    boolean register(Book book);

    boolean remove(Book book);

    List<Book> retrieveCollectionList();

    boolean modify(Book book);

    Book getByID(int id);
    
}
