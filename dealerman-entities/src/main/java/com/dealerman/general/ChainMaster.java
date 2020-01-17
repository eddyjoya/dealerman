/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.general;

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
@Table(name = "chain_master")
public class ChainMaster implements Serializable {

    @Column(name = "account_type", columnDefinition = "char(3)")
    private String accountType;
    @Id
    @Column(name = "chain_code", columnDefinition = "char(3)")
    private String chainCode;
    @Column(name = "chain_name", columnDefinition = "varchar(50)", nullable = true)
    private String chainName;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = false)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = false)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = false)
    private Boolean modified;

    public ChainMaster() {
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getChainCode() {
        return chainCode;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
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
