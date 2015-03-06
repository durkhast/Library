/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.isc.biblioteca.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "loan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loan.findAll", query = "SELECT l FROM Loan l"),
    @NamedQuery(name = "Loan.findById", query = "SELECT l FROM Loan l WHERE l.id = :id"),
    @NamedQuery(name = "Loan.findByDateOfExpedition", query = "SELECT l FROM Loan l WHERE l.dateOfExpedition = :dateOfExpedition"),
    @NamedQuery(name = "Loan.findByDateOfExpiration", query = "SELECT l FROM Loan l WHERE l.dateOfExpiration = :dateOfExpiration")})
public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateOfExpedition")
    @Temporal(TemporalType.DATE)
    private Date dateOfExpedition;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateOfExpiration")
    @Temporal(TemporalType.DATE)
    private Date dateOfExpiration;
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employeeId;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loanId")
    private List<LoanedBooks> loanedBooksList;

    public Loan() {
    }

    public Loan(Integer id) {
        this.id = id;
    }

    public Loan(Integer id, Date dateOfExpedition, Date dateOfExpiration) {
        this.id = id;
        this.dateOfExpedition = dateOfExpedition;
        this.dateOfExpiration = dateOfExpiration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfExpedition() {
        return dateOfExpedition;
    }

    public void setDateOfExpedition(Date dateOfExpedition) {
        this.dateOfExpedition = dateOfExpedition;
    }

    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @XmlTransient
    public List<LoanedBooks> getLoanedBooksList() {
        return loanedBooksList;
    }

    public void setLoanedBooksList(List<LoanedBooks> loanedBooksList) {
        this.loanedBooksList = loanedBooksList;
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
        if (!(object instanceof Loan)) {
            return false;
        }
        Loan other = (Loan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.isc.biblioteca.Loan[ id=" + id + " ]";
    }
    
}
