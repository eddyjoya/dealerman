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
import javax.persistence.Table;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "cities")
public class Cities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "province_id", columnDefinition = "char(2)")
    private String provinceId;
    @Id
    @Column(name = "canton_id", columnDefinition = "char(3)")
    private String cantonId;
    @Id
    @Column(name = "city_id", columnDefinition = "char(3)")
    private String cityId;
    @Column(name = "city_name", columnDefinition = "varchar(30)", nullable = true)
    private String cityName;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = false)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = false)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = false)
    private Boolean modified;

    public Cities() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.provinceId);
        hash = 79 * hash + Objects.hashCode(this.cantonId);
        hash = 79 * hash + Objects.hashCode(this.cityId);
        hash = 79 * hash + Objects.hashCode(this.cityName);
        hash = 79 * hash + Objects.hashCode(this.discontinued);
        hash = 79 * hash + Objects.hashCode(this.added);
        hash = 79 * hash + Objects.hashCode(this.modified);
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
        final Cities other = (Cities) obj;
        if (!Objects.equals(this.provinceId, other.provinceId)) {
            return false;
        }
        if (!Objects.equals(this.cantonId, other.cantonId)) {
            return false;
        }
        if (!Objects.equals(this.cityId, other.cityId)) {
            return false;
        }
        if (!Objects.equals(this.cityName, other.cityName)) {
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
