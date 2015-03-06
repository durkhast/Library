/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Loan;

/**
 *
 * @author Administrador
 */
@Local
public interface LoanBLLocal {

    boolean register(Loan loan);

    boolean delete(Loan loan);
    
}
