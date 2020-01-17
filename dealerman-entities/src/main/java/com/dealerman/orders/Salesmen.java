/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.orders;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "salesmen")
public class Salesmen implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "salesman_id", columnDefinition = "char(5)")
    private String salesmanId;
    @Column(name = "last_name", columnDefinition = "varchar(20)", nullable = true)
    private String lastName;
    @Column(name = "first_name", columnDefinition = "varchar(20)", nullable = true)
    private String firstName;
    @Column(name = "initials", columnDefinition = "varchar(5)", nullable = true)
    private String initials;
    @Column(name = "cedula", columnDefinition = "varchar(13)", nullable = true)
    private String cedula;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "title", columnDefinition = "varchar(30)", nullable = true)
    private String title;
    @Column(name = "birth_date", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(name = "hire_date", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date hireDate;
    @Column(name = "address", columnDefinition = "varchar(60)", nullable = true)
    private String address;
    @Column(name = "city", columnDefinition = "varchar(15)", nullable = true)
    private String city;
    @Column(name = "region", columnDefinition = "varchar(15)", nullable = true)
    private String region;
    @Column(name = "postal_code", columnDefinition = "varchar(10)", nullable = true)
    private String postalCode;
    @Column(name = "country", columnDefinition = "varchar(13)", nullable = true)
    private String country;
    @Column(name = "home_phone", columnDefinition = "varchar(24)", nullable = true)
    private String homePhone;
    @Column(name = "extension", columnDefinition = "varchar(4)", nullable = true)
    private String extension;
    @Column(name = "group_id", columnDefinition = "varchar(6)", nullable = true)
    private String groupId;
    @Column(name = "sales_region", columnDefinition = "varchar(4)", nullable = true)
    private String salesRegion;
    @Column(name = "password", columnDefinition = "varchar(8)", nullable = true)
    private String password;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @Column(name = "perc1", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc1;
    @Column(name = "perc1k", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc1k;
    @Column(name = "perc1s", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc1s;
    @Column(name = "perc1ks", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc1ks;
    @Column(name = "perc2", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc2;
    @Column(name = "perc2k", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc2k;
    @Column(name = "perc2s", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc2s;
    @Column(name = "perc2ks", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc2ks;
    @Column(name = "perc3", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc3;
    @Column(name = "perc3k", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc3k;
    @Column(name = "perc3s", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc3s;
    @Column(name = "perc3ks", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc3ks;
    @Column(name = "perc4", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc4;
    @Column(name = "perc4k", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc4k;
    @Column(name = "perc4s", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc4s;
    @Column(name = "perc4ks", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal perc4ks;

    public Salesmen() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(String salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSalesRegion() {
        return salesRegion;
    }

    public void setSalesRegion(String salesRegion) {
        this.salesRegion = salesRegion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public BigDecimal getPerc1() {
        return perc1;
    }

    public void setPerc1(BigDecimal perc1) {
        this.perc1 = perc1;
    }

    public BigDecimal getPerc1k() {
        return perc1k;
    }

    public void setPerc1k(BigDecimal perc1k) {
        this.perc1k = perc1k;
    }

    public BigDecimal getPerc1s() {
        return perc1s;
    }

    public void setPerc1s(BigDecimal perc1s) {
        this.perc1s = perc1s;
    }

    public BigDecimal getPerc1ks() {
        return perc1ks;
    }

    public void setPerc1ks(BigDecimal perc1ks) {
        this.perc1ks = perc1ks;
    }

    public BigDecimal getPerc2() {
        return perc2;
    }

    public void setPerc2(BigDecimal perc2) {
        this.perc2 = perc2;
    }

    public BigDecimal getPerc2k() {
        return perc2k;
    }

    public void setPerc2k(BigDecimal perc2k) {
        this.perc2k = perc2k;
    }

    public BigDecimal getPerc2s() {
        return perc2s;
    }

    public void setPerc2s(BigDecimal perc2s) {
        this.perc2s = perc2s;
    }

    public BigDecimal getPerc2ks() {
        return perc2ks;
    }

    public void setPerc2ks(BigDecimal perc2ks) {
        this.perc2ks = perc2ks;
    }

    public BigDecimal getPerc3() {
        return perc3;
    }

    public void setPerc3(BigDecimal perc3) {
        this.perc3 = perc3;
    }

    public BigDecimal getPerc3k() {
        return perc3k;
    }

    public void setPerc3k(BigDecimal perc3k) {
        this.perc3k = perc3k;
    }

    public BigDecimal getPerc3s() {
        return perc3s;
    }

    public void setPerc3s(BigDecimal perc3s) {
        this.perc3s = perc3s;
    }

    public BigDecimal getPerc3ks() {
        return perc3ks;
    }

    public void setPerc3ks(BigDecimal perc3ks) {
        this.perc3ks = perc3ks;
    }

    public BigDecimal getPerc4() {
        return perc4;
    }

    public void setPerc4(BigDecimal perc4) {
        this.perc4 = perc4;
    }

    public BigDecimal getPerc4k() {
        return perc4k;
    }

    public void setPerc4k(BigDecimal perc4k) {
        this.perc4k = perc4k;
    }

    public BigDecimal getPerc4s() {
        return perc4s;
    }

    public void setPerc4s(BigDecimal perc4s) {
        this.perc4s = perc4s;
    }

    public BigDecimal getPerc4ks() {
        return perc4ks;
    }

    public void setPerc4ks(BigDecimal perc4ks) {
        this.perc4ks = perc4ks;
    }

}
