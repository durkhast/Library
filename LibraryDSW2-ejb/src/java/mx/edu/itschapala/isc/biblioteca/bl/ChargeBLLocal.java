/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Charge;

/**
 *
 * @author Administrador
 */
@Local
public interface ChargeBLLocal {

    boolean register(Charge charge);

    boolean delete(Charge charge);

    boolean modify(Charge Charge);

    List<Charge> retrieveCollectionList();

    Charge getById(int id);
    
}
