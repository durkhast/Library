/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.ChargeDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.Charge;

/**
 *
 * @author Administrador
 */
@Stateless
public class ChargeBL implements ChargeBLLocal {
    
    @EJB
    private ChargeDAOLocal chargeDAO;

    @Override
    public boolean register(Charge charge) {
        chargeDAO.create(charge);
        return true;
    }

    @Override
    public boolean delete(Charge charge) {
        chargeDAO.remove(charge);
        return true;
    }

    @Override
    public boolean modify(Charge Charge) {
        chargeDAO.edit(Charge);
        return true;
    }

    @Override
    public List<Charge> retrieveCollectionList() {
        return chargeDAO.findAll();
    }

    @Override
    public Charge getById(int id) {
        return chargeDAO.find(id);
    }

    
    
}
