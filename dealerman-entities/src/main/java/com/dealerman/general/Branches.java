/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.general;

import com.dealerman.configuration.Inumbers;
import com.dealerman.orders.Salesmen;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "branches")
public class Branches implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    @ManyToOne
    @ForeignKey(name = "FK__branches__compan__145C0A3F")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Company company;

    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = true)
    private String branchId;
    @Id
    @Column(name = "bodega_id", columnDefinition = "char(2)")
    private String bodegaId;
    @Column(name = "branch", columnDefinition = "bit", nullable = true)
    private Boolean branch;
    @Column(name = "local_id", columnDefinition = "char(3)", nullable = false)
    private String localId;
    @Column(name = "issue_id", columnDefinition = "char(3)", nullable = false)
    private String issueId;
    @Column(name = "bodega_name", columnDefinition = "varchar(40)", nullable = true)
    private String bodegaName;
    @Column(name = "b_name", columnDefinition = "char(6)", nullable = false)
    private String bName;
    @Column(name = "b_address", columnDefinition = "varchar(254)", nullable = true)
    private String bAddress;
    @Column(name = "job_id", columnDefinition = "char(6)", nullable = true)
    private String jobId;
    @Column(name = "condicion", columnDefinition = "varchar(50)", nullable = true)
    private String condicion;
    @Column(name = "price_type", columnDefinition = "numeric(1)", nullable = false)
    private Integer priceType;
    @Column(name = "ask_price", columnDefinition = "bit", nullable = true)
    private Boolean askPrice;
    @Column(name = "iva_included", columnDefinition = "bit", nullable = true)
    private Boolean ivaIncluded;
    @Column(name = "qty_bypass", columnDefinition = "bit", nullable = true)
    private Boolean qtyBypass;
    @Column(name = "gl_deferred", columnDefinition = "bit", nullable = true)
    private Boolean glDeferred;
    @Column(name = "price_typev", columnDefinition = "numeric(1)", nullable = false)
    private Integer priceTypev;
    @Column(name = "ask_pricev", columnDefinition = "bit", nullable = true)
    private Boolean askPricev;
    @Column(name = "iva_includedv", columnDefinition = "bit", nullable = true)
    private Boolean ivaIncludedv;
    @Column(name = "qty_bypassv", columnDefinition = "bit", nullable = true)
    private Boolean qtyBypassv;
    @Column(name = "gl_deferredv", columnDefinition = "bit", nullable = true)
    private Boolean glDeferredv;

    @ManyToOne
    @ForeignKey(name = "FK__branches__salesm__15502E78")
    @JoinColumn(name = "salesman_id", referencedColumnName = "salesman_id")
    private Salesmen salesmanId;

    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @Column(name = "trf_number", columnDefinition = "numeric(8)", nullable = false)
    private BigDecimal trfNumber;
    @Column(name = "ncr_number", columnDefinition = "numeric(8)", nullable = false)
    private BigDecimal ncrNumber;
    @Column(name = "days", columnDefinition = "numeric(2)", nullable = false)
    private Integer days;
    @Column(name = "days1", columnDefinition = "numeric(2)", nullable = false)
    private Integer days1;
    @Column(name = "days2", columnDefinition = "numeric(2)", nullable = false)
    private Integer days2;
    @Column(name = "days3", columnDefinition = "numeric(2)", nullable = false)
    private Integer days3;
    @Column(name = "not_log", columnDefinition = "bit", nullable = true)
    private Boolean notLog;
    @Column(name = "sw1", columnDefinition = "bit", nullable = false)
    private Boolean sw1;
    @Column(name = "sw2", columnDefinition = "bit", nullable = false)
    private Boolean sw2;
    @Column(name = "sw3", columnDefinition = "bit", nullable = false)
    private Boolean sw3;
    @Column(name = "sw4", columnDefinition = "bit", nullable = false)
    private Boolean sw4;
    @Column(name = "sw5", columnDefinition = "bit", nullable = false)
    private Boolean sw5;
    @Column(name = "sw6", columnDefinition = "bit", nullable = false)
    private Boolean sw6;
    @Column(name = "sw7", columnDefinition = "bit", nullable = false)
    private Boolean sw7;
    @Column(name = "sw8", columnDefinition = "bit", nullable = false)
    private Boolean sw8;
    @Column(name = "sw9", columnDefinition = "bit", nullable = false)
    private Boolean sw9;
    @Column(name = "sw10", columnDefinition = "bit", nullable = false)
    private Boolean sw10;
    @Column(name = "sw11", columnDefinition = "bit", nullable = false)
    private Boolean sw11;
    @Column(name = "sw12", columnDefinition = "bit", nullable = false)
    private Boolean sw12;
    @Column(name = "sw13", columnDefinition = "bit", nullable = false)
    private Boolean sw13;
    @Column(name = "sw14", columnDefinition = "bit", nullable = false)
    private Boolean sw14;
    @Column(name = "sw15", columnDefinition = "bit", nullable = false)
    private Boolean sw15;
    @Column(name = "sw16", columnDefinition = "bit", nullable = false)
    private Boolean sw16;
    @Column(name = "sw17", columnDefinition = "bit", nullable = false)
    private Boolean sw17;
    @Column(name = "sw18", columnDefinition = "bit", nullable = false)
    private Boolean sw18;
    @Column(name = "sw19", columnDefinition = "bit", nullable = false)
    private Boolean sw19;
    @Column(name = "sw20", columnDefinition = "bit", nullable = false)
    private Boolean sw20;
    @Column(name = "sw21", columnDefinition = "bit", nullable = false)
    private Boolean sw21;
    @Column(name = "sw22", columnDefinition = "bit", nullable = false)
    private Boolean sw22;
    @Column(name = "sw23", columnDefinition = "bit", nullable = false)
    private Boolean sw23;
    @Column(name = "sw24", columnDefinition = "bit", nullable = false)
    private Boolean sw24;
    @Column(name = "dummycust", columnDefinition = "char(13)", nullable = true)
    private String dummyCust;
    @Column(name = "first_id", columnDefinition = "char(1)", nullable = true)
    private String firstId;
    @Column(name = "dummycust_salesman_id", columnDefinition = "char(5)", nullable = true)
    private String dummycustSalesmanId;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "ole_i", columnDefinition = "bit", nullable = false)
    private Boolean oleI;
    @Column(name = "tr_cust", columnDefinition = "char(13)", nullable = true)
    private String trCust;
    @Column(name = "def_salesman_id", columnDefinition = "char(5)", nullable = true)
    private String defSalesmanId;
    @Column(name = "def_zone_id", columnDefinition = "char(2)", nullable = true)
    private String defZoneId;
    @Column(name = "def_price_type", columnDefinition = "tinyint", nullable = true)
    private Integer defPriceType;
    @Column(name = "def_credit_term_id", columnDefinition = "char(4)", nullable = true)
    private String defCreditTermId;
    @OneToMany(mappedBy = "companyBodegaFK")
    private List<Inumbers> ListInumbers;

    public Branches() {
    }

    public Branches(Company company, String bodegaId) {
        this.company = company;
        this.bodegaId = bodegaId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.company);
        hash = 73 * hash + Objects.hashCode(this.branchId);
        hash = 73 * hash + Objects.hashCode(this.bodegaId);
        hash = 73 * hash + Objects.hashCode(this.branch);
        hash = 73 * hash + Objects.hashCode(this.localId);
        hash = 73 * hash + Objects.hashCode(this.issueId);
        hash = 73 * hash + Objects.hashCode(this.bodegaName);
        hash = 73 * hash + Objects.hashCode(this.bName);
        hash = 73 * hash + Objects.hashCode(this.bAddress);
        hash = 73 * hash + Objects.hashCode(this.jobId);
        hash = 73 * hash + Objects.hashCode(this.condicion);
        hash = 73 * hash + Objects.hashCode(this.priceType);
        hash = 73 * hash + Objects.hashCode(this.askPrice);
        hash = 73 * hash + Objects.hashCode(this.ivaIncluded);
        hash = 73 * hash + Objects.hashCode(this.qtyBypass);
        hash = 73 * hash + Objects.hashCode(this.glDeferred);
        hash = 73 * hash + Objects.hashCode(this.priceTypev);
        hash = 73 * hash + Objects.hashCode(this.askPricev);
        hash = 73 * hash + Objects.hashCode(this.ivaIncludedv);
        hash = 73 * hash + Objects.hashCode(this.qtyBypassv);
        hash = 73 * hash + Objects.hashCode(this.glDeferredv);
        hash = 73 * hash + Objects.hashCode(this.salesmanId);
        hash = 73 * hash + Objects.hashCode(this.added);
        hash = 73 * hash + Objects.hashCode(this.modified);
        hash = 73 * hash + Objects.hashCode(this.trfNumber);
        hash = 73 * hash + Objects.hashCode(this.ncrNumber);
        hash = 73 * hash + Objects.hashCode(this.days);
        hash = 73 * hash + Objects.hashCode(this.days1);
        hash = 73 * hash + Objects.hashCode(this.days2);
        hash = 73 * hash + Objects.hashCode(this.days3);
        hash = 73 * hash + Objects.hashCode(this.notLog);
        hash = 73 * hash + Objects.hashCode(this.sw1);
        hash = 73 * hash + Objects.hashCode(this.sw2);
        hash = 73 * hash + Objects.hashCode(this.sw3);
        hash = 73 * hash + Objects.hashCode(this.sw4);
        hash = 73 * hash + Objects.hashCode(this.sw5);
        hash = 73 * hash + Objects.hashCode(this.sw6);
        hash = 73 * hash + Objects.hashCode(this.sw7);
        hash = 73 * hash + Objects.hashCode(this.sw8);
        hash = 73 * hash + Objects.hashCode(this.sw9);
        hash = 73 * hash + Objects.hashCode(this.sw10);
        hash = 73 * hash + Objects.hashCode(this.sw11);
        hash = 73 * hash + Objects.hashCode(this.sw12);
        hash = 73 * hash + Objects.hashCode(this.sw13);
        hash = 73 * hash + Objects.hashCode(this.sw14);
        hash = 73 * hash + Objects.hashCode(this.sw15);
        hash = 73 * hash + Objects.hashCode(this.sw16);
        hash = 73 * hash + Objects.hashCode(this.sw17);
        hash = 73 * hash + Objects.hashCode(this.sw18);
        hash = 73 * hash + Objects.hashCode(this.sw19);
        hash = 73 * hash + Objects.hashCode(this.sw20);
        hash = 73 * hash + Objects.hashCode(this.sw21);
        hash = 73 * hash + Objects.hashCode(this.sw22);
        hash = 73 * hash + Objects.hashCode(this.sw23);
        hash = 73 * hash + Objects.hashCode(this.sw24);
        hash = 73 * hash + Objects.hashCode(this.dummyCust);
        hash = 73 * hash + Objects.hashCode(this.firstId);
        hash = 73 * hash + Objects.hashCode(this.dummycustSalesmanId);
        hash = 73 * hash + Objects.hashCode(this.discontinued);
        hash = 73 * hash + Objects.hashCode(this.oleI);
        hash = 73 * hash + Objects.hashCode(this.trCust);
        hash = 73 * hash + Objects.hashCode(this.defSalesmanId);
        hash = 73 * hash + Objects.hashCode(this.defZoneId);
        hash = 73 * hash + Objects.hashCode(this.defPriceType);
        hash = 73 * hash + Objects.hashCode(this.defCreditTermId);
        hash = 73 * hash + Objects.hashCode(this.ListInumbers);
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
        final Branches other = (Branches) obj;
        if (!Objects.equals(this.branchId, other.branchId)) {
            return false;
        }
        if (!Objects.equals(this.bodegaId, other.bodegaId)) {
            return false;
        }
        if (!Objects.equals(this.localId, other.localId)) {
            return false;
        }
        if (!Objects.equals(this.issueId, other.issueId)) {
            return false;
        }
        if (!Objects.equals(this.bodegaName, other.bodegaName)) {
            return false;
        }
        if (!Objects.equals(this.bName, other.bName)) {
            return false;
        }
        if (!Objects.equals(this.bAddress, other.bAddress)) {
            return false;
        }
        if (!Objects.equals(this.jobId, other.jobId)) {
            return false;
        }
        if (!Objects.equals(this.condicion, other.condicion)) {
            return false;
        }
        if (!Objects.equals(this.dummyCust, other.dummyCust)) {
            return false;
        }
        if (!Objects.equals(this.firstId, other.firstId)) {
            return false;
        }
        if (!Objects.equals(this.dummycustSalesmanId, other.dummycustSalesmanId)) {
            return false;
        }
        if (!Objects.equals(this.trCust, other.trCust)) {
            return false;
        }
        if (!Objects.equals(this.defSalesmanId, other.defSalesmanId)) {
            return false;
        }
        if (!Objects.equals(this.defZoneId, other.defZoneId)) {
            return false;
        }
        if (!Objects.equals(this.defCreditTermId, other.defCreditTermId)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        if (!Objects.equals(this.branch, other.branch)) {
            return false;
        }
        if (!Objects.equals(this.priceType, other.priceType)) {
            return false;
        }
        if (!Objects.equals(this.askPrice, other.askPrice)) {
            return false;
        }
        if (!Objects.equals(this.ivaIncluded, other.ivaIncluded)) {
            return false;
        }
        if (!Objects.equals(this.qtyBypass, other.qtyBypass)) {
            return false;
        }
        if (!Objects.equals(this.glDeferred, other.glDeferred)) {
            return false;
        }
        if (!Objects.equals(this.priceTypev, other.priceTypev)) {
            return false;
        }
        if (!Objects.equals(this.askPricev, other.askPricev)) {
            return false;
        }
        if (!Objects.equals(this.ivaIncludedv, other.ivaIncludedv)) {
            return false;
        }
        if (!Objects.equals(this.qtyBypassv, other.qtyBypassv)) {
            return false;
        }
        if (!Objects.equals(this.glDeferredv, other.glDeferredv)) {
            return false;
        }
        if (!Objects.equals(this.salesmanId, other.salesmanId)) {
            return false;
        }
        if (!Objects.equals(this.added, other.added)) {
            return false;
        }
        if (!Objects.equals(this.modified, other.modified)) {
            return false;
        }
        if (!Objects.equals(this.trfNumber, other.trfNumber)) {
            return false;
        }
        if (!Objects.equals(this.ncrNumber, other.ncrNumber)) {
            return false;
        }
        if (!Objects.equals(this.days, other.days)) {
            return false;
        }
        if (!Objects.equals(this.days1, other.days1)) {
            return false;
        }
        if (!Objects.equals(this.days2, other.days2)) {
            return false;
        }
        if (!Objects.equals(this.days3, other.days3)) {
            return false;
        }
        if (!Objects.equals(this.notLog, other.notLog)) {
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
        if (!Objects.equals(this.sw10, other.sw10)) {
            return false;
        }
        if (!Objects.equals(this.sw11, other.sw11)) {
            return false;
        }
        if (!Objects.equals(this.sw12, other.sw12)) {
            return false;
        }
        if (!Objects.equals(this.sw13, other.sw13)) {
            return false;
        }
        if (!Objects.equals(this.sw14, other.sw14)) {
            return false;
        }
        if (!Objects.equals(this.sw15, other.sw15)) {
            return false;
        }
        if (!Objects.equals(this.sw16, other.sw16)) {
            return false;
        }
        if (!Objects.equals(this.sw17, other.sw17)) {
            return false;
        }
        if (!Objects.equals(this.sw18, other.sw18)) {
            return false;
        }
        if (!Objects.equals(this.sw19, other.sw19)) {
            return false;
        }
        if (!Objects.equals(this.sw20, other.sw20)) {
            return false;
        }
        if (!Objects.equals(this.sw21, other.sw21)) {
            return false;
        }
        if (!Objects.equals(this.sw22, other.sw22)) {
            return false;
        }
        if (!Objects.equals(this.sw23, other.sw23)) {
            return false;
        }
        if (!Objects.equals(this.sw24, other.sw24)) {
            return false;
        }
        if (!Objects.equals(this.discontinued, other.discontinued)) {
            return false;
        }
        if (!Objects.equals(this.oleI, other.oleI)) {
            return false;
        }
        if (!Objects.equals(this.defPriceType, other.defPriceType)) {
            return false;
        }
        return Objects.equals(this.ListInumbers, other.ListInumbers);
    }

    public List<Inumbers> getListInumbers() {
        return ListInumbers;
    }

    public void setListInumbers(List<Inumbers> ListInumbers) {
        this.ListInumbers = ListInumbers;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBodegaId() {
        return bodegaId;
    }

    public void setBodegaId(String bodegaId) {
        this.bodegaId = bodegaId;
    }

    public Boolean getBranch() {
        return branch;
    }

    public void setBranch(Boolean branch) {
        this.branch = branch;
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

    public String getBodegaName() {
        return bodegaName;
    }

    public void setBodegaName(String bodegaName) {
        this.bodegaName = bodegaName;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public Boolean getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(Boolean askPrice) {
        this.askPrice = askPrice;
    }

    public Boolean getIvaIncluded() {
        return ivaIncluded;
    }

    public void setIvaIncluded(Boolean ivaIncluded) {
        this.ivaIncluded = ivaIncluded;
    }

    public Boolean getQtyBypass() {
        return qtyBypass;
    }

    public void setQtyBypass(Boolean qtyBypass) {
        this.qtyBypass = qtyBypass;
    }

    public Boolean getGlDeferred() {
        return glDeferred;
    }

    public void setGlDeferred(Boolean glDeferred) {
        this.glDeferred = glDeferred;
    }

    public Integer getPriceTypev() {
        return priceTypev;
    }

    public void setPriceTypev(Integer priceTypev) {
        this.priceTypev = priceTypev;
    }

    public Boolean getAskPricev() {
        return askPricev;
    }

    public void setAskPricev(Boolean askPricev) {
        this.askPricev = askPricev;
    }

    public Boolean getIvaIncludedv() {
        return ivaIncludedv;
    }

    public void setIvaIncludedv(Boolean ivaIncludedv) {
        this.ivaIncludedv = ivaIncludedv;
    }

    public Boolean getQtyBypassv() {
        return qtyBypassv;
    }

    public void setQtyBypassv(Boolean qtyBypassv) {
        this.qtyBypassv = qtyBypassv;
    }

    public Boolean getGlDeferredv() {
        return glDeferredv;
    }

    public void setGlDeferredv(Boolean glDeferredv) {
        this.glDeferredv = glDeferredv;
    }

    public Salesmen getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Salesmen salesmanId) {
        this.salesmanId = salesmanId;
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

    public BigDecimal getTrfNumber() {
        return trfNumber;
    }

    public void setTrfNumber(BigDecimal trfNumber) {
        this.trfNumber = trfNumber;
    }

    public BigDecimal getNcrNumber() {
        return ncrNumber;
    }

    public void setNcrNumber(BigDecimal ncrNumber) {
        this.ncrNumber = ncrNumber;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getDays1() {
        return days1;
    }

    public void setDays1(Integer days1) {
        this.days1 = days1;
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

    public Boolean getNotLog() {
        return notLog;
    }

    public void setNotLog(Boolean notLog) {
        this.notLog = notLog;
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

    public Boolean getSw10() {
        return sw10;
    }

    public void setSw10(Boolean sw10) {
        this.sw10 = sw10;
    }

    public Boolean getSw11() {
        return sw11;
    }

    public void setSw11(Boolean sw11) {
        this.sw11 = sw11;
    }

    public Boolean getSw12() {
        return sw12;
    }

    public void setSw12(Boolean sw12) {
        this.sw12 = sw12;
    }

    public Boolean getSw13() {
        return sw13;
    }

    public void setSw13(Boolean sw13) {
        this.sw13 = sw13;
    }

    public Boolean getSw14() {
        return sw14;
    }

    public void setSw14(Boolean sw14) {
        this.sw14 = sw14;
    }

    public Boolean getSw15() {
        return sw15;
    }

    public void setSw15(Boolean sw15) {
        this.sw15 = sw15;
    }

    public Boolean getSw16() {
        return sw16;
    }

    public void setSw16(Boolean sw16) {
        this.sw16 = sw16;
    }

    public Boolean getSw17() {
        return sw17;
    }

    public void setSw17(Boolean sw17) {
        this.sw17 = sw17;
    }

    public Boolean getSw18() {
        return sw18;
    }

    public void setSw18(Boolean sw18) {
        this.sw18 = sw18;
    }

    public Boolean getSw19() {
        return sw19;
    }

    public void setSw19(Boolean sw19) {
        this.sw19 = sw19;
    }

    public Boolean getSw20() {
        return sw20;
    }

    public void setSw20(Boolean sw20) {
        this.sw20 = sw20;
    }

    public Boolean getSw21() {
        return sw21;
    }

    public void setSw21(Boolean sw21) {
        this.sw21 = sw21;
    }

    public Boolean getSw22() {
        return sw22;
    }

    public void setSw22(Boolean sw22) {
        this.sw22 = sw22;
    }

    public Boolean getSw23() {
        return sw23;
    }

    public void setSw23(Boolean sw23) {
        this.sw23 = sw23;
    }

    public Boolean getSw24() {
        return sw24;
    }

    public void setSw24(Boolean sw24) {
        this.sw24 = sw24;
    }

    public String getDummyCust() {
        return dummyCust;
    }

    public void setDummyCust(String dummyCust) {
        this.dummyCust = dummyCust;
    }

    public String getFirstId() {
        return firstId;
    }

    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    public String getDummycustSalesmanId() {
        return dummycustSalesmanId;
    }

    public void setDummycustSalesmanId(String dummycustSalesmanId) {
        this.dummycustSalesmanId = dummycustSalesmanId;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Boolean getOleI() {
        return oleI;
    }

    public void setOleI(Boolean oleI) {
        this.oleI = oleI;
    }

    public String getTrCust() {
        return trCust;
    }

    public void setTrCust(String trCust) {
        this.trCust = trCust;
    }

    public String getDefSalesmanId() {
        return defSalesmanId;
    }

    public void setDefSalesmanId(String defSalesmanId) {
        this.defSalesmanId = defSalesmanId;
    }

    public String getDefZoneId() {
        return defZoneId;
    }

    public void setDefZoneId(String defZoneId) {
        this.defZoneId = defZoneId;
    }

    public Integer getDefPriceType() {
        return defPriceType;
    }

    public void setDefPriceType(Integer defPriceType) {
        this.defPriceType = defPriceType;
    }

    public String getDefCreditTermId() {
        return defCreditTermId;
    }

    public void setDefCreditTermId(String defCreditTermId) {
        this.defCreditTermId = defCreditTermId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
