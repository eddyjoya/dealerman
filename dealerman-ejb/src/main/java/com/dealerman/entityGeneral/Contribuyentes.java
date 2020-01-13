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
@Table(name = "contribuyentes")
public class Contribuyentes implements Serializable {

    @Id
    @Column(name = "supptype", columnDefinition = "tinyint")
    private Integer supptype;
    @Column(name = "contribuyente_name", columnDefinition = "varchar(35)", nullable = true)
    private String contribuyenteName;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public Contribuyentes() {
    }

    public Integer getSupptype() {
        return supptype;
    }

    public void setSupptype(Integer supptype) {
        this.supptype = supptype;
    }

    public String getContribuyenteName() {
        return contribuyenteName;
    }

    public void setContribuyenteName(String contribuyenteName) {
        this.contribuyenteName = contribuyenteName;
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
