/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.BookGenre;

/**
 *
 * @author Administrador
 */
@Local
public interface BookGenreBLLocal {

    boolean register(BookGenre bookGenre);

    boolean delete(BookGenre bookGenre);

    boolean modify(BookGenre bookGenre);

    List<BookGenre> retrieveCollectionList();

    BookGenre getById(int id);
    
}
