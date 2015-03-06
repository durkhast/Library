/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Charge;

/**
 *
 * @author Administrador
 */
@Local
public interface ChargeDAOLocal {

    void create(Charge charge);

    void edit(Charge charge);

    void remove(Charge charge);

    Charge find(Object id);

    List<Charge> findAll();

    List<Charge> findRange(int[] range);

    int count();
    
}
