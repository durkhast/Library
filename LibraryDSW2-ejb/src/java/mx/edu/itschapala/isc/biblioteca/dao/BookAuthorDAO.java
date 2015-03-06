/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.itschapala.isc.biblioteca.model.BookAuthor;

/**
 *
 * @author Administrador
 */
@Stateless
public class BookAuthorDAO extends AbstractDAO<BookAuthor> implements BookAuthorDAOLocal {
    @PersistenceContext(unitName = "LibraryDSW2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookAuthorDAO() {
        super(BookAuthor.class);
    }
    
}
