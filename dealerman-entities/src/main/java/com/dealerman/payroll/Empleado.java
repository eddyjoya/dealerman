/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.payroll;

import com.dealerman.general.Banks;
import com.dealerman.general.Company;
import com.dealerman.general.Regional;
import com.dealerman.production.CostCenters;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
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
@Table(name = "empleado")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @ManyToOne
    @ForeignKey(name = "FK__empleado__compan__5AEE82B9")
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    private Company company;
    @Id
    @Column(name = "employee_id", columnDefinition = "char(6)")
    private String employeeId;
    @Column(name = "biomet_id", columnDefinition = "nchar(10)", nullable = true)
    private String biometId;
    @ManyToOne
    @ForeignKey(name = "FK_empleado_cost_centers")
    @JoinColumn(name = "job_id", referencedColumnName = "job_id")
    private CostCenters costCenter;
    @ManyToOne
    @ForeignKey(name = "FK__empleado__dept_i__5CD6CB2B")
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
    private Deptment deptment;
    @Column(name = "last_name", columnDefinition = "varchar(20)", nullable = true)
    private String lastName;
    @Column(name = "first_name", columnDefinition = "varchar(20)", nullable = true)
    private String firstName;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "title", columnDefinition = "varchar(35)", nullable = true)
    private String title;
    @Column(name = "title_code", columnDefinition = "varchar(13)", nullable = true)
    private String titleCode;
    @Column(name = "birth_date", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date birthDate;
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
    @Column(name = "other_phone", columnDefinition = "varchar(24)", nullable = true)
    private String otherPhone;
    @Column(name = "photo_file", columnDefinition = "text", nullable = true)
    private String photoFile;
    @Column(name = "notes", columnDefinition = "text", nullable = true, length = Integer.MAX_VALUE)
    private String notes;
    @Lob
    @Column(name = "photo", columnDefinition = "image", nullable = true)
    private byte[] photo;
    @Column(name = "cedula", columnDefinition = "varchar(10)", nullable = true)
    private String cedula;
    @Column(name = "afiliacion", columnDefinition = "varchar(13)", nullable = true)
    private String afiliacion;
    @Column(name = "journey_from", columnDefinition = "numeric(4,2)", nullable = true)
    private BigDecimal journeyFrom;
    @Column(name = "journey_to", columnDefinition = "numeric(4,2)", nullable = true)
    private BigDecimal journeyTo;
    @Column(name = "extra_hours", columnDefinition = "numeric(3,2)", nullable = true)
    private BigDecimal extraHours;
    @Column(name = "regional_id", columnDefinition = "char(1)", nullable = false)
    private String regionalId;
    @Column(name = "aportaiess", columnDefinition = "bit", nullable = true)
    private Boolean aportaiess;
    @Column(name = "aportaconyugue", columnDefinition = "bit", nullable = true)
    private Boolean aportaConyugue;
    @Column(name = "bank_type", columnDefinition = "char(1)", nullable = true)
    private String bankType;
    @Column(name = "bank_account", columnDefinition = "varchar(12)", nullable = true)
    private String bankAccount;
    @Column(name = "hire_date", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date hireDate;
    @Column(name = "other_date", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date otherDate;
    @Column(name = "sueldo", columnDefinition = "money", nullable = true)
    private BigDecimal sueldo;
    @Column(name = "subfam", columnDefinition = "money", nullable = true)
    private BigDecimal subfam;
    @Column(name = "subant", columnDefinition = "money", nullable = true)
    private BigDecimal subant;
    @Column(name = "responsab", columnDefinition = "money", nullable = true)
    private BigDecimal responsab;
    @Column(name = "moviliza", columnDefinition = "money", nullable = true)
    private BigDecimal moviliza;
    @Column(name = "gastos", columnDefinition = "money", nullable = true)
    private BigDecimal gastos;
    @Column(name = "csalarial", columnDefinition = "money", nullable = true)
    private BigDecimal csalarial;
    @Column(name = "porant", columnDefinition = "money", nullable = true)
    private BigDecimal porant;
    @Column(name = "valant", columnDefinition = "money", nullable = true)
    private BigDecimal valant;
    @Column(name = "prestaies", columnDefinition = "money", nullable = true)
    private BigDecimal prestaies;
    @Column(name = "totpempre", columnDefinition = "money", nullable = true)
    private BigDecimal totpempre;
    @Column(name = "ncuoempre", columnDefinition = "numeric(2)", nullable = true)
    private Integer ncuoempre;
    @Column(name = "prestaemp", columnDefinition = "money", nullable = true)
    private BigDecimal prestaemp;
    @Column(name = "afpgenesis", columnDefinition = "money", nullable = true)
    private BigDecimal afpgenesis;
    @Column(name = "invalidez", columnDefinition = "money", nullable = true)
    private BigDecimal invalidez;
    @Column(name = "segvehic", columnDefinition = "money", nullable = true)
    private BigDecimal segvehic;
    @Column(name = "supermaxi", columnDefinition = "money", nullable = true)
    private BigDecimal supermaxi;
    @Column(name = "diners", columnDefinition = "money", nullable = true)
    private BigDecimal diners;
    @Column(name = "fr_mensual", columnDefinition = "bit", nullable = true)
    private Boolean frMensual;
    @Column(name = "mensual_13", columnDefinition = "bit", nullable = true)
    private Boolean mensual_13;
    @Column(name = "mensual_14", columnDefinition = "bit", nullable = true)
    private Boolean mensual_14;
    @Column(name = "salida", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date salida;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @Column(name = "sexo", columnDefinition = "tinyint", nullable = true)
    private Integer sexo;
    @Column(name = "est_civil", columnDefinition = "tinyint", nullable = true)
    private Integer estCivil;
    @Column(name = "carg_fam", columnDefinition = "tinyint", nullable = true)
    private Integer cargFam;
    @Column(name = "estado", columnDefinition = "char(1)", nullable = true)
    private String estado;
    @Column(name = "celular", columnDefinition = "varchar(10)", nullable = true)
    private String celular;
    @ManyToOne
    @ForeignKey(name = "FK__empleado__bank_i__59FA5E80")
    @JoinColumn(name = "bank_id", referencedColumnName = "bank_id")
    private Banks bank;
    @Column(name = "no_decimos", columnDefinition = "bit", nullable = true)
    private Boolean noDecimos;
    @Column(name = "sw1", columnDefinition = "bit", nullable = true)
    private Boolean sw1;
    @Column(name = "sw2", columnDefinition = "bit", nullable = true)
    private Boolean sw2;
    @Column(name = "sw3", columnDefinition = "bit", nullable = true)
    private Boolean sw3;
    @Column(name = "sw4", columnDefinition = "bit", nullable = true)
    private Boolean sw4;
    @Column(name = "sw5", columnDefinition = "bit", nullable = true)
    private Boolean sw5;
    @Column(name = "sw6", columnDefinition = "bit", nullable = true)
    private Boolean sw6;
    @Column(name = "sw7", columnDefinition = "bit", nullable = true)
    private Boolean sw7;
    @Column(name = "sw8", columnDefinition = "bit", nullable = true)
    private Boolean sw8;
    @Column(name = "sw9", columnDefinition = "bit", nullable = true)
    private Boolean sw9;
    @Column(name = "customer_id", columnDefinition = "char(13)", nullable = true)
    private String customerId;
    @MapsId("regional_id")
    @ManyToOne
    @ForeignKey(name = "FK__empleado__5BE2A6F2")
    @JoinColumns({
        @JoinColumn(name = "company_id", referencedColumnName = "company_id")
        ,
        @JoinColumn(name = "regional_id", referencedColumnName = "regional_id")
    })
    private Regional regional;

    public Empleado() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.company);
        hash = 47 * hash + Objects.hashCode(this.employeeId);
        hash = 47 * hash + Objects.hashCode(this.biometId);
        hash = 47 * hash + Objects.hashCode(this.costCenter);
        hash = 47 * hash + Objects.hashCode(this.deptment);
        hash = 47 * hash + Objects.hashCode(this.lastName);
        hash = 47 * hash + Objects.hashCode(this.firstName);
        hash = 47 * hash + Objects.hashCode(this.discontinued);
        hash = 47 * hash + Objects.hashCode(this.title);
        hash = 47 * hash + Objects.hashCode(this.titleCode);
        hash = 47 * hash + Objects.hashCode(this.birthDate);
        hash = 47 * hash + Objects.hashCode(this.address);
        hash = 47 * hash + Objects.hashCode(this.city);
        hash = 47 * hash + Objects.hashCode(this.region);
        hash = 47 * hash + Objects.hashCode(this.postalCode);
        hash = 47 * hash + Objects.hashCode(this.country);
        hash = 47 * hash + Objects.hashCode(this.home_phone);
        hash = 47 * hash + Objects.hashCode(this.extension);
        hash = 47 * hash + Objects.hashCode(this.otherPhone);
        hash = 47 * hash + Objects.hashCode(this.photoFile);
        hash = 47 * hash + Objects.hashCode(this.notes);
        hash = 47 * hash + Arrays.hashCode(this.photo);
        hash = 47 * hash + Objects.hashCode(this.cedula);
        hash = 47 * hash + Objects.hashCode(this.afiliacion);
        hash = 47 * hash + Objects.hashCode(this.journeyFrom);
        hash = 47 * hash + Objects.hashCode(this.journeyTo);
        hash = 47 * hash + Objects.hashCode(this.extraHours);
        hash = 47 * hash + Objects.hashCode(this.regionalId);
        hash = 47 * hash + Objects.hashCode(this.aportaiess);
        hash = 47 * hash + Objects.hashCode(this.aportaConyugue);
        hash = 47 * hash + Objects.hashCode(this.bankType);
        hash = 47 * hash + Objects.hashCode(this.bankAccount);
        hash = 47 * hash + Objects.hashCode(this.hireDate);
        hash = 47 * hash + Objects.hashCode(this.otherDate);
        hash = 47 * hash + Objects.hashCode(this.sueldo);
        hash = 47 * hash + Objects.hashCode(this.subfam);
        hash = 47 * hash + Objects.hashCode(this.subant);
        hash = 47 * hash + Objects.hashCode(this.responsab);
        hash = 47 * hash + Objects.hashCode(this.moviliza);
        hash = 47 * hash + Objects.hashCode(this.gastos);
        hash = 47 * hash + Objects.hashCode(this.csalarial);
        hash = 47 * hash + Objects.hashCode(this.porant);
        hash = 47 * hash + Objects.hashCode(this.valant);
        hash = 47 * hash + Objects.hashCode(this.prestaies);
        hash = 47 * hash + Objects.hashCode(this.totpempre);
        hash = 47 * hash + Objects.hashCode(this.ncuoempre);
        hash = 47 * hash + Objects.hashCode(this.prestaemp);
        hash = 47 * hash + Objects.hashCode(this.afpgenesis);
        hash = 47 * hash + Objects.hashCode(this.invalidez);
        hash = 47 * hash + Objects.hashCode(this.segvehic);
        hash = 47 * hash + Objects.hashCode(this.supermaxi);
        hash = 47 * hash + Objects.hashCode(this.diners);
        hash = 47 * hash + Objects.hashCode(this.frMensual);
        hash = 47 * hash + Objects.hashCode(this.mensual_13);
        hash = 47 * hash + Objects.hashCode(this.mensual_14);
        hash = 47 * hash + Objects.hashCode(this.salida);
        hash = 47 * hash + Objects.hashCode(this.added);
        hash = 47 * hash + Objects.hashCode(this.modified);
        hash = 47 * hash + Objects.hashCode(this.sexo);
        hash = 47 * hash + Objects.hashCode(this.estCivil);
        hash = 47 * hash + Objects.hashCode(this.cargFam);
        hash = 47 * hash + Objects.hashCode(this.estado);
        hash = 47 * hash + Objects.hashCode(this.celular);
        hash = 47 * hash + Objects.hashCode(this.bank);
        hash = 47 * hash + Objects.hashCode(this.noDecimos);
        hash = 47 * hash + Objects.hashCode(this.sw1);
        hash = 47 * hash + Objects.hashCode(this.sw2);
        hash = 47 * hash + Objects.hashCode(this.sw3);
        hash = 47 * hash + Objects.hashCode(this.sw4);
        hash = 47 * hash + Objects.hashCode(this.sw5);
        hash = 47 * hash + Objects.hashCode(this.sw6);
        hash = 47 * hash + Objects.hashCode(this.sw7);
        hash = 47 * hash + Objects.hashCode(this.sw8);
        hash = 47 * hash + Objects.hashCode(this.sw9);
        hash = 47 * hash + Objects.hashCode(this.customerId);
        hash = 47 * hash + Objects.hashCode(this.regional);
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
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.employeeId, other.employeeId)) {
            return false;
        }
        if (!Objects.equals(this.biometId, other.biometId)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.titleCode, other.titleCode)) {
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
        if (!Objects.equals(this.home_phone, other.home_phone)) {
            return false;
        }
        if (!Objects.equals(this.extension, other.extension)) {
            return false;
        }
        if (!Objects.equals(this.otherPhone, other.otherPhone)) {
            return false;
        }
        if (!Objects.equals(this.photoFile, other.photoFile)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.afiliacion, other.afiliacion)) {
            return false;
        }
        if (!Objects.equals(this.regionalId, other.regionalId)) {
            return false;
        }
        if (!Objects.equals(this.bankType, other.bankType)) {
            return false;
        }
        if (!Objects.equals(this.bankAccount, other.bankAccount)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.celular, other.celular)) {
            return false;
        }
        if (!Objects.equals(this.customerId, other.customerId)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.costCenter, other.costCenter)) {
            return false;
        }
        if (!Objects.equals(this.deptment, other.deptment)) {
            return false;
        }
        if (!Objects.equals(this.discontinued, other.discontinued)) {
            return false;
        }
        if (!Objects.equals(this.birthDate, other.birthDate)) {
            return false;
        }
        if (!Arrays.equals(this.photo, other.photo)) {
            return false;
        }
        if (!Objects.equals(this.journeyFrom, other.journeyFrom)) {
            return false;
        }
        if (!Objects.equals(this.journeyTo, other.journeyTo)) {
            return false;
        }
        if (!Objects.equals(this.extraHours, other.extraHours)) {
            return false;
        }
        if (!Objects.equals(this.aportaiess, other.aportaiess)) {
            return false;
        }
        if (!Objects.equals(this.aportaConyugue, other.aportaConyugue)) {
            return false;
        }
        if (!Objects.equals(this.hireDate, other.hireDate)) {
            return false;
        }
        if (!Objects.equals(this.otherDate, other.otherDate)) {
            return false;
        }
        if (!Objects.equals(this.sueldo, other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.subfam, other.subfam)) {
            return false;
        }
        if (!Objects.equals(this.subant, other.subant)) {
            return false;
        }
        if (!Objects.equals(this.responsab, other.responsab)) {
            return false;
        }
        if (!Objects.equals(this.moviliza, other.moviliza)) {
            return false;
        }
        if (!Objects.equals(this.gastos, other.gastos)) {
            return false;
        }
        if (!Objects.equals(this.csalarial, other.csalarial)) {
            return false;
        }
        if (!Objects.equals(this.porant, other.porant)) {
            return false;
        }
        if (!Objects.equals(this.valant, other.valant)) {
            return false;
        }
        if (!Objects.equals(this.prestaies, other.prestaies)) {
            return false;
        }
        if (!Objects.equals(this.totpempre, other.totpempre)) {
            return false;
        }
        if (!Objects.equals(this.ncuoempre, other.ncuoempre)) {
            return false;
        }
        if (!Objects.equals(this.prestaemp, other.prestaemp)) {
            return false;
        }
        if (!Objects.equals(this.afpgenesis, other.afpgenesis)) {
            return false;
        }
        if (!Objects.equals(this.invalidez, other.invalidez)) {
            return false;
        }
        if (!Objects.equals(this.segvehic, other.segvehic)) {
            return false;
        }
        if (!Objects.equals(this.supermaxi, other.supermaxi)) {
            return false;
        }
        if (!Objects.equals(this.diners, other.diners)) {
            return false;
        }
        if (!Objects.equals(this.frMensual, other.frMensual)) {
            return false;
        }
        if (!Objects.equals(this.mensual_13, other.mensual_13)) {
            return false;
        }
        if (!Objects.equals(this.mensual_14, other.mensual_14)) {
            return false;
        }
        if (!Objects.equals(this.salida, other.salida)) {
            return false;
        }
        if (!Objects.equals(this.added, other.added)) {
            return false;
        }
        if (!Objects.equals(this.modified, other.modified)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.estCivil, other.estCivil)) {
            return false;
        }
        if (!Objects.equals(this.cargFam, other.cargFam)) {
            return false;
        }
        if (!Objects.equals(this.bank, other.bank)) {
            return false;
        }
        if (!Objects.equals(this.noDecimos, other.noDecimos)) {
            return false;
        }
        if (!Objects.equals(this.sw1, other.sw1)) {
            return false;
        }
        if (!Objects.equals(this.sw2, other.sw2)) {
            return false;
        }
        if (!Objects.equals(this.sw3, other.sw3)) {
            return false;
        }
        if (!Objects.equals(this.sw4, other.sw4)) {
            return false;
        }
        if (!Objects.equals(this.sw5, other.sw5)) {
            return false;
        }
        if (!Objects.equals(this.sw6, other.sw6)) {
            return false;
        }
        if (!Objects.equals(this.sw7, other.sw7)) {
            return false;
        }
        if (!Objects.equals(this.sw8, other.sw8)) {
            return false;
        }
        if (!Objects.equals(this.sw9, other.sw9)) {
            return false;
        }
        return Objects.equals(this.regional, other.regional);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBiometId() {
        return biometId;
    }

    public void setBiometId(String biometId) {
        this.biometId = biometId;
    }

    public Deptment getDeptment() {
        return deptment;
    }

    public void setDeptment(Deptment deptment) {
        this.deptment = deptment;
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

    public String getTitleCode() {
        return titleCode;
    }

    public void setTitleCode(String titleCode) {
        this.titleCode = titleCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Regional getRegional() {
        return regional;
    }

    public void setRegional(Regional regional) {
        this.regional = regional;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public BigDecimal getJourneyFrom() {
        return journeyFrom;
    }

    public void setJourneyFrom(BigDecimal journeyFrom) {
        this.journeyFrom = journeyFrom;
    }

    public BigDecimal getJourneyTo() {
        return journeyTo;
    }

    public void setJourneyTo(BigDecimal journeyTo) {
        this.journeyTo = journeyTo;
    }

    public BigDecimal getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(BigDecimal extraHours) {
        this.extraHours = extraHours;
    }

    public String getRegionalId() {
        return regionalId;
    }

    public void setRegionalId(String regionalId) {
        this.regionalId = regionalId;
    }

    public Boolean getAportaiess() {
        return aportaiess;
    }

    public void setAportaiess(Boolean aportaiess) {
        this.aportaiess = aportaiess;
    }

    public Boolean getAportaConyugue() {
        return aportaConyugue;
    }

    public void setAportaConyugue(Boolean aportaConyugue) {
        this.aportaConyugue = aportaConyugue;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getOtherDate() {
        return otherDate;
    }

    public void setOtherDate(Date otherDate) {
        this.otherDate = otherDate;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public BigDecimal getSubfam() {
        return subfam;
    }

    public void setSubfam(BigDecimal subfam) {
        this.subfam = subfam;
    }

    public BigDecimal getSubant() {
        return subant;
    }

    public void setSubant(BigDecimal subant) {
        this.subant = subant;
    }

    public BigDecimal getResponsab() {
        return responsab;
    }

    public void setResponsab(BigDecimal responsab) {
        this.responsab = responsab;
    }

    public BigDecimal getMoviliza() {
        return moviliza;
    }

    public void setMoviliza(BigDecimal moviliza) {
        this.moviliza = moviliza;
    }

    public BigDecimal getGastos() {
        return gastos;
    }

    public void setGastos(BigDecimal gastos) {
        this.gastos = gastos;
    }

    public BigDecimal getCsalarial() {
        return csalarial;
    }

    public void setCsalarial(BigDecimal csalarial) {
        this.csalarial = csalarial;
    }

    public BigDecimal getPorant() {
        return porant;
    }

    public void setPorant(BigDecimal porant) {
        this.porant = porant;
    }

    public BigDecimal getValant() {
        return valant;
    }

    public void setValant(BigDecimal valant) {
        this.valant = valant;
    }

    public BigDecimal getPrestaies() {
        return prestaies;
    }

    public void setPrestaies(BigDecimal prestaies) {
        this.prestaies = prestaies;
    }

    public BigDecimal getTotpempre() {
        return totpempre;
    }

    public void setTotpempre(BigDecimal totpempre) {
        this.totpempre = totpempre;
    }

    public Integer getNcuoempre() {
        return ncuoempre;
    }

    public void setNcuoempre(Integer ncuoempre) {
        this.ncuoempre = ncuoempre;
    }

    public BigDecimal getPrestaemp() {
        return prestaemp;
    }

    public void setPrestaemp(BigDecimal prestaemp) {
        this.prestaemp = prestaemp;
    }

    public BigDecimal getAfpgenesis() {
        return afpgenesis;
    }

    public void setAfpgenesis(BigDecimal afpgenesis) {
        this.afpgenesis = afpgenesis;
    }

    public BigDecimal getInvalidez() {
        return invalidez;
    }

    public void setInvalidez(BigDecimal invalidez) {
        this.invalidez = invalidez;
    }

    public BigDecimal getSegvehic() {
        return segvehic;
    }

    public void setSegvehic(BigDecimal segvehic) {
        this.segvehic = segvehic;
    }

    public BigDecimal getSupermaxi() {
        return supermaxi;
    }

    public void setSupermaxi(BigDecimal supermaxi) {
        this.supermaxi = supermaxi;
    }

    public BigDecimal getDiners() {
        return diners;
    }

    public void setDiners(BigDecimal diners) {
        this.diners = diners;
    }

    public Boolean getFrMensual() {
        return frMensual;
    }

    public void setFrMensual(Boolean frMensual) {
        this.frMensual = frMensual;
    }

    public Boolean getMensual_13() {
        return mensual_13;
    }

    public void setMensual_13(Boolean mensual_13) {
        this.mensual_13 = mensual_13;
    }

    public Boolean getMensual_14() {
        return mensual_14;
    }

    public void setMensual_14(Boolean mensual_14) {
        this.mensual_14 = mensual_14;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(Integer estCivil) {
        this.estCivil = estCivil;
    }

    public Integer getCargFam() {
        return cargFam;
    }

    public void setCargFam(Integer cargFam) {
        this.cargFam = cargFam;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Banks getBank() {
        return bank;
    }

    public void setBank(Banks bank) {
        this.bank = bank;
    }

    public Boolean getNoDecimos() {
        return noDecimos;
    }

    public void setNoDecimos(Boolean noDecimos) {
        this.noDecimos = noDecimos;
    }

    public Boolean getSw1() {
        return sw1;
    }

    public void setSw1(Boolean sw1) {
        this.sw1 = sw1;
    }

    public Boolean getSw2() {
        return sw2;
    }

    public void setSw2(Boolean sw2) {
        this.sw2 = sw2;
    }

    public Boolean getSw3() {
        return sw3;
    }

    public void setSw3(Boolean sw3) {
        this.sw3 = sw3;
    }

    public Boolean getSw4() {
        return sw4;
    }

    public void setSw4(Boolean sw4) {
        this.sw4 = sw4;
    }

    public Boolean getSw5() {
        return sw5;
    }

    public void setSw5(Boolean sw5) {
        this.sw5 = sw5;
    }

    public Boolean getSw6() {
        return sw6;
    }

    public void setSw6(Boolean sw6) {
        this.sw6 = sw6;
    }

    public Boolean getSw7() {
        return sw7;
    }

    public void setSw7(Boolean sw7) {
        this.sw7 = sw7;
    }

    public Boolean getSw8() {
        return sw8;
    }

    public void setSw8(Boolean sw8) {
        this.sw8 = sw8;
    }

    public Boolean getSw9() {
        return sw9;
    }

    public void setSw9(Boolean sw9) {
        this.sw9 = sw9;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CostCenters getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(CostCenters costCenter) {
        this.costCenter = costCenter;
    }

}
