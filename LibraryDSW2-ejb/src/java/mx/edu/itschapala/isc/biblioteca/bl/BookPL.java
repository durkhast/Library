/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.BookDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.Book;

/**
 *
 * @author Administrador
 */
@Stateless
public class BookPL implements BookPLLocal {
    @EJB
    private BookDAOLocal bookDAO;

    @Override
    public boolean register(Book book) {
        bookDAO.create(book);
        return true;
    }
    
    @Override
    public boolean remove(Book book) {
        bookDAO.remove(book);
        return true;
    }

    @Override
    public List<Book> retrieveCollectionList() {
        return bookDAO.findAll();
    }

    @Override
    public boolean modify(Book book) {
        bookDAO.edit(book); 
        return true;
    }

    @Override
    public Book getByID(int id) {
        return bookDAO.find(id);
    }
    
    
    
}
