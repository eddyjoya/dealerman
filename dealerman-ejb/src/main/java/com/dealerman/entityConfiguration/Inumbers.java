/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityConfiguration;

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
@Table(name = "inumbers")
public class Inumbers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "company_id", columnDefinition = "char(2)")
    private String companyId;

    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = true)
    private String branchId;

    @MapsId("branch_id")
    @ManyToOne
    @ForeignKey(name = "FK__inumbers__4D5F7D71")
    @JoinColumns({
        @JoinColumn(name = "company_id", referencedColumnName = "company_id")
        ,
        @JoinColumn(name = "bodega_id", referencedColumnName = "bodega_id")
    })
    private Branches companyBodegaFK;

    @Id
    @Column(name = "bodega_id", columnDefinition = "char(2)")
    private String bodegaId;

    @Id
    @Column(name = "aplicacion", columnDefinition = "char(1)")
    private String aplicacion;
    @Id
    @Column(name = "tipo", columnDefinition = "char(2)")
    private String tipo;
    @Id
    @Column(name = "clase", columnDefinition = "char(1)")
    private String clase;
    @Id
    @Column(name = "chimbo", columnDefinition = "char(1)")
    private String chimbo;
    @Column(name = "numero", columnDefinition = "tinyint", nullable = true)
    private Integer numero;
    @Column(name = "diario", columnDefinition = "char(5)", nullable = false)
    private String diario;
    @Column(name = "recibe", columnDefinition = "char(5)", nullable = false)
    private String recibe;
    @Column(name = "filtro", columnDefinition = "tinyint", nullable = true)
    private Integer filtro;
    @Column(name = "asknumber", columnDefinition = "bit", nullable = true)
    private Boolean askNumber;
    @Column(name = "value1", columnDefinition = "numeric(9)", nullable = false)
    private BigDecimal value1;
    @Column(name = "value2", columnDefinition = "numeric(9)", nullable = false)
    private BigDecimal value2;
    @Column(name = "remarks", columnDefinition = "varchar(40)", nullable = true)
    private String remarks;
    @Column(name = "local_id", columnDefinition = "char(3)", nullable = false)
    private String localId;
    @Column(name = "issue_id", columnDefinition = "char(3)", nullable = false)
    private String issueId;
    @Column(name = "autorizacion", columnDefinition = "varchar(10)", nullable = true)
    private String autorizacion;
    @Column(name = "valid_to", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date validTo;
    @Column(name = "duedate", columnDefinition = "bit", nullable = true)
    private Boolean duedate;
    @Column(name = "ask_fpago", columnDefinition = "bit", nullable = true)
    private Boolean askFpago;
    @Column(name = "ask_price", columnDefinition = "bit", nullable = true)
    private Boolean askPrice;
    @Column(name = "receipt", columnDefinition = "bit", nullable = true)
    private Boolean receipt;
    @Column(name = "dummycust", columnDefinition = "bit", nullable = true)
    private Boolean dummyCust;
    @Column(name = "cuotas", columnDefinition = "bit", nullable = true)
    private Boolean cuotas;
    @Column(name = "closeDate", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date closeDate;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "price_type", columnDefinition = "bit", nullable = true)
    private Boolean priceType;
    @Column(name = "default_pt", columnDefinition = "tinyint", nullable = true)
    private Integer defaultPt;
    @Column(name = "type_min", columnDefinition = "tinyint", nullable = true)
    private Integer typeMin;
    @Column(name = "type_max", columnDefinition = "tinyint", nullable = true)
    private Integer typeMax;
    @Column(name = "discount", columnDefinition = "bit", nullable = true)
    private Boolean discount;
    @Column(name = "disc_min", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal discMin;
    @Column(name = "disc_max", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal discMax;
    @Column(name = "freight", columnDefinition = "bit", nullable = true)
    private Boolean freight;
    @Column(name = "dprice_type", columnDefinition = "bit", nullable = true)
    private Boolean dpriceType;
    @Column(name = "dtype_min", columnDefinition = "tinyint", nullable = true)
    private Integer dtypeMin;
    @Column(name = "dtype_max", columnDefinition = "tinyint", nullable = true)
    private Integer dtypeMax;
    @Column(name = "ddiscount", columnDefinition = "bit", nullable = true)
    private Boolean ddiscount;
    @Column(name = "ddisc_min", columnDefinition = "numeric(5,2)", nullable = true)
    private BigDecimal ddiscMin;
    @Column(name = "ddisc_max", columnDefinition = "numeric(5,2)", nullable = true)
    private BigDecimal ddiscMax;
    @Column(name = "ddiscount1", columnDefinition = "bit", nullable = true)
    private Boolean ddiscount1;
    @Column(name = "ddisc_min1", columnDefinition = "numeric(5,2)", nullable = true)
    private BigDecimal ddiscMin1;
    @Column(name = "ddisc_max1", columnDefinition = "numeric(5,2)", nullable = true)
    private BigDecimal ddiscMax1;
    @Column(name = "no_items", columnDefinition = "tinyint", nullable = true)
    private Integer noItems;
    @Column(name = "ol", columnDefinition = "bit", nullable = true)
    private Boolean ol;
    @Column(name = "log1", columnDefinition = "bit", nullable = true)
    private Boolean log1;
    @Column(name = "not_ask_date", columnDefinition = "bit", nullable = true)
    private Boolean notAskDate;

    public Inumbers() {
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getChimbo() {
        return chimbo;
    }

    public void setChimbo(String chimbo) {
        this.chimbo = chimbo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDiario() {
        return diario;
    }

    public void setDiario(String diario) {
        this.diario = diario;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public Integer getFiltro() {
        return filtro;
    }

    public void setFiltro(Integer filtro) {
        this.filtro = filtro;
    }

    public Boolean getAskNumber() {
        return askNumber;
    }

    public void setAskNumber(Boolean askNumber) {
        this.askNumber = askNumber;
    }

    public BigDecimal getValue1() {
        return value1;
    }

    public void setValue1(BigDecimal value1) {
        this.value1 = value1;
    }

    public BigDecimal getValue2() {
        return value2;
    }

    public void setValue2(BigDecimal value2) {
        this.value2 = value2;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Boolean getDuedate() {
        return duedate;
    }

    public void setDuedate(Boolean duedate) {
        this.duedate = duedate;
    }

    public Boolean getAskFpago() {
        return askFpago;
    }

    public void setAskFpago(Boolean askFpago) {
        this.askFpago = askFpago;
    }

    public Boolean getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(Boolean askPrice) {
        this.askPrice = askPrice;
    }

    public Boolean getReceipt() {
        return receipt;
    }

    public void setReceipt(Boolean receipt) {
        this.receipt = receipt;
    }

    public Boolean getDummyCust() {
        return dummyCust;
    }

    public void setDummyCust(Boolean dummyCust) {
        this.dummyCust = dummyCust;
    }

    public Boolean getCuotas() {
        return cuotas;
    }

    public void setCuotas(Boolean cuotas) {
        this.cuotas = cuotas;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Boolean getPriceType() {
        return priceType;
    }

    public void setPriceType(Boolean priceType) {
        this.priceType = priceType;
    }

    public Integer getDefaultPt() {
        return defaultPt;
    }

    public void setDefaultPt(Integer defaultPt) {
        this.defaultPt = defaultPt;
    }

    public Integer getTypeMin() {
        return typeMin;
    }

    public void setTypeMin(Integer typeMin) {
        this.typeMin = typeMin;
    }

    public Integer getTypeMax() {
        return typeMax;
    }

    public void setTypeMax(Integer typeMax) {
        this.typeMax = typeMax;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscMin() {
        return discMin;
    }

    public void setDiscMin(BigDecimal discMin) {
        this.discMin = discMin;
    }

    public BigDecimal getDiscMax() {
        return discMax;
    }

    public void setDiscMax(BigDecimal discMax) {
        this.discMax = discMax;
    }

    public Boolean getFreight() {
        return freight;
    }

    public void setFreight(Boolean freight) {
        this.freight = freight;
    }

    public Boolean getDpriceType() {
        return dpriceType;
    }

    public void setDpriceType(Boolean dpriceType) {
        this.dpriceType = dpriceType;
    }

    public Integer getDtypeMin() {
        return dtypeMin;
    }

    public void setDtypeMin(Integer dtypeMin) {
        this.dtypeMin = dtypeMin;
    }

    public Integer getDtypeMax() {
        return dtypeMax;
    }

    public void setDtypeMax(Integer dtypeMax) {
        this.dtypeMax = dtypeMax;
    }

    public Boolean getDdiscount() {
        return ddiscount;
    }

    public void setDdiscount(Boolean ddiscount) {
        this.ddiscount = ddiscount;
    }

    public BigDecimal getDdiscMin() {
        return ddiscMin;
    }

    public void setDdiscMin(BigDecimal ddiscMin) {
        this.ddiscMin = ddiscMin;
    }

    public BigDecimal getDdiscMax() {
        return ddiscMax;
    }

    public void setDdiscMax(BigDecimal ddiscMax) {
        this.ddiscMax = ddiscMax;
    }

    public Integer getNoItems() {
        return noItems;
    }

    public void setNoItems(Integer noItems) {
        this.noItems = noItems;
    }

    public Boolean getOl() {
        return ol;
    }

    public void setOl(Boolean ol) {
        this.ol = ol;
    }

    public Boolean getLog1() {
        return log1;
    }

    public void setLog1(Boolean log1) {
        this.log1 = log1;
    }

    public Boolean getNotAskDate() {
        return notAskDate;
    }

    public void setNotAskDate(Boolean notAskDate) {
        this.notAskDate = notAskDate;
    }

    public Boolean getDdiscount1() {
        return ddiscount1;
    }

    public void setDdiscount1(Boolean ddiscount1) {
        this.ddiscount1 = ddiscount1;
    }

    public BigDecimal getDdiscMin1() {
        return ddiscMin1;
    }

    public void setDdiscMin1(BigDecimal ddiscMin1) {
        this.ddiscMin1 = ddiscMin1;
    }

    public BigDecimal getDdiscMax1() {
        return ddiscMax1;
    }

    public void setDdiscMax1(BigDecimal ddiscMax1) {
        this.ddiscMax1 = ddiscMax1;
    }

    public String getBodegaId() {
        return bodegaId;
    }

    public void setBodegaId(String bodegaId) {
        this.bodegaId = bodegaId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Branches getCompanyBodegaFK() {
        return companyBodegaFK;
    }

    public void setCompanyBodegaFK(Branches companyBodegaFK) {
        this.companyBodegaFK = companyBodegaFK;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

}
