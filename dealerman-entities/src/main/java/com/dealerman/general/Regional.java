/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.general;

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
@Table(name = "regional")
public class Regional implements Serializable {

    @Id
    @ManyToOne
    @ForeignKey(name = "FK__regional__compan__5535A963")
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    private Company company;
    @Id
    @Column(name = "regional_id", columnDefinition = "char(1)")
    private String regionalId;
    @Column(name = "regional_name", columnDefinition = "char(25)", nullable = false)
    private String regionalName;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "company_name", columnDefinition = "char(35)", nullable = false)
    private String companyName;
    @Column(name = "patronal_number", columnDefinition = "char(8)", nullable = false)
    private String patronalNumber;
    @Column(name = "ruc", columnDefinition = "char(14)", nullable = false)
    private String ruc;
    @Column(name = "state", columnDefinition = "char(10)", nullable = false)
    private String state;
    @Column(name = "canton", columnDefinition = "char(10)", nullable = false)
    private String canton;
    @Column(name = "city", columnDefinition = "char(10)", nullable = false)
    private String city;
    @Column(name = "address", columnDefinition = "char(36)", nullable = false)
    private String address;
    @Column(name = "intersection", columnDefinition = "char(23)", nullable = false)
    private String intersection;
    @Column(name = "apartado", columnDefinition = "char(23)", nullable = false)
    private String apartado;
    @Column(name = "oficina", columnDefinition = "char(23)", nullable = false)
    private String oficina;
    @Column(name = "telephone", columnDefinition = "char(6)", nullable = false)
    private String telephone;
    @Column(name = "responsable", columnDefinition = "char(33)", nullable = false)
    private String responsable;
    @Column(name = "cedula", columnDefinition = "char(10)", nullable = false)
    private String cedula;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public Regional() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.company);
        hash = 97 * hash + Objects.hashCode(this.regionalId);
        hash = 97 * hash + Objects.hashCode(this.regionalName);
        hash = 97 * hash + Objects.hashCode(this.discontinued);
        hash = 97 * hash + Objects.hashCode(this.companyName);
        hash = 97 * hash + Objects.hashCode(this.patronalNumber);
        hash = 97 * hash + Objects.hashCode(this.ruc);
        hash = 97 * hash + Objects.hashCode(this.state);
        hash = 97 * hash + Objects.hashCode(this.canton);
        hash = 97 * hash + Objects.hashCode(this.city);
        hash = 97 * hash + Objects.hashCode(this.address);
        hash = 97 * hash + Objects.hashCode(this.intersection);
        hash = 97 * hash + Objects.hashCode(this.apartado);
        hash = 97 * hash + Objects.hashCode(this.oficina);
        hash = 97 * hash + Objects.hashCode(this.telephone);
        hash = 97 * hash + Objects.hashCode(this.responsable);
        hash = 97 * hash + Objects.hashCode(this.cedula);
        hash = 97 * hash + Objects.hashCode(this.added);
        hash = 97 * hash + Objects.hashCode(this.modified);
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
        final Regional other = (Regional) obj;
        if (!Objects.equals(this.regionalId, other.regionalId)) {
            return false;
        }
        if (!Objects.equals(this.regionalName, other.regionalName)) {
            return false;
        }
        if (!Objects.equals(this.companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(this.patronalNumber, other.patronalNumber)) {
            return false;
        }
        if (!Objects.equals(this.ruc, other.ruc)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.canton, other.canton)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.intersection, other.intersection)) {
            return false;
        }
        if (!Objects.equals(this.apartado, other.apartado)) {
            return false;
        }
        if (!Objects.equals(this.oficina, other.oficina)) {
            return false;
        }
        if (!Objects.equals(this.telephone, other.telephone)) {
            return false;
        }
        if (!Objects.equals(this.responsable, other.responsable)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getRegionalId() {
        return regionalId;
    }

    public void setRegionalId(String regionalId) {
        this.regionalId = regionalId;
    }

    public String getRegionalName() {
        return regionalName;
    }

    public void setRegionalName(String regionalName) {
        this.regionalName = regionalName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPatronalNumber() {
        return patronalNumber;
    }

    public void setPatronalNumber(String patronalNumber) {
        this.patronalNumber = patronalNumber;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntersection() {
        return intersection;
    }

    public void setIntersection(String intersection) {
        this.intersection = intersection;
    }

    public String getApartado() {
        return apartado;
    }

    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
