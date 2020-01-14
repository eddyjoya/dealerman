/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityAccounting;

import com.dealerman.entityGeneral.Branches;
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
@Table(name = "journals")
public class Journals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "journal_id", columnDefinition = "int")
    private Integer journalId;
    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = true)
    private String branchId;
    @Column(name = "bodega_id", columnDefinition = "char(2)", nullable = false)
    private String bodega_id;
    @ManyToOne
    @ForeignKey(name = "FK__journals__aplica__20C1E124")
    @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
    private JournalAplcs journalAplcs;
    @Column(name = "diario", columnDefinition = "char(2)", nullable = false)
    private String diario;
    @ManyToOne
    @ForeignKey(name = "FK__journals__tipo__1ED998B2")
    @JoinColumn(name = "tipo", referencedColumnName = "tipo")
    private JournalTypes journalType;
    @Column(name = "clase", columnDefinition = "char(1)", nullable = false)
    private String clase;
    @Column(name = "source", columnDefinition = "tinyint", nullable = false)
    private Integer source;
    @Column(name = "local_id", columnDefinition = "char(3)", nullable = false)
    private String localId;
    @Column(name = "issue_id", columnDefinition = "char(3)", nullable = false)
    private String issueId;
    @Column(name = "journal_number", columnDefinition = "numeric(8)", nullable = false)
    private BigDecimal journalNumber;
    @Column(name = "journal_date", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date journalDate;
    @Column(name = "employee_id", columnDefinition = "char(6)", nullable = false)
    private String employeeId;
    @Column(name = "notes", columnDefinition = "varchar(100)", nullable = true)
    private String notes;
    @Column(name = "ntable", columnDefinition = "tinyint", nullable = false)
    private Integer ntable;
    @Column(name = "record_id", columnDefinition = "int", nullable = true)
    private Integer recordId;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @MapsId("branch_id")
    @ManyToOne
    @ForeignKey(name = "FK__journals__1DE57479")
    @JoinColumns({
        @JoinColumn(name = "company_id", referencedColumnName = "company_id")
        ,
        @JoinColumn(name = "bodega_id", referencedColumnName = "bodega_id")
    })
    private Branches branch;
    @MapsId("branch_id")
    @ManyToOne
    @ForeignKey(name = "FK__journals__1FCDBCEB")
    @JoinColumns({
        @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
        ,
        @JoinColumn(name = "diario", referencedColumnName = "diario")
    })
    private JournalDaily journalDaily;

    public Journals() {
    }

    public Integer getJournalId() {
        return journalId;
    }

    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
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

    public String getBodega_id() {
        return bodega_id;
    }

    public void setBodega_id(String bodega_id) {
        this.bodega_id = bodega_id;
    }

    public JournalAplcs getJournalAplcs() {
        return journalAplcs;
    }

    public void setJournalAplcs(JournalAplcs journalAplcs) {
        this.journalAplcs = journalAplcs;
    }

    public String getDiario() {
        return diario;
    }

    public void setDiario(String diario) {
        this.diario = diario;
    }

    public JournalTypes getJournalType() {
        return journalType;
    }

    public void setJournalType(JournalTypes journalType) {
        this.journalType = journalType;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
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

    public BigDecimal getJournalNumber() {
        return journalNumber;
    }

    public void setJournalNumber(BigDecimal journalNumber) {
        this.journalNumber = journalNumber;
    }

    public Date getJournalDate() {
        return journalDate;
    }

    public void setJournalDate(Date journalDate) {
        this.journalDate = journalDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getNtable() {
        return ntable;
    }

    public void setNtable(Integer ntable) {
        this.ntable = ntable;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public Branches getBranch() {
        return branch;
    }

    public void setBranch(Branches branch) {
        this.branch = branch;
    }

    public JournalDaily getJournalDaily() {
        return journalDaily;
    }

    public void setJournalDaily(JournalDaily journalDaily) {
        this.journalDaily = journalDaily;
    }

}
