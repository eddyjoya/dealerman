/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityGeneral;

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
@Table(name = "brands")
public class Brands implements Serializable {

    @Id
    @Column(name = "brand_id", columnDefinition = "char(2)")
    private String brandId;
    @Column(name = "brand_name", columnDefinition = "varchar(30)", nullable = true)
    private String brandName;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = false)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = false)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = false)
    private Boolean modified;

    public Brands() {
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

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

}
