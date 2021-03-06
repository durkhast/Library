/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.itschapala.isc.biblioteca.model.Book;

/**
 *
 * @author Administrador
 */
@Stateless
public class BookDAO extends AbstractDAO<Book> implements BookDAOLocal {
    @PersistenceContext(unitName = "LibraryDSW2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookDAO() {
        super(Book.class);
    }
    
}
