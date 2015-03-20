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
import javax.faces.event.ActionEvent;
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
    private Author author;
    private Action1 action;
    
    public AuthorBean() {
        author=new Author();
    }

    public List<Author> getList() {
        list = authorBL.retrieveCollectionList();
        return list;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public void renew(ActionEvent ae)
    {
        author = new Author();
        action=action.NEW;
    }
    
    public void renewModify(ActionEvent ae)
    {
        action=action.MODIFY;
    }
    
    public void renewDelete(ActionEvent ae)
    {
        action=action.DELETE;
    }
    
    public String processPetition()
    {
        switch(action)
        {
            case NEW:
                authorBL.register(author);
                return "MainMenu";
                
            case MODIFY:
                authorBL.modify(author);
                author = new Author();
                return "AuthorList";
            case DELETE:
                authorBL.remove(author);
                author = new Author();
                return "AuthorList";
        }
        return "MainMenu";
    }
    
}
