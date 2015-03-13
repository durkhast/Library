/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.view;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import mx.edu.itschapala.isc.biblioteca.bl.AuthorBLLocal;
import mx.edu.itschapala.isc.biblioteca.model.Author;

/**
 *
 * @author Administrador
 */
@ManagedBean
@SessionScoped
public class AuthorBean {
    
    @EJB
    private AuthorBLLocal authorBL;

    private List<Author> list ;
   
    public AuthorBean() {
    }

    public List<Author> getList() {
        list = authorBL.retrieveCollectionList();
        return list;
    }
    
    
    
}
