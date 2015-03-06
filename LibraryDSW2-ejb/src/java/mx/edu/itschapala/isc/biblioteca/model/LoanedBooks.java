/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "loaned_books")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoanedBooks.findAll", query = "SELECT l FROM LoanedBooks l"),
    @NamedQuery(name = "LoanedBooks.findById", query = "SELECT l FROM LoanedBooks l WHERE l.id = :id"),
    @NamedQuery(name = "LoanedBooks.findByPenalty", query = "SELECT l FROM LoanedBooks l WHERE l.penalty = :penalty")})
public class LoanedBooks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "penalty")
    private double penalty;
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Book bookId;
    @JoinColumn(name = "loan_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Loan loanId;

    public LoanedBooks() {
    }

    public LoanedBooks(Integer id) {
        this.id = id;
    }

    public LoanedBooks(Integer id, double penalty) {
        this.id = id;
        this.penalty = penalty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Loan getLoanId() {
        return loanId;
    }

    public void setLoanId(Loan loanId) {
        this.loanId = loanId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoanedBooks)) {
            return false;
        }
        LoanedBooks other = (LoanedBooks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.isc.biblioteca.LoanedBooks[ id=" + id + " ]";
    }
    
}
