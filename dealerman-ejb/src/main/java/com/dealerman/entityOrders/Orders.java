/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityOrders;

import com.dealerman.entityAccounting.Journals;
import com.dealerman.entityGeneral.Branches;
import com.dealerman.entityGeneral.CreditTerms;
import com.dealerman.entityGeneral.Status;
import com.dealerman.entityProduction.CostCenters;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "order_id", columnDefinition = "int")
    private Integer orderId;
    @Column(name = "activity_id", columnDefinition = "int", nullable = true)
    private Integer activityId;
    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = true)
    private String branchId;
    @MapsId("branch_id")
    @ManyToOne
    @ForeignKey(name = "FK__orders__3A81B327")
    @JoinColumns({
        @JoinColumn(name = "company_id", referencedColumnName = "company_id")
        ,
        @JoinColumn(name = "bodega_id", referencedColumnName = "bodega_id")
    })
    private Branches companyBodegaFK;

    @Column(name = "aplicacion", columnDefinition = "char(1)", nullable = false)
    private String aplicacion;
    @Column(name = "customer_id", columnDefinition = "char(13)", nullable = false)
    private String customerId;
    @Column(name = "ship_to_id", columnDefinition = "char(3)", nullable = true)
    private String shipToId;
    @Column(name = "bodega_id", columnDefinition = "char(2)", nullable = false)
    private String bodegaId;
    @Column(name = "vehicle_id", columnDefinition = "char(17)", nullable = true)
    private String vehicleId;
    @Column(name = "tipo", columnDefinition = "char(2)", nullable = false)
    private String tipo;
    @Column(name = "clase", columnDefinition = "char(1)", nullable = false)
    private String clase;
    @Column(name = "source", columnDefinition = "tinyint", nullable = false)
    private Integer source;
    @Column(name = "company_to", columnDefinition = "char(2)", nullable = true)
    private String companyTo;
    @Column(name = "recibe", columnDefinition = "char(2)", nullable = true)
    private String recibe;
    @Column(name = "permit_id", columnDefinition = "char(1)", nullable = true)
    private String permitId;
    @Column(name = "reason_id", columnDefinition = "char(3)", nullable = true)
    private String reasonId;
    @Column(name = "trx_number", columnDefinition = "numeric(8)", nullable = true)
    private BigDecimal trxNumber;
    @Column(name = "ambiente", columnDefinition = "numeric(1)", nullable = true)
    private Integer ambiente;
    @Column(name = "local_id", columnDefinition = "char(3)", nullable = true)
    private String localId;
    @Column(name = "issue_id", columnDefinition = "char(2)", nullable = true)
    private String issueId;
    @Column(name = "order_number", columnDefinition = "numeric(9)", nullable = false)
    private BigDecimal orderNumber;
    @Column(name = "tipo_emision", columnDefinition = "numeric(1)", nullable = true)
    private Integer tipoEmision;
    @Column(name = "invoice_number", columnDefinition = "varchar(30)", nullable = true)
    private String invoiceNumber;
    @Column(name = "source_date", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date sourceDate;
    @Column(name = "order_date", columnDefinition = "smalldatetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "kilometer", columnDefinition = "numeric(6)", nullable = false)
    private BigDecimal kilometer;
    @Column(name = "quotation_number", columnDefinition = "numeric(8)", nullable = false)
    private BigDecimal quotationNumber;
    @Column(name = "pedido_number", columnDefinition = "numeric(8)", nullable = false)
    private BigDecimal pedidoNumber;
    @Column(name = "price_type", columnDefinition = "tinyint", nullable = true)
    private Integer priceType;
    @Column(name = "car_number", columnDefinition = "tinyint", nullable = true)
    private Integer carNumber;
    @ManyToOne
    @ForeignKey(name = "FK_orders_cost_centers")
    @JoinColumn(name = "job_id", referencedColumnName = "job_id")
    private CostCenters costCenters;
    @ManyToOne
    @ForeignKey(name = "FK__orders__credit_t__38996AB5")
    @JoinColumn(name = "credit_term_id", referencedColumnName = "credit_term_id")
    private CreditTerms creditTerms;
    @Column(name = "deliver_by", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date deliverBy;
    @Column(name = "visit_by", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date visitBy;
    @Column(name = "with_tax", columnDefinition = "bit", nullable = true)
    private Boolean withTax;
    @Column(name = "notes", columnDefinition = "varchar(100)", nullable = true)
    private String notes;
    @Column(name = "cashier_id", columnDefinition = "char(6)", nullable = true)
    private String cashierId;
    @Column(name = "employee_id", columnDefinition = "char(6)", nullable = false)
    private String employeeId;
    @ManyToOne
    @ForeignKey(name = "FK__orders__salesman__398D8EEE")
    @JoinColumn(name = "salesman_id", referencedColumnName = "salesman_id")
    private Salesmen salesman;
    @Column(name = "detail_discount", columnDefinition = "money", nullable = false)
    private BigDecimal detailDiscount;
    @Column(name = "discount", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal discount;
    @Column(name = "extra_discount", columnDefinition = "money", nullable = false)
    private BigDecimal extraDiscount;
    @Column(name = "fic_discount", columnDefinition = "money", nullable = false)
    private BigDecimal ficDiscount;
    @Column(name = "taxable", columnDefinition = "money", nullable = false)
    private BigDecimal taxable;
    @Column(name = "total_exento", columnDefinition = "money", nullable = false)
    private BigDecimal totalExento;
    @Column(name = "no_tax_value", columnDefinition = "money", nullable = false)
    private BigDecimal noTaxValue;
    @Column(name = "ice_value", columnDefinition = "money", nullable = false)
    private BigDecimal iceValue;
    @Column(name = "tax_total", columnDefinition = "money", nullable = false)
    private BigDecimal taxTotal;
    @Column(name = "finance", columnDefinition = "money", nullable = false)
    private BigDecimal finance;
    @Column(name = "freight", columnDefinition = "money", nullable = false)
    private BigDecimal freight;
    @Column(name = "freight1", columnDefinition = "money", nullable = false)
    private BigDecimal freight1;
    @Column(name = "cost", columnDefinition = "money", nullable = false)
    private BigDecimal cost;
    @Column(name = "cost_last", columnDefinition = "money", nullable = false)
    private BigDecimal costLast;
    @Column(name = "total", columnDefinition = "money", nullable = false)
    private BigDecimal total;
    @ManyToOne
    @JoinColumn(name = "journal_id", referencedColumnName = "journal_id")
    @ForeignKey(name = "FK__orders__journal___37A5467C")
    private Journals journals;
    @Column(name = "check_id", columnDefinition = "int", nullable = true)
    private Integer checkId;
    @Column(name = "cross_id", columnDefinition = "int", nullable = true)
    private Integer crossId;
    @Column(name = "oldone", columnDefinition = "bit", nullable = true)
    private Boolean oldone;
    @Column(name = "date_time", columnDefinition = "datetime", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateTime;
    @Column(name = "iva_included", columnDefinition = "bit", nullable = true)
    private Boolean ivaIncluded;
    @Column(name = "unposted", columnDefinition = "bit", nullable = true)
    private Boolean unposted;
    @Column(name = "retenido", columnDefinition = "bit", nullable = true)
    private Boolean retenido;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @Column(name = "tax_perc", columnDefinition = "tinyint", nullable = false)
    private Integer taxPerc;
    @Column(name = "pending", columnDefinition = "bit", nullable = true)
    private Boolean pending;
    @Column(name = "cash", columnDefinition = "money", nullable = true)
    private BigDecimal cash;
    @Column(name = "change1", columnDefinition = "money", nullable = true)
    private BigDecimal change1;
    @Column(name = "guiar_date", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date guiarDate;
    @Column(name = "truck_id", columnDefinition = "char(2)", nullable = true)
    private String truckId;
    @Column(name = "product_id", columnDefinition = "char(20)", nullable = true)
    private String productId;
    @Column(name = "out_discount", columnDefinition = "money", nullable = false)
    private BigDecimal outDiscount;
    @Column(name = "sustento_id", columnDefinition = "char(3)", nullable = true)
    private String sustentoId;
    @Column(name = "credito_tributario", columnDefinition = "bit", nullable = true)
    private Boolean creditoTributario;
    @Column(name = "comp_id", columnDefinition = "char(2)", nullable = true)
    private String compId;
    @Column(name = "autorizacion", columnDefinition = "varchar(49)", nullable = true)
    private String autorizacion;
    @Column(name = "valid_to", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date validTo;
    @Column(name = "ice_taxable", columnDefinition = "money", nullable = false)
    private BigDecimal iceTaxable;
    @Column(name = "ice_code", columnDefinition = "char(1)", nullable = true)
    private String iceCode;
    @Column(name = "ice_total", columnDefinition = "money", nullable = false)
    private BigDecimal iceTotal;
    @Column(name = "services", columnDefinition = "money", nullable = true)
    private BigDecimal services;
    @Column(name = "service_tax", columnDefinition = "money", nullable = false)
    private BigDecimal serviceTax;
    @Column(name = "iva_return", columnDefinition = "char(1)", nullable = false)
    private String ivaReturn;
    @Column(name = "no_comps", columnDefinition = "numeric(3)", nullable = false)
    private Integer noComps;
    @Column(name = "account_id", columnDefinition = "varchar(20)", nullable = true)
    private String accountId;
    @Column(name = "almacen_id", columnDefinition = "char(2)", nullable = true)
    private String almacenId;
    @ManyToOne
    @ForeignKey(name = "FK__orders__tpedido___36B12243")
    @JoinColumn(name = "tpedido_id", referencedColumnName = "tpedido_id")
    private Tpedidos tPedido;
    @ManyToOne
    @ForeignKey(name = "FK__orders__tentrega__35BCFE0A")
    @JoinColumn(name = "tentrega_id", referencedColumnName = "tentrega_id")
    private Tentregas tEntrega;
    @Column(name = "fentrega", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fentrega;
    @ManyToOne
    @ForeignKey(name = "FK__orders__status_i__34C8D9D1")
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    private Status status;
    @Column(name = "fautorizado", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fautorizado;
    @Column(name = "fconfirmado", columnDefinition = "datetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fconfirmado;
    @Column(name = "autorizado_by", columnDefinition = "varchar(6)", nullable = true)
    private String autorizadoBy;
    @Column(name = "confirmado_by", columnDefinition = "varchar(6)", nullable = true)
    private String confirmadoBy;
    @Column(name = "newone", columnDefinition = "bit", nullable = true)
    private Boolean newone;
    @Column(name = "degso", columnDefinition = "text", nullable = true)
    private String degso;
    @Column(name = "to_attach", columnDefinition = "text", nullable = true)
    private String toAttach;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderLineItems> orderItems;

    @MapsId("customer_id")
    @ManyToOne
    @ForeignKey(name = "FK__orders__3B75D760")
    @JoinColumns({
        @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
        ,
        @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    })
    private Customers OrdersCustomersFK;

    public Orders() {
    }

    public List<OrderLineItems> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderLineItems> orderItems) {
        this.orderItems = orderItems;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
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

    public Branches getCompanyBodegaFK() {
        return companyBodegaFK;
    }

    public void setCompanyBodegaFK(Branches companyBodegaFK) {
        this.companyBodegaFK = companyBodegaFK;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getShipToId() {
        return shipToId;
    }

    public void setShipToId(String shipToId) {
        this.shipToId = shipToId;
    }

    public String getBodegaId() {
        return bodegaId;
    }

    public void setBodegaId(String bodegaId) {
        this.bodegaId = bodegaId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getCompanyTo() {
        return companyTo;
    }

    public void setCompanyTo(String companyTo) {
        this.companyTo = companyTo;
    }

    public String getRecibe() {
        return recibe;
    }

    public void setRecibe(String recibe) {
        this.recibe = recibe;
    }

    public String getPermitId() {
        return permitId;
    }

    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public BigDecimal getTrxNumber() {
        return trxNumber;
    }

    public void setTrxNumber(BigDecimal trxNumber) {
        this.trxNumber = trxNumber;
    }

    public Integer getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Integer ambiente) {
        this.ambiente = ambiente;
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

    public BigDecimal getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getTipoEmision() {
        return tipoEmision;
    }

    public void setTipoEmision(Integer tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getKilometer() {
        return kilometer;
    }

    public void setKilometer(BigDecimal kilometer) {
        this.kilometer = kilometer;
    }

    public BigDecimal getQuotationNumber() {
        return quotationNumber;
    }

    public void setQuotationNumber(BigDecimal quotationNumber) {
        this.quotationNumber = quotationNumber;
    }

    public BigDecimal getPedidoNumber() {
        return pedidoNumber;
    }

    public void setPedidoNumber(BigDecimal pedidoNumber) {
        this.pedidoNumber = pedidoNumber;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public CostCenters getCostCenters() {
        return costCenters;
    }

    public void setCostCenters(CostCenters costCenters) {
        this.costCenters = costCenters;
    }

    public CreditTerms getCreditTerms() {
        return creditTerms;
    }

    public void setCreditTerms(CreditTerms creditTerms) {
        this.creditTerms = creditTerms;
    }

    public Date getDeliverBy() {
        return deliverBy;
    }

    public void setDeliverBy(Date deliverBy) {
        this.deliverBy = deliverBy;
    }

    public Date getVisitBy() {
        return visitBy;
    }

    public void setVisitBy(Date visitBy) {
        this.visitBy = visitBy;
    }

    public Boolean getWithTax() {
        return withTax;
    }

    public void setWithTax(Boolean withTax) {
        this.withTax = withTax;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCashierId() {
        return cashierId;
    }

    public void setCashierId(String cashierId) {
        this.cashierId = cashierId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Salesmen getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesmen salesman) {
        this.salesman = salesman;
    }

    public BigDecimal getDetailDiscount() {
        return detailDiscount;
    }

    public void setDetailDiscount(BigDecimal detailDiscount) {
        this.detailDiscount = detailDiscount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(BigDecimal extraDiscount) {
        this.extraDiscount = extraDiscount;
    }

    public BigDecimal getFicDiscount() {
        return ficDiscount;
    }

    public void setFicDiscount(BigDecimal ficDiscount) {
        this.ficDiscount = ficDiscount;
    }

    public BigDecimal getTaxable() {
        return taxable;
    }

    public void setTaxable(BigDecimal taxable) {
        this.taxable = taxable;
    }

    public BigDecimal getTotalExento() {
        return totalExento;
    }

    public void setTotalExento(BigDecimal totalExento) {
        this.totalExento = totalExento;
    }

    public BigDecimal getNoTaxValue() {
        return noTaxValue;
    }

    public void setNoTaxValue(BigDecimal noTaxValue) {
        this.noTaxValue = noTaxValue;
    }

    public BigDecimal getIceValue() {
        return iceValue;
    }

    public void setIceValue(BigDecimal iceValue) {
        this.iceValue = iceValue;
    }

    public BigDecimal getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(BigDecimal taxTotal) {
        this.taxTotal = taxTotal;
    }

    public BigDecimal getFinance() {
        return finance;
    }

    public void setFinance(BigDecimal finance) {
        this.finance = finance;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public BigDecimal getFreight1() {
        return freight1;
    }

    public void setFreight1(BigDecimal freight1) {
        this.freight1 = freight1;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCostLast() {
        return costLast;
    }

    public void setCostLast(BigDecimal costLast) {
        this.costLast = costLast;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Journals getJournals() {
        return journals;
    }

    public void setJournals(Journals journals) {
        this.journals = journals;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public Integer getCrossId() {
        return crossId;
    }

    public void setCrossId(Integer crossId) {
        this.crossId = crossId;
    }

    public Boolean getOldone() {
        return oldone;
    }

    public void setOldone(Boolean oldone) {
        this.oldone = oldone;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Boolean getIvaIncluded() {
        return ivaIncluded;
    }

    public void setIvaIncluded(Boolean ivaIncluded) {
        this.ivaIncluded = ivaIncluded;
    }

    public Boolean getUnposted() {
        return unposted;
    }

    public void setUnposted(Boolean unposted) {
        this.unposted = unposted;
    }

    public Boolean getRetenido() {
        return retenido;
    }

    public void setRetenido(Boolean retenido) {
        this.retenido = retenido;
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

    public Integer getTaxPerc() {
        return taxPerc;
    }

    public void setTaxPerc(Integer taxPerc) {
        this.taxPerc = taxPerc;
    }

    public Boolean getPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public BigDecimal getChange1() {
        return change1;
    }

    public void setChange1(BigDecimal change1) {
        this.change1 = change1;
    }

    public Date getGuiarDate() {
        return guiarDate;
    }

    public void setGuiarDate(Date guiarDate) {
        this.guiarDate = guiarDate;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getOutDiscount() {
        return outDiscount;
    }

    public void setOutDiscount(BigDecimal outDiscount) {
        this.outDiscount = outDiscount;
    }

    public String getSustentoId() {
        return sustentoId;
    }

    public void setSustentoId(String sustentoId) {
        this.sustentoId = sustentoId;
    }

    public Boolean getCreditoTributario() {
        return creditoTributario;
    }

    public void setCreditoTributario(Boolean creditoTributario) {
        this.creditoTributario = creditoTributario;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
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

    public BigDecimal getIceTaxable() {
        return iceTaxable;
    }

    public void setIceTaxable(BigDecimal iceTaxable) {
        this.iceTaxable = iceTaxable;
    }

    public String getIceCode() {
        return iceCode;
    }

    public void setIceCode(String iceCode) {
        this.iceCode = iceCode;
    }

    public BigDecimal getIceTotal() {
        return iceTotal;
    }

    public void setIceTotal(BigDecimal iceTotal) {
        this.iceTotal = iceTotal;
    }

    public BigDecimal getServices() {
        return services;
    }

    public void setServices(BigDecimal services) {
        this.services = services;
    }

    public BigDecimal getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(BigDecimal serviceTax) {
        this.serviceTax = serviceTax;
    }

    public String getIvaReturn() {
        return ivaReturn;
    }

    public void setIvaReturn(String ivaReturn) {
        this.ivaReturn = ivaReturn;
    }

    public Integer getNoComps() {
        return noComps;
    }

    public void setNoComps(Integer noComps) {
        this.noComps = noComps;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAlmacenId() {
        return almacenId;
    }

    public void setAlmacenId(String almacenId) {
        this.almacenId = almacenId;
    }

    public Tpedidos gettPedido() {
        return tPedido;
    }

    public void settPedido(Tpedidos tPedido) {
        this.tPedido = tPedido;
    }

    public Tentregas gettEntrega() {
        return tEntrega;
    }

    public void settEntrega(Tentregas tEntrega) {
        this.tEntrega = tEntrega;
    }

    public Date getFentrega() {
        return fentrega;
    }

    public void setFentrega(Date fentrega) {
        this.fentrega = fentrega;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getFautorizado() {
        return fautorizado;
    }

    public void setFautorizado(Date fautorizado) {
        this.fautorizado = fautorizado;
    }

    public Date getFconfirmado() {
        return fconfirmado;
    }

    public void setFconfirmado(Date fconfirmado) {
        this.fconfirmado = fconfirmado;
    }

    public String getAutorizadoBy() {
        return autorizadoBy;
    }

    public void setAutorizadoBy(String autorizadoBy) {
        this.autorizadoBy = autorizadoBy;
    }

    public String getConfirmadoBy() {
        return confirmadoBy;
    }

    public void setConfirmadoBy(String confirmadoBy) {
        this.confirmadoBy = confirmadoBy;
    }

    public Boolean getNewone() {
        return newone;
    }

    public void setNewone(Boolean newone) {
        this.newone = newone;
    }

    public String getDegso() {
        return degso;
    }

    public void setDegso(String degso) {
        this.degso = degso;
    }

    public String getToAttach() {
        return toAttach;
    }

    public void setToAttach(String toAttach) {
        this.toAttach = toAttach;
    }

    public Customers getOrdersCustomersFK() {
        return OrdersCustomersFK;
    }

    public void setOrdersCustomersFK(Customers OrdersCustomersFK) {
        this.OrdersCustomersFK = OrdersCustomersFK;
    }

}
