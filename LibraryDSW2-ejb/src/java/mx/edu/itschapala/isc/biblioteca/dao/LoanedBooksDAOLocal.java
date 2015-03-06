/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.LoanedBooks;

/**
 *
 * @author Administrador
 */
@Local
public interface LoanedBooksDAOLocal {

    void create(LoanedBooks loanedBooks);

    void edit(LoanedBooks loanedBooks);

    void remove(LoanedBooks loanedBooks);

    LoanedBooks find(Object id);

    List<LoanedBooks> findAll();

    List<LoanedBooks> findRange(int[] range);

    int count();
    
}
