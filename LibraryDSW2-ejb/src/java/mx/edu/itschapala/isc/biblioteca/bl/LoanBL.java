/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.LoanDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.Loan;

/**
 *
 * @author Administrador
 */
@Stateless
public class LoanBL implements LoanBLLocal {
    @EJB
    private LoanDAOLocal loanDAO;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean register(Loan loan) {
        loanDAO.create(loan);
        return true;
    }

    @Override
    public boolean delete(Loan loan) {
        loanDAO.remove(loan);
        return true;
    }
    
    
}
