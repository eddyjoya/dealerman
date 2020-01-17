/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.configuration;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "catdeudr")
public class CategoryDeudor implements Serializable {

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "category_id", columnDefinition = "char(2)")
    private String categoryId;
    @Id
    @Column(name = "aplicacion", columnDefinition = "char(1)", nullable = false)
    private String aplicacion;

    @ManyToOne
    @ForeignKey(name = "FK__catdeudr__accoun__276EDEB3")
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Accounts account;

    @Column(name = "category_name", columnDefinition = "varchar(30)", nullable = true)
    private String categoryName;
    @Column(name = "nocustomer", columnDefinition = "bit", nullable = true)
    private Boolean nocustomer;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public CategoryDeudor() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.companyId);
        hash = 83 * hash + Objects.hashCode(this.categoryId);
        hash = 83 * hash + Objects.hashCode(this.aplicacion);
        hash = 83 * hash + Objects.hashCode(this.account);
        hash = 83 * hash + Objects.hashCode(this.categoryName);
        hash = 83 * hash + Objects.hashCode(this.nocustomer);
        hash = 83 * hash + Objects.hashCode(this.discontinued);
        hash = 83 * hash + Objects.hashCode(this.added);
        hash = 83 * hash + Objects.hashCode(this.modified);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CategoryDeudor other = (CategoryDeudor) obj;
        if (!Objects.equals(this.companyId, other.companyId)) {
            return false;
        }
        if (!Objects.equals(this.categoryId, other.categoryId)) {
            return false;
        }
        if (!Objects.equals(this.aplicacion, other.aplicacion)) {
            return false;
        }
        if (!Objects.equals(this.categoryName, other.categoryName)) {
            return false;
        }
        if (!Objects.equals(this.account, other.account)) {
            return false;
        }
        if (!Objects.equals(this.nocustomer, other.nocustomer)) {
            return false;
        }
        if (!Objects.equals(this.discontinued, other.discontinued)) {
            return false;
        }
        if (!Objects.equals(this.added, other.added)) {
            return false;
        }
        return Objects.equals(this.modified, other.modified);
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Boolean getAdded() {
        return added;
    }

    public void setAdded(Boolean added) {
        this.added = added;
    }

    public Boolean getModified() {
        return modified;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getNocustomer() {
        return nocustomer;
    }

    public void setNocustomer(Boolean nocustomer) {
        this.nocustomer = nocustomer;
    }

}
