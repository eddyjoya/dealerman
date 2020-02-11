package com.dealerman.orders;

import com.dealerman.configuration.CategoryDeudor;
import com.dealerman.configuration.Employee;
import com.dealerman.general.Branches;
import com.dealerman.general.Cantons;
import com.dealerman.general.ChainMaster;
import com.dealerman.general.Cities;
import com.dealerman.general.Contribuyentes;
import com.dealerman.general.CreditTerms;
import com.dealerman.general.EstadoCivil;
import com.dealerman.general.RouteMaster;
import com.dealerman.general.Sexo;
import com.dealerman.general.Zones;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Email;

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
    @Column(name = "aplicacion", columnDefinition = "char(1)", nullable = false)
    private String aplicacion;
    @Id
    @Column(name = "customer_id", columnDefinition = "char(13)", nullable = false)
    private String customerId;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @ForeignKey(name = "FK__customers__300424B4")
    @JoinColumns({
        @JoinColumn(name = "category_id", referencedColumnName = "category_id")
        ,
        @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
    })
    private CategoryDeudor categoryDeudor;

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

    @Column(name = "contact_name", columnDefinition = "varchar(30)", nullable = true)
    private String contactName;
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
    @Email
    @Column(name = "e_maile", columnDefinition = "text", nullable = true)
    private String eMail;
    @Email
    @Column(name = "e_mail1", columnDefinition = "text", nullable = true)
    private String eMail1;
    @Email
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

    @ManyToOne
    @ForeignKey(name = "FK_customers_cantons")
    @JoinColumns({
        @JoinColumn(name = "province_id", referencedColumnName = "province_id", insertable = false, updatable = false)
        ,
        @JoinColumn(name = "canton_id", referencedColumnName = "canton_id", insertable = false, updatable = false)
    })
    private Cantons CantonsProvinceFK;

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

    @Transient
    private Branches branchSelect;
    @Transient
    private Employee employeeSelect;

    public Customers() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.companyId);
        hash = 29 * hash + Objects.hashCode(this.aplicacion);
        hash = 29 * hash + Objects.hashCode(this.customerId);
        hash = 29 * hash + Objects.hashCode(this.categoryDeudor);
        hash = 29 * hash + Objects.hashCode(this.companyName);
        hash = 29 * hash + Objects.hashCode(this.comercialName);
        hash = 29 * hash + Objects.hashCode(this.chainMaster);
        hash = 29 * hash + Objects.hashCode(this.routeMaster);
        hash = 29 * hash + Objects.hashCode(this.contactName);
        hash = 29 * hash + Objects.hashCode(this.sexo);
        hash = 29 * hash + Objects.hashCode(this.estadoCivil);
        hash = 29 * hash + Objects.hashCode(this.repLegal);
        hash = 29 * hash + Objects.hashCode(this.contactTitle);
        hash = 29 * hash + Objects.hashCode(this.address);
        hash = 29 * hash + Objects.hashCode(this.city);
        hash = 29 * hash + Objects.hashCode(this.region);
        hash = 29 * hash + Objects.hashCode(this.postalCode);
        hash = 29 * hash + Objects.hashCode(this.country);
        hash = 29 * hash + Objects.hashCode(this.phone);
        hash = 29 * hash + Objects.hashCode(this.fax);
        hash = 29 * hash + Objects.hashCode(this.eMail);
        hash = 29 * hash + Objects.hashCode(this.eMail1);
        hash = 29 * hash + Objects.hashCode(this.eMail2);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.discontinued);
        hash = 29 * hash + Objects.hashCode(this.maxOrderAmt);
        hash = 29 * hash + Objects.hashCode(this.minOrderAmt);
        hash = 29 * hash + Objects.hashCode(this.priceType);
        hash = 29 * hash + Objects.hashCode(this.discount);
        hash = 29 * hash + Objects.hashCode(this.salesRegion);
        hash = 29 * hash + Objects.hashCode(this.zone);
        hash = 29 * hash + Objects.hashCode(this.subZone);
        hash = 29 * hash + Objects.hashCode(this.cedula);
        hash = 29 * hash + Objects.hashCode(this.carNumber);
        hash = 29 * hash + Objects.hashCode(this.creditTerms);
        hash = 29 * hash + Objects.hashCode(this.salesmen);
        hash = 29 * hash + Objects.hashCode(this.payTax);
        hash = 29 * hash + Objects.hashCode(this.birthDate);
        hash = 29 * hash + Objects.hashCode(this.spouse);
        hash = 29 * hash + Objects.hashCode(this.dollarsDebt);
        hash = 29 * hash + Objects.hashCode(this.employeeId);
        hash = 29 * hash + Objects.hashCode(this.created);
        hash = 29 * hash + Objects.hashCode(this.added);
        hash = 29 * hash + Objects.hashCode(this.modified);
        hash = 29 * hash + Objects.hashCode(this.contribuyente);
        hash = 29 * hash + Objects.hashCode(this.supplierTerms);
        hash = 29 * hash + Objects.hashCode(this.creditCard);
        hash = 29 * hash + Objects.hashCode(this.ctype);
        hash = 29 * hash + Objects.hashCode(this.localId);
        hash = 29 * hash + Objects.hashCode(this.issueId);
        hash = 29 * hash + Objects.hashCode(this.autorizacion);
        hash = 29 * hash + Objects.hashCode(this.validTo);
        hash = 29 * hash + Objects.hashCode(this.minimun);
        hash = 29 * hash + Objects.hashCode(this.maximun);
        hash = 29 * hash + Objects.hashCode(this.demanda);
        hash = 29 * hash + Objects.hashCode(this.unlocked);
        hash = 29 * hash + Objects.hashCode(this.company);
        hash = 29 * hash + Objects.hashCode(this.cedula1);
        hash = 29 * hash + Objects.hashCode(this.bankType);
        hash = 29 * hash + Objects.hashCode(this.bankId);
        hash = 29 * hash + Objects.hashCode(this.bankAccount);
        hash = 29 * hash + Objects.hashCode(this.passport);
        hash = 29 * hash + Objects.hashCode(this.compId);
        hash = 29 * hash + Objects.hashCode(this.sustentoId);
        hash = 29 * hash + Objects.hashCode(this.shipToNo);
        hash = 29 * hash + Objects.hashCode(this.CantonsProvinceFK);
        hash = 29 * hash + Objects.hashCode(this.citiesFK);
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
        final Customers other = (Customers) obj;
        if (!Objects.equals(this.companyId, other.companyId)) {
            return false;
        }
        if (!Objects.equals(this.aplicacion, other.aplicacion)) {
            return false;
        }
        if (!Objects.equals(this.customerId, other.customerId)) {
            return false;
        }
        if (!Objects.equals(this.companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(this.comercialName, other.comercialName)) {
            return false;
        }
        if (!Objects.equals(this.contactName, other.contactName)) {
            return false;
        }
        if (!Objects.equals(this.repLegal, other.repLegal)) {
            return false;
        }
        if (!Objects.equals(this.contactTitle, other.contactTitle)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.region, other.region)) {
            return false;
        }
        if (!Objects.equals(this.postalCode, other.postalCode)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.fax, other.fax)) {
            return false;
        }
        if (!Objects.equals(this.eMail, other.eMail)) {
            return false;
        }
        if (!Objects.equals(this.eMail1, other.eMail1)) {
            return false;
        }
        if (!Objects.equals(this.eMail2, other.eMail2)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.salesRegion, other.salesRegion)) {
            return false;
        }
        if (!Objects.equals(this.subZone, other.subZone)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.spouse, other.spouse)) {
            return false;
        }
        if (!Objects.equals(this.employeeId, other.employeeId)) {
            return false;
        }
        if (!Objects.equals(this.localId, other.localId)) {
            return false;
        }
        if (!Objects.equals(this.issueId, other.issueId)) {
            return false;
        }
        if (!Objects.equals(this.autorizacion, other.autorizacion)) {
            return false;
        }
        if (!Objects.equals(this.cedula1, other.cedula1)) {
            return false;
        }
        if (!Objects.equals(this.bankType, other.bankType)) {
            return false;
        }
        if (!Objects.equals(this.bankId, other.bankId)) {
            return false;
        }
        if (!Objects.equals(this.bankAccount, other.bankAccount)) {
            return false;
        }
        if (!Objects.equals(this.compId, other.compId)) {
            return false;
        }
        if (!Objects.equals(this.sustentoId, other.sustentoId)) {
            return false;
        }
        if (!Objects.equals(this.categoryDeudor, other.categoryDeudor)) {
            return false;
        }
        if (!Objects.equals(this.chainMaster, other.chainMaster)) {
            return false;
        }
        if (!Objects.equals(this.routeMaster, other.routeMaster)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.estadoCivil, other.estadoCivil)) {
            return false;
        }
        if (!Objects.equals(this.discontinued, other.discontinued)) {
            return false;
        }
        if (!Objects.equals(this.maxOrderAmt, other.maxOrderAmt)) {
            return false;
        }
        if (!Objects.equals(this.minOrderAmt, other.minOrderAmt)) {
            return false;
        }
        if (!Objects.equals(this.priceType, other.priceType)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        if (!Objects.equals(this.zone, other.zone)) {
            return false;
        }
        if (!Objects.equals(this.carNumber, other.carNumber)) {
            return false;
        }
        if (!Objects.equals(this.creditTerms, other.creditTerms)) {
            return false;
        }
        if (!Objects.equals(this.salesmen, other.salesmen)) {
            return false;
        }
        if (!Objects.equals(this.payTax, other.payTax)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Objects.equals(this.dollarsDebt, other.dollarsDebt)) {
            return false;
        }
        if (!Objects.equals(this.created, other.created)) {
            return false;
        }
        if (!Objects.equals(this.added, other.added)) {
            return false;
        }
        if (!Objects.equals(this.modified, other.modified)) {
            return false;
        }
        if (!Objects.equals(this.contribuyente, other.contribuyente)) {
            return false;
        }
        if (!Objects.equals(this.supplierTerms, other.supplierTerms)) {
            return false;
        }
        if (!Objects.equals(this.creditCard, other.creditCard)) {
            return false;
        }
        if (!Objects.equals(this.ctype, other.ctype)) {
            return false;
        }
        if (!Objects.equals(this.validTo, other.validTo)) {
            return false;
        }
        if (!Objects.equals(this.minimun, other.minimun)) {
            return false;
        }
        if (!Objects.equals(this.maximun, other.maximun)) {
            return false;
        }
        if (!Objects.equals(this.demanda, other.demanda)) {
            return false;
        }
        if (!Objects.equals(this.unlocked, other.unlocked)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.passport, other.passport)) {
            return false;
        }
        if (!Objects.equals(this.shipToNo, other.shipToNo)) {
            return false;
        }
        if (!Objects.equals(this.CantonsProvinceFK, other.CantonsProvinceFK)) {
            return false;
        }
        return Objects.equals(this.citiesFK, other.citiesFK);
    }

    public Customers(String customerId, String cedula, CategoryDeudor categoryDeudor) {
        this.customerId = customerId;
        this.categoryDeudor = categoryDeudor;
        this.cedula = cedula;
    }

    public Customers(String customerId, String companyName, String contactName, CategoryDeudor categoryDeudor) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.categoryDeudor = categoryDeudor;
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

    public CategoryDeudor getCategoryDeudor() {
        return categoryDeudor;
    }

    public void setCategoryDeudor(CategoryDeudor categoryDeudor) {
        this.categoryDeudor = categoryDeudor;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public Employee getEmployeeSelect() {
        return employeeSelect;
    }

    public void setEmployeeSelect(Employee employeeSelect) {
        this.employeeSelect = employeeSelect;
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

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Branches getBranchSelect() {
        return branchSelect;
    }

    public void setBranchSelect(Branches branchSelect) {
        this.branchSelect = branchSelect;
    }

}
