/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.isc.biblioteca.model.Genre;

/**
 *
 * @author Administrador
 */
@Local
public interface GenreDAOLocal {

    void create(Genre genre);

    void edit(Genre genre);

    void remove(Genre genre);

    Genre find(Object id);

    List<Genre> findAll();

    List<Genre> findRange(int[] range);

    int count();
    
}
