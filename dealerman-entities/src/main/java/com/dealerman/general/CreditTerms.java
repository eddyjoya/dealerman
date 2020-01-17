/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.general;

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
@Table(name = "credit_terms")
public class CreditTerms implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "credit_term_id", columnDefinition = "char(4)")
    private String creditTermId;
    @Column(name = "description", columnDefinition = "varchar(25)", nullable = true)
    private String description;
    @Column(name = "numberofdays", columnDefinition = " numeric(3)", nullable = false)
    private Integer numberOfDays;
    @Column(name = "days2", columnDefinition = " numeric(3)", nullable = true)
    private Integer days2;
    @Column(name = "days3", columnDefinition = " numeric(3)", nullable = true)
    private Integer days3;
    @Column(name = "days4", columnDefinition = " numeric(3)", nullable = true)
    private Integer days4;
    @Column(name = "visit_days", columnDefinition = " numeric(3)", nullable = true)
    private Integer visitDays;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public CreditTerms() {
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCreditTermId() {
        return creditTermId;
    }

    public void setCreditTermId(String creditTermId) {
        this.creditTermId = creditTermId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Integer getDays2() {
        return days2;
    }

    public void setDays2(Integer days2) {
        this.days2 = days2;
    }

    public Integer getDays3() {
        return days3;
    }

    public void setDays3(Integer days3) {
        this.days3 = days3;
    }

    public Integer getDays4() {
        return days4;
    }

    public void setDays4(Integer days4) {
        this.days4 = days4;
    }

    public Integer getVisitDays() {
        return visitDays;
    }

    public void setVisitDays(Integer visitDays) {
        this.visitDays = visitDays;
    }

}
