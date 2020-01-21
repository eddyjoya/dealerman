package com.dealerman.configuration;

import java.io.Serializable;
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
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "employee_i", columnDefinition = "char(6)")
    private String employeeId;
    @Column(name = "last_name", columnDefinition = "varchar(20)", nullable = true)
    private String lastName;
    @Column(name = "first_name", columnDefinition = "varchar(10)", nullable = true)
    private String firstName;
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
    @Column(name = "country", columnDefinition = "varchar(15)", nullable = true)
    private String country;
    @Column(name = "home_phone", columnDefinition = "varchar(24)", nullable = true)
    private String home_phone;
    @Column(name = "extension", columnDefinition = "varchar(4)", nullable = true)
    private String extension;
    @Column(name = "group_id", columnDefinition = "char(6)", nullable = true)
    private String groupId;
    @Column(name = "sales_regi", columnDefinition = "char(4)", nullable = true)
    private String salesRegi;
    @Column(name = "password", columnDefinition = "char(8)", nullable = false)
    private String password;
    @Column(name = "photo_file", columnDefinition = "text", nullable = true)
    private String photoFile;
    @Column(name = "notes", columnDefinition = "text", nullable = true)
    private String notes;
    @Column(name = "photo", columnDefinition = "text", nullable = true)
    private String photo;
    @Column(name = "salesman_i", columnDefinition = "char(5)", nullable = true)
    private String salesmanI;
    @Column(name = "company_id", columnDefinition = "char(2)", nullable = true)
    private String companyId;
    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = false)
    private String branchId;
    @Column(name = "allowed", columnDefinition = "bit", nullable = false)
    private Boolean allowed;
    @Column(name = "price_rest", columnDefinition = "bit", nullable = false)
    private Boolean priceRest;
    @Column(name = "uprice1", columnDefinition = "bit", nullable = false)
    private Boolean uprice1;
    @Column(name = "uprice2", columnDefinition = "bit", nullable = false)
    private Boolean uprice2;
    @Column(name = "uprice3", columnDefinition = "bit", nullable = false)
    private Boolean uprice3;
    @Column(name = "uprice4", columnDefinition = "bit", nullable = false)
    private Boolean uprice4;
    @Column(name = "not_log", columnDefinition = "bit", nullable = true)
    private Boolean notLog;
    @Column(name = "F6", columnDefinition = "bit", nullable = true)
    private Boolean F6;
    @Column(name = "customer_id", columnDefinition = "char(13)", nullable = true)
    private String customerId;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getHome_phone() {
        return home_phone;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
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

    public String getSalesRegi() {
        return salesRegi;
    }

    public void setSalesRegi(String salesRegi) {
        this.salesRegi = salesRegi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoFile() {
        return photoFile;
    }

    public void setPhotoFile(String photoFile) {
        this.photoFile = photoFile;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSalesmanI() {
        return salesmanI;
    }

    public void setSalesmanI(String salesmanI) {
        this.salesmanI = salesmanI;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public Boolean getAllowed() {
        return allowed;
    }

    public void setAllowed(Boolean allowed) {
        this.allowed = allowed;
    }

    public Boolean getPriceRest() {
        return priceRest;
    }

    public void setPriceRest(Boolean priceRest) {
        this.priceRest = priceRest;
    }

    public Boolean getUprice1() {
        return uprice1;
    }

    public void setUprice1(Boolean uprice1) {
        this.uprice1 = uprice1;
    }

    public Boolean getUprice2() {
        return uprice2;
    }

    public void setUprice2(Boolean uprice2) {
        this.uprice2 = uprice2;
    }

    public Boolean getUprice3() {
        return uprice3;
    }

    public void setUprice3(Boolean uprice3) {
        this.uprice3 = uprice3;
    }

    public Boolean getUprice4() {
        return uprice4;
    }

    public void setUprice4(Boolean uprice4) {
        this.uprice4 = uprice4;
    }

    public Boolean getNotLog() {
        return notLog;
    }

    public void setNotLog(Boolean notLog) {
        this.notLog = notLog;
    }

    public Boolean getF6() {
        return F6;
    }

    public void setF6(Boolean F6) {
        this.F6 = F6;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
