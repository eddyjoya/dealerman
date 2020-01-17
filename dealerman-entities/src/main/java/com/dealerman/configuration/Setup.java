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
import org.hibernate.annotations.Type;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "setup")
public class Setup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "key_name", columnDefinition = "char(20)")
    private String keyName;

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyID;

    @Column(name = "value1", nullable = false)
    @Type(type = "int")
    private int value1;

    public Setup() {
    }

    public Setup(String keyName, String companyID, int value1) {
        this.keyName = keyName;
        this.companyID = companyID;
        this.value1 = value1;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

}
