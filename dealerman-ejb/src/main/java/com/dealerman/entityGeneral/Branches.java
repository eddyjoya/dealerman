/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityGeneral;

import com.dealerman.entityConfiguration.Inumbers;
import com.dealerman.entityOrders.Salesmen;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    private Company companyId;

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
    @JoinColumn(name = "salesman_id", referencedColumnName = "salesman_id")
    @ManyToOne
    @ForeignKey(name = "FK__branches__salesm__15502E78")
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

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

}
