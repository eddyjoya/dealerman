/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.configuration;

import com.dealerman.general.Branches;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.companyId);
        hash = 59 * hash + Objects.hashCode(this.branchId);
        hash = 59 * hash + Objects.hashCode(this.companyBodegaFK);
        hash = 59 * hash + Objects.hashCode(this.bodegaId);
        hash = 59 * hash + Objects.hashCode(this.aplicacion);
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.clase);
        hash = 59 * hash + Objects.hashCode(this.chimbo);
        hash = 59 * hash + Objects.hashCode(this.numero);
        hash = 59 * hash + Objects.hashCode(this.diario);
        hash = 59 * hash + Objects.hashCode(this.recibe);
        hash = 59 * hash + Objects.hashCode(this.filtro);
        hash = 59 * hash + Objects.hashCode(this.askNumber);
        hash = 59 * hash + Objects.hashCode(this.value1);
        hash = 59 * hash + Objects.hashCode(this.value2);
        hash = 59 * hash + Objects.hashCode(this.remarks);
        hash = 59 * hash + Objects.hashCode(this.localId);
        hash = 59 * hash + Objects.hashCode(this.issueId);
        hash = 59 * hash + Objects.hashCode(this.autorizacion);
        hash = 59 * hash + Objects.hashCode(this.validTo);
        hash = 59 * hash + Objects.hashCode(this.duedate);
        hash = 59 * hash + Objects.hashCode(this.askFpago);
        hash = 59 * hash + Objects.hashCode(this.askPrice);
        hash = 59 * hash + Objects.hashCode(this.receipt);
        hash = 59 * hash + Objects.hashCode(this.dummyCust);
        hash = 59 * hash + Objects.hashCode(this.cuotas);
        hash = 59 * hash + Objects.hashCode(this.closeDate);
        hash = 59 * hash + Objects.hashCode(this.discontinued);
        hash = 59 * hash + Objects.hashCode(this.priceType);
        hash = 59 * hash + Objects.hashCode(this.defaultPt);
        hash = 59 * hash + Objects.hashCode(this.typeMin);
        hash = 59 * hash + Objects.hashCode(this.typeMax);
        hash = 59 * hash + Objects.hashCode(this.discount);
        hash = 59 * hash + Objects.hashCode(this.discMin);
        hash = 59 * hash + Objects.hashCode(this.discMax);
        hash = 59 * hash + Objects.hashCode(this.freight);
        hash = 59 * hash + Objects.hashCode(this.dpriceType);
        hash = 59 * hash + Objects.hashCode(this.dtypeMin);
        hash = 59 * hash + Objects.hashCode(this.dtypeMax);
        hash = 59 * hash + Objects.hashCode(this.ddiscount);
        hash = 59 * hash + Objects.hashCode(this.ddiscMin);
        hash = 59 * hash + Objects.hashCode(this.ddiscMax);
        hash = 59 * hash + Objects.hashCode(this.ddiscount1);
        hash = 59 * hash + Objects.hashCode(this.ddiscMin1);
        hash = 59 * hash + Objects.hashCode(this.ddiscMax1);
        hash = 59 * hash + Objects.hashCode(this.noItems);
        hash = 59 * hash + Objects.hashCode(this.ol);
        hash = 59 * hash + Objects.hashCode(this.log1);
        hash = 59 * hash + Objects.hashCode(this.notAskDate);
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
        final Inumbers other = (Inumbers) obj;
        if (!Objects.equals(this.companyId, other.companyId)) {
            return false;
        }
        if (!Objects.equals(this.branchId, other.branchId)) {
            return false;
        }
        if (!Objects.equals(this.bodegaId, other.bodegaId)) {
            return false;
        }
        if (!Objects.equals(this.aplicacion, other.aplicacion)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.clase, other.clase)) {
            return false;
        }
        if (!Objects.equals(this.chimbo, other.chimbo)) {
            return false;
        }
        if (!Objects.equals(this.diario, other.diario)) {
            return false;
        }
        if (!Objects.equals(this.recibe, other.recibe)) {
            return false;
        }
        if (!Objects.equals(this.remarks, other.remarks)) {
            return false;
        }
        if (!Objects.equals(this.localId, other.localId)) {
            return false;
        }
        if (!Objects.equals(this.issueId, other.issueId)) {
            return false;
        }
        if (!Objects.equals(this.autorizacion, other.autorizacion)) {
            return false;
        }
        if (!Objects.equals(this.companyBodegaFK, other.companyBodegaFK)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.filtro, other.filtro)) {
            return false;
        }
        if (!Objects.equals(this.askNumber, other.askNumber)) {
            return false;
        }
        if (!Objects.equals(this.value1, other.value1)) {
            return false;
        }
        if (!Objects.equals(this.value2, other.value2)) {
            return false;
        }
        if (!Objects.equals(this.validTo, other.validTo)) {
            return false;
        }
        if (!Objects.equals(this.duedate, other.duedate)) {
            return false;
        }
        if (!Objects.equals(this.askFpago, other.askFpago)) {
            return false;
        }
        if (!Objects.equals(this.askPrice, other.askPrice)) {
            return false;
        }
        if (!Objects.equals(this.receipt, other.receipt)) {
            return false;
        }
        if (!Objects.equals(this.dummyCust, other.dummyCust)) {
            return false;
        }
        if (!Objects.equals(this.cuotas, other.cuotas)) {
            return false;
        }
        if (!Objects.equals(this.closeDate, other.closeDate)) {
            return false;
        }
        if (!Objects.equals(this.discontinued, other.discontinued)) {
            return false;
        }
        if (!Objects.equals(this.priceType, other.priceType)) {
            return false;
        }
        if (!Objects.equals(this.defaultPt, other.defaultPt)) {
            return false;
        }
        if (!Objects.equals(this.typeMin, other.typeMin)) {
            return false;
        }
        if (!Objects.equals(this.typeMax, other.typeMax)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        if (!Objects.equals(this.discMin, other.discMin)) {
            return false;
        }
        if (!Objects.equals(this.discMax, other.discMax)) {
            return false;
        }
        if (!Objects.equals(this.freight, other.freight)) {
            return false;
        }
        if (!Objects.equals(this.dpriceType, other.dpriceType)) {
            return false;
        }
        if (!Objects.equals(this.dtypeMin, other.dtypeMin)) {
            return false;
        }
        if (!Objects.equals(this.dtypeMax, other.dtypeMax)) {
            return false;
        }
        if (!Objects.equals(this.ddiscount, other.ddiscount)) {
            return false;
        }
        if (!Objects.equals(this.ddiscMin, other.ddiscMin)) {
            return false;
        }
        if (!Objects.equals(this.ddiscMax, other.ddiscMax)) {
            return false;
        }
        if (!Objects.equals(this.ddiscount1, other.ddiscount1)) {
            return false;
        }
        if (!Objects.equals(this.ddiscMin1, other.ddiscMin1)) {
            return false;
        }
        if (!Objects.equals(this.ddiscMax1, other.ddiscMax1)) {
            return false;
        }
        if (!Objects.equals(this.noItems, other.noItems)) {
            return false;
        }
        if (!Objects.equals(this.ol, other.ol)) {
            return false;
        }
        if (!Objects.equals(this.log1, other.log1)) {
            return false;
        }
        return Objects.equals(this.notAskDate, other.notAskDate);
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
