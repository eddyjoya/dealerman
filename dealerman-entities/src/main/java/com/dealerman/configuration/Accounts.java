/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.configuration;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "accounts")
public class Accounts implements Serializable {

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "account_id", columnDefinition = "char(20)")
    private String accountId;
    @Column(name = "aplicacion", columnDefinition = "char(1)", nullable = false)
    private String aplicacion;
    @Column(name = "account_name", columnDefinition = "varchar(80)", nullable = true)
    private String accountName;
    @Column(name = "mayor", columnDefinition = "bit", nullable = true)
    private Boolean mayor;
    @Column(name = "f101_code", columnDefinition = "char(4)", nullable = true)
    private String f101Code;
    @Column(name = "f102_code", columnDefinition = "char(4)", nullable = true)
    private String f102Code;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public Accounts() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Boolean getMayor() {
        return mayor;
    }

    public void setMayor(Boolean mayor) {
        this.mayor = mayor;
    }

    public String getF101Code() {
        return f101Code;
    }

    public void setF101Code(String f101Code) {
        this.f101Code = f101Code;
    }

    public String getF102Code() {
        return f102Code;
    }

    public void setF102Code(String f102Code) {
        this.f102Code = f102Code;
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

}
