/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.BookGenreDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.BookGenre;

/**
 *
 * @author Administrador
 */
@Stateless
public class BookGenreBL implements BookGenreBLLocal {
    
    @EJB
    private BookGenreDAOLocal bookGenreDAO;

    @Override
    public boolean register(BookGenre bookGenre) {
        bookGenreDAO.create(bookGenre);
        return true;
    }

    @Override
    public boolean delete(BookGenre bookGenre) {
        bookGenreDAO.remove(bookGenre);
        return true;
    }

    @Override
    public boolean modify(BookGenre bookGenre) {
        bookGenreDAO.edit(bookGenre);
        return true;
    }

    @Override
    public List<BookGenre> retrieveCollectionList() {
        return bookGenreDAO.findAll();
    }

    @Override
    public BookGenre getById(int id) {
        return bookGenreDAO.find(id);
    }

    
    
}
