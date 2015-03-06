/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.BookGenre;

/**
 *
 * @author Administrador
 */
@Local
public interface BookGenreDAOLocal {

    void create(BookGenre bookGenre);

    void edit(BookGenre bookGenre);

    void remove(BookGenre bookGenre);

    BookGenre find(Object id);

    List<BookGenre> findAll();

    List<BookGenre> findRange(int[] range);

    int count();
    
}
