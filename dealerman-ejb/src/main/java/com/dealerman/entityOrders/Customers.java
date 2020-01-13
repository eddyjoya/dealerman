/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityOrders;

import com.dealerman.entityConfiguration.CategoryDeudor;
import com.dealerman.entityGeneral.Cantons;
import com.dealerman.entityGeneral.ChainMaster;
import com.dealerman.entityGeneral.Cities;
import com.dealerman.entityGeneral.Contribuyentes;
import com.dealerman.entityGeneral.CreditTerms;
import com.dealerman.entityGeneral.EstadoCivil;
import com.dealerman.entityGeneral.RouteMaster;
import com.dealerman.entityGeneral.Sexo;
import com.dealerman.entityGeneral.Zones;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "customers")
public class Customers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "aplicacion", columnDefinition = "char(1)")
    private String aplicacion;
    @Id
    @Column(name = "customer_id", columnDefinition = "char(13)")
    private String customerId;
    @MapsId("category_id")
    @ManyToOne
    @ForeignKey(name = "FK__customers__300424B4")
    @JoinColumns({
        @JoinColumn(name = "category_id", referencedColumnName = "category_id")
        ,
        @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
    })
    private CategoryDeudor CustomersCatDeudorFK;

    @Column(name = "category_id", columnDefinition = "char(2)", nullable = false)
    private String categoryId;
    @Column(name = "company_name", columnDefinition = "varchar(80)", nullable = true)
    private String companyName;
    @Column(name = "comercial_name", columnDefinition = "varchar(80)", nullable = true)
    private String comercialName;
    @ManyToOne
    @ForeignKey(name = "FK_customers_chain_master")
    @JoinColumn(name = "chain_code", referencedColumnName = "chain_code")
    private ChainMaster chainMaster;
    @ManyToOne
    @ForeignKey(name = "FK_customers_route_master")
    @JoinColumn(name = "route_code", referencedColumnName = "route_code")
    private RouteMaster routeMaster;
    @Column(name = "province_id", columnDefinition = "char(2)", nullable = true)
    private String provinceId;
    @Column(name = "canton_id", columnDefinition = "char(3)", nullable = true)
    private String cantonId;
    @Column(name = "city_id", columnDefinition = "char(3)", nullable = true)
    private String cityId;
    @ManyToOne
    @ForeignKey(name = "FK__customers__sexo__2C3393D0")
    @JoinColumn(name = "sexo", referencedColumnName = "sexo")
    private Sexo sexo;
    @ManyToOne
    @ForeignKey(name = "FK__customers__est_c__2D27B809")
    @JoinColumn(name = "est_civil", referencedColumnName = "est_civil")
    private EstadoCivil estadoCivil;
    @Column(name = "rep_legal", columnDefinition = "varchar(56)", nullable = true)
    private String repLegal;
    @Column(name = "contact_title", columnDefinition = "varchar(40)", nullable = true)
    private String contactTitle;
    @Column(name = "address", columnDefinition = "varchar(75)", nullable = true)
    private String address;
    @Column(name = "city", columnDefinition = "varchar(21)", nullable = true)
    private String city;
    @Column(name = "region", columnDefinition = "varchar(15)", nullable = true)
    private String region;
    @Column(name = "postal_code", columnDefinition = "varchar(10)", nullable = true)
    private String postalCode;
    @Column(name = "country", columnDefinition = "varchar(15)", nullable = true)
    private String country;
    @Column(name = "phone", columnDefinition = "varchar(36)", nullable = true)
    private String phone;
    @Column(name = "fax", columnDefinition = "varchar(24)", nullable = true)
    private String fax;
    @Column(name = "e_maile", columnDefinition = "text", nullable = true)
    private String eMaile;
    @Column(name = "e_mail1", columnDefinition = "text", nullable = true)
    private String eMail1;
    @Column(name = "e_mail2", columnDefinition = "text", nullable = true)
    private String eMail2;
    @Column(name = "description", columnDefinition = "text", nullable = true)
    private String description;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "max_order_amt", columnDefinition = "money", nullable = false)
    private BigDecimal maxOrderAmt;
    @Column(name = "min_order_amt", columnDefinition = "money", nullable = false)
    private BigDecimal minOrderAmt;
    @Column(name = "price_type", columnDefinition = "tinyint", nullable = false)
    private BigDecimal priceType;
    @Column(name = "discount", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal discount;
    @Column(name = "sales_region", columnDefinition = "varchar(4)", nullable = true)
    private String salesRegion;
    @ManyToOne
    @ForeignKey(name = "FK__customers__zone___31EC6D26")
    @JoinColumn(name = "zone_id", referencedColumnName = "zone_id")
    private Zones zone;
    @Column(name = "sub_zone", columnDefinition = "varchar(2)", nullable = true)
    private String subZone;
    @Column(name = "cedula", columnDefinition = "varchar(13)", nullable = true)
    private String cedula;
    @Column(name = "car_number", columnDefinition = "tinyint", nullable = false)
    private BigDecimal carNumber;
    @ManyToOne
    @ForeignKey(name = "FK__customers__credi__2F10007B")
    @JoinColumn(name = "credit_term_id", referencedColumnName = "credit_term_id")
    private CreditTerms creditTerms;
    @ManyToOne
    @ForeignKey(name = "FK__customers__sales__30F848ED")
    @JoinColumn(name = "salesman_id", referencedColumnName = "salesman_id")
    private Salesmen salesmen;
    @Column(name = "pay_tax", columnDefinition = "bit", nullable = true)
    private Boolean payTax;
    @Column(name = "birthdate", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(name = "spouse", columnDefinition = "varchar(35)", nullable = true)
    private String spouse;
    @Column(name = "dollars_debt", columnDefinition = "money", nullable = false)
    private BigDecimal dollarsDebt;
    @Column(name = "employee_id", columnDefinition = "char(6)", nullable = false)
    private String employeeId;
    @Column(name = "created", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @ManyToOne
    @ForeignKey(name = "FK__customers__suppt__2E1BDC42")
    @JoinColumn(name = "supptype", referencedColumnName = "supptype")
    private Contribuyentes contribuyente;
    @Column(name = "supplier_terms", columnDefinition = "tinyint", nullable = true)
    private BigDecimal supplierTerms;
    @Column(name = "credit_card", columnDefinition = "bit", nullable = true)
    private Boolean creditCard;
    @Column(name = "ctype", columnDefinition = "tinyint", nullable = true)
    private BigDecimal ctype;
    @Column(name = "local_id", columnDefinition = "varchar(3)", nullable = true)
    private String localId;
    @Column(name = "issue_id", columnDefinition = "varchar(3)", nullable = true)
    private String issueId;
    @Column(name = "autorizacion", columnDefinition = "varchar(10)", nullable = true)
    private String autorizacion;
    @Column(name = "valid_to", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date validTo;
    @Column(name = "minimun", columnDefinition = "tinyint", nullable = false)
    private BigDecimal minimun;
    @Column(name = "maximun", columnDefinition = "tinyint", nullable = false)
    private BigDecimal maximun;
    @Column(name = "demanda", columnDefinition = "tinyint", nullable = false)
    private BigDecimal demanda;
    @Column(name = "unlocked", columnDefinition = "bit", nullable = true)
    private Boolean unlocked;
    @Column(name = "company", columnDefinition = "bit", nullable = true)
    private Boolean company;
    @Column(name = "cedula1", columnDefinition = "varchar(13)", nullable = true)
    private String cedula1;
    @Column(name = "bank_type", columnDefinition = "char(1)", nullable = true)
    private String bankType;
    @Column(name = "bank_id", columnDefinition = "varchar(2)", nullable = true)
    private String bankId;
    @Column(name = "bank_account", columnDefinition = "varchar(12)", nullable = true)
    private String bankAccount;
    @Column(name = "passport", columnDefinition = "bit", nullable = true)
    private Boolean passport;
    @Column(name = "comp_id", columnDefinition = "varchar(2)", nullable = true)
    private String compId;
    @Column(name = "sustento_id", columnDefinition = "varchar(3)", nullable = true)
    private String sustentoId;
    @Column(name = "ship_to_no", columnDefinition = "tinyint", nullable = false)
    private BigDecimal shipToNo;

    @MapsId("province_id")
    @ManyToOne
    @ForeignKey(name = "FK_customers_cantons")
    @JoinColumns({
        @JoinColumn(name = "province_id", referencedColumnName = "province_id")
        ,
        @JoinColumn(name = "canton_id", referencedColumnName = "canton_id")
    })
    private Cantons CantonsProvinceFK;
    @MapsId("city_id")
    @ManyToOne
    @ForeignKey(name = "FK_customers_cities")
    @JoinColumns({
        @JoinColumn(name = "province_id", referencedColumnName = "province_id")
        ,
        @JoinColumn(name = "canton_id", referencedColumnName = "canton_id")
        ,
          @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    })
    private Cities citiesFK;

    public Customers() {
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getComercialName() {
        return comercialName;
    }

    public void setComercialName(String comercialName) {
        this.comercialName = comercialName;
    }

    public ChainMaster getChainMaster() {
        return chainMaster;
    }

    public void setChainMaster(ChainMaster chainMaster) {
        this.chainMaster = chainMaster;
    }

    public RouteMaster getRouteMaster() {
        return routeMaster;
    }

    public void setRouteMaster(RouteMaster routeMaster) {
        this.routeMaster = routeMaster;
    }

    public CategoryDeudor getCustomersCatDeudorFK() {
        return CustomersCatDeudorFK;
    }

    public void setCustomersCatDeudorFK(CategoryDeudor CustomersCatDeudorFK) {
        this.CustomersCatDeudorFK = CustomersCatDeudorFK;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCantonId() {
        return cantonId;
    }

    public void setCantonId(String cantonId) {
        this.cantonId = cantonId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getRepLegal() {
        return repLegal;
    }

    public void setRepLegal(String repLegal) {
        this.repLegal = repLegal;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
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

    public String getCedula1() {
        return cedula1;
    }

    public void setCedula1(String cedula1) {
        this.cedula1 = cedula1;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Boolean getPassport() {
        return passport;
    }

    public void setPassport(Boolean passport) {
        this.passport = passport;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getSustentoId() {
        return sustentoId;
    }

    public void setSustentoId(String sustentoId) {
        this.sustentoId = sustentoId;
    }

    public BigDecimal getShipToNo() {
        return shipToNo;
    }

    public void setShipToNo(BigDecimal shipToNo) {
        this.shipToNo = shipToNo;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String geteMaile() {
        return eMaile;
    }

    public void seteMaile(String eMaile) {
        this.eMaile = eMaile;
    }

    public String geteMail1() {
        return eMail1;
    }

    public void seteMail1(String eMail1) {
        this.eMail1 = eMail1;
    }

    public String geteMail2() {
        return eMail2;
    }

    public void seteMail2(String eMail2) {
        this.eMail2 = eMail2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public BigDecimal getMaxOrderAmt() {
        return maxOrderAmt;
    }

    public void setMaxOrderAmt(BigDecimal maxOrderAmt) {
        this.maxOrderAmt = maxOrderAmt;
    }

    public BigDecimal getMinOrderAmt() {
        return minOrderAmt;
    }

    public void setMinOrderAmt(BigDecimal minOrderAmt) {
        this.minOrderAmt = minOrderAmt;
    }

    public BigDecimal getPriceType() {
        return priceType;
    }

    public void setPriceType(BigDecimal priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getSalesRegion() {
        return salesRegion;
    }

    public void setSalesRegion(String salesRegion) {
        this.salesRegion = salesRegion;
    }

    public Zones getZone() {
        return zone;
    }

    public void setZone(Zones zone) {
        this.zone = zone;
    }

    public String getSubZone() {
        return subZone;
    }

    public void setSubZone(String subZone) {
        this.subZone = subZone;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public BigDecimal getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(BigDecimal carNumber) {
        this.carNumber = carNumber;
    }

    public CreditTerms getCreditTerms() {
        return creditTerms;
    }

    public void setCreditTerms(CreditTerms creditTerms) {
        this.creditTerms = creditTerms;
    }

    public Salesmen getSalesmen() {
        return salesmen;
    }

    public void setSalesmen(Salesmen salesmen) {
        this.salesmen = salesmen;
    }

    public Boolean getPayTax() {
        return payTax;
    }

    public void setPayTax(Boolean payTax) {
        this.payTax = payTax;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public BigDecimal getDollarsDebt() {
        return dollarsDebt;
    }

    public void setDollarsDebt(BigDecimal dollarsDebt) {
        this.dollarsDebt = dollarsDebt;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public Contribuyentes getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyentes contribuyente) {
        this.contribuyente = contribuyente;
    }

    public BigDecimal getSupplierTerms() {
        return supplierTerms;
    }

    public void setSupplierTerms(BigDecimal supplierTerms) {
        this.supplierTerms = supplierTerms;
    }

    public Boolean getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Boolean creditCard) {
        this.creditCard = creditCard;
    }

    public BigDecimal getCtype() {
        return ctype;
    }

    public void setCtype(BigDecimal ctype) {
        this.ctype = ctype;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public BigDecimal getMinimun() {
        return minimun;
    }

    public void setMinimun(BigDecimal minimun) {
        this.minimun = minimun;
    }

    public BigDecimal getMaximun() {
        return maximun;
    }

    public void setMaximun(BigDecimal maximun) {
        this.maximun = maximun;
    }

    public BigDecimal getDemanda() {
        return demanda;
    }

    public void setDemanda(BigDecimal demanda) {
        this.demanda = demanda;
    }

    public Boolean getUnlocked() {
        return unlocked;
    }

    public void setUnlocked(Boolean unlocked) {
        this.unlocked = unlocked;
    }

    public Boolean getCompany() {
        return company;
    }

    public void setCompany(Boolean company) {
        this.company = company;
    }

    public Cantons getCantonsProvinceFK() {
        return CantonsProvinceFK;
    }

    public void setCantonsProvinceFK(Cantons CantonsProvinceFK) {
        this.CantonsProvinceFK = CantonsProvinceFK;
    }

    public Cities getCitiesFK() {
        return citiesFK;
    }

    public void setCitiesFK(Cities citiesFK) {
        this.citiesFK = citiesFK;
    }

}
