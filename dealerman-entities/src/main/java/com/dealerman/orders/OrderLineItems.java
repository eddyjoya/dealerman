package com.dealerman.orders;

import com.dealerman.general.Branches;
import com.dealerman.inventary.Packages;
import com.dealerman.inventary.Products;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "order_line_items")
public class OrderLineItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odetail_id", columnDefinition = "int")
    private Integer odetailId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ForeignKey(name = "FK__order_lin__order__7D439ABD")
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable = false)
    private Orders order;
    @ManyToOne(optional = false)
    @ForeignKey(name = "FK__order_lin__produ__7C4F7684")
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Products product;
    @Column(name = "serial_no", columnDefinition = "char(1)", nullable = true)
    private String serialNo;
    @Column(name = "n_pieces", columnDefinition = "numeric(3)", nullable = true)
    private BigDecimal nPieces;
    @ManyToOne
    @ForeignKey(name = "FK__order_lin__packa__7A672E12")
    @JoinColumn(name = "package_id", referencedColumnName = "package_id", nullable = false)
    private Packages packages;
    @Column(name = "unit_id", columnDefinition = "char(1)", nullable = true)
    private String unitId;
    @Column(name = "quantity", columnDefinition = "numeric(11,3)", nullable = false)
    private BigDecimal quantity;
    @Column(name = "price_type", columnDefinition = "tinyint", nullable = false)
    private Integer priceType;
    @Column(name = "unit_price", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice;
    @Column(name = "discount1", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal discount1;
    @Column(name = "discount2", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal discount2;
    @Column(name = "discount_value", columnDefinition = "money", nullable = true)
    private BigDecimal discountValue;
    @Column(name = "total_price", columnDefinition = "money", nullable = true)
    private BigDecimal totalPrice;
    @Column(name = "ice_value", columnDefinition = "money", nullable = true)
    private BigDecimal iceValue;
    @Column(name = "tax", columnDefinition = "tinyint", nullable = false)
    private Integer tax;
    @Column(name = "no_tax_object", columnDefinition = "bit", nullable = true)
    private Boolean noTaxObject;
    @Column(name = "tax_value", columnDefinition = "money", nullable = true)
    private BigDecimal taxValue;
    @Column(name = "total_cost", columnDefinition = "money", nullable = false)
    private BigDecimal totalCost;
    @Column(name = "last_cost", columnDefinition = "money", nullable = false)
    private BigDecimal lastCost;
    @Column(name = "bonus", columnDefinition = "numeric(5)", nullable = false)
    private Integer bonus;
    @Column(name = "ice", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal ice;
    @Column(name = "notes", columnDefinition = "varchar(300)", nullable = true)
    private String notes;
    @Column(name = "fob_price", columnDefinition = "money", nullable = false)
    private BigDecimal fobPrice;
    @Column(name = "alicuota", columnDefinition = "numeric(6,4)", nullable = false)
    private BigDecimal alicuota;
    @Column(name = "qty1", columnDefinition = "numeric(11,3)", nullable = true)
    private BigDecimal qty1;
    @Column(name = "service", columnDefinition = "bit", nullable = false)
    private Boolean service;
    @Column(name = "ln_o", columnDefinition = "numeric(4)", nullable = true)
    private Integer lnO;
    @Column(name = "o_id", columnDefinition = "int", nullable = true)
    private Integer oId;
    @Column(name = "e_id", columnDefinition = "int", nullable = true)
    private Integer eId;

    @ManyToOne(optional = false)
    @ForeignKey(name = "FK__order_line_items__7B5B524B")
    @JoinColumns({
        @JoinColumn(name = "company_id", referencedColumnName = "company_id")
        ,
        @JoinColumn(name = "bodega_id", referencedColumnName = "bodega_id")
    })
    private Branches branch;

    @Transient
    private BigDecimal totalPriceBruto;

    public OrderLineItems() {
    }

    @Override
    public String toString() {
        return "OrderLineItems{" + "odetailId=" + odetailId + ", order=" + order + ", product=" + product + ", serialNo=" + serialNo + ", nPieces=" + nPieces + ", packages=" + packages + ", unitId=" + unitId + ", quantity=" + quantity + ", priceType=" + priceType + ", unitPrice=" + unitPrice + ", discount1=" + discount1 + ", discount2=" + discount2 + ", discountValue=" + discountValue + ", totalPrice=" + totalPrice + ", iceValue=" + iceValue + ", tax=" + tax + ", noTaxObject=" + noTaxObject + ", taxValue=" + taxValue + ", totalCost=" + totalCost + ", lastCost=" + lastCost + ", bonus=" + bonus + ", ice=" + ice + ", notes=" + notes + ", fobPrice=" + fobPrice + ", alicuota=" + alicuota + ", qty1=" + qty1 + ", service=" + service + ", lnO=" + lnO + ", oId=" + oId + ", eId=" + eId + ", branch=" + branch + ", totalPriceBruto=" + totalPriceBruto + '}';
    }

    public BigDecimal getTotalPriceBruto() {
        return totalPriceBruto;
    }

    public void setTotalPriceBruto(BigDecimal totalPriceBruto) {
        this.totalPriceBruto = totalPriceBruto;
    }

    public Integer getOdetailId() {
        return odetailId;
    }

    public void setOdetailId(Integer odetailId) {
        this.odetailId = odetailId;
    }

    public Branches getBranch() {
        return branch;
    }

    public void setBranch(Branches branch) {
        this.branch = branch;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public BigDecimal getnPieces() {
        return nPieces;
    }

    public void setnPieces(BigDecimal nPieces) {
        this.nPieces = nPieces;
    }

    public Packages getPackages() {
        return packages;
    }

    public void setPackages(Packages packages) {
        this.packages = packages;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getDiscount1() {
        return discount1;
    }

    public void setDiscount1(BigDecimal discount1) {
        this.discount1 = discount1;
    }

    public BigDecimal getDiscount2() {
        return discount2;
    }

    public void setDiscount2(BigDecimal discount2) {
        this.discount2 = discount2;
    }

    public BigDecimal getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(BigDecimal discountValue) {
        this.discountValue = discountValue;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getIceValue() {
        return iceValue;
    }

    public void setIceValue(BigDecimal iceValue) {
        this.iceValue = iceValue;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Boolean getNoTaxObject() {
        return noTaxObject;
    }

    public void setNoTaxObject(Boolean noTaxObject) {
        this.noTaxObject = noTaxObject;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(BigDecimal taxValue) {
        this.taxValue = taxValue;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getLastCost() {
        return lastCost;
    }

    public void setLastCost(BigDecimal lastCost) {
        this.lastCost = lastCost;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getIce() {
        return ice;
    }

    public void setIce(BigDecimal ice) {
        this.ice = ice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public BigDecimal getFobPrice() {
        return fobPrice;
    }

    public void setFobPrice(BigDecimal fobPrice) {
        this.fobPrice = fobPrice;
    }

    public BigDecimal getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(BigDecimal alicuota) {
        this.alicuota = alicuota;
    }

    public BigDecimal getQty1() {
        return qty1;
    }

    public void setQty1(BigDecimal qty1) {
        this.qty1 = qty1;
    }

    public Boolean getService() {
        return service;
    }

    public void setService(Boolean service) {
        this.service = service;
    }

    public Integer getLnO() {
        return lnO;
    }

    public void setLnO(Integer lnO) {
        this.lnO = lnO;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

}
