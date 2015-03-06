/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Employee;

/**
 *
 * @author Administrador
 */
@Local
public interface EmployeePLLocal {

    boolean register(Employee employee);

    boolean remove(Employee employee);

    boolean modify(Employee employee);

    List<Employee> retrieveCollectionList();

    Employee getById(int id);
    
}
