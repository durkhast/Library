/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.isc.biblioteca.dao.EmployeeDAOLocal;
import mx.edu.itschapala.isc.biblioteca.model.Employee;

/**
 *
 * @author Administrador
 */
@Stateless
public class EmployeePL implements EmployeePLLocal {
    @EJB
    private EmployeeDAOLocal employeeDAO;
    
    @Override
    public boolean register(Employee employee) {
        employeeDAO.create(employee);
        return true;
    }

    @Override
    public boolean remove(Employee employee) {
        employeeDAO.remove(employee);
        return true;
    }

    @Override
    public boolean modify(Employee employee) {
        employeeDAO.edit(employee);
        return true;
    }

    @Override
    public List<Employee> retrieveCollectionList() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee getById(int id) {
        return employeeDAO.find(id);
    }
    
    
}
