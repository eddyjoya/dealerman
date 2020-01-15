/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityInventary;

import com.dealerman.entityGeneral.Countries;
import com.dealerman.entityOrders.Customers;
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
@Table(name = "products")
public class Products implements Serializable {

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Column(name = "aplicacion", columnDefinition = "char(1)", nullable = false)
    private String aplicacion;
    @Id
    @Column(name = "product_id", columnDefinition = "char(25)")
    private String productId;
    @ManyToOne
    @ForeignKey(name = "FK__products__catego__72C60C4A")
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    @ManyToOne
    @ForeignKey(name = "FK__products__countr__73BA3083")
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Countries country;
    @Column(name = "alterno", columnDefinition = "varchar(25)", nullable = true)
    private String alterno;
    @Column(name = "owner_company_id", columnDefinition = "char(2)", nullable = true)
    private String ownerCompanyId;
    @Column(name = "owner_bodega_id", columnDefinition = "char(2)", nullable = true)
    private String ownerBodegaId;
    @Column(name = "customer_id", columnDefinition = "char(13)", nullable = true)
    private String customerId;
    @ManyToOne
    @ForeignKey(name = "FK__products__group___778AC167")
    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
    private ProductGroups productGroup;
    @ManyToOne
    @ForeignKey(name = "FK__products__p_grou__76969D2E")
    @JoinColumn(name = "p_group_id", referencedColumnName = "p_group_id")
    private PriceGroups priceGroup;
    @Column(name = "product_name", columnDefinition = "varchar(50)", nullable = true)
    private String productName;
    @Column(name = "english_name", columnDefinition = "varchar(20)", nullable = true)
    private String englishName;
    @Column(name = "tipo", columnDefinition = "varchar(2)", nullable = true)
    private String tipo;
    @Column(name = "cod_fabrica", columnDefinition = "varchar(20)", nullable = true)
    private String codFabrica;
    @Column(name = "estado", columnDefinition = "char(1)", nullable = true)
    private String estado;
    @Column(name = "promo_desde", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date promoDesde;
    @Column(name = "promo_hasta", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date promoHasta;
    @Column(name = "promo_dscto", columnDefinition = "numeric(5,2)", nullable = true)
    private BigDecimal promoDscto;
    @Column(name = "cant_min_pedido", columnDefinition = "int", nullable = true)
    private Integer cantMinPedido;
    @Column(name = "cubicaje", columnDefinition = "numeric(5,2)", nullable = true)
    private BigDecimal cubicaje;
    @Column(name = "just_integers", columnDefinition = "bit", nullable = true)
    private Boolean justIntegers;
    @Column(name = "quantity_code", columnDefinition = "char(1)", nullable = false)
    private String quantityCode;
    @Column(name = "quantity_in_unit", columnDefinition = "varchar(20)", nullable = true)
    private String quantityInUnit;
    @Column(name = "quantity_number", columnDefinition = "numeric(3)", nullable = false)
    private Integer quantityNumber;
    @Column(name = "fob_price", columnDefinition = "money", nullable = false)
    private BigDecimal fobPrice;
    @Column(name = "prev_market_cost", columnDefinition = "money", nullable = false)
    private BigDecimal prevMarketCost;
    @Column(name = "last_market_cost", columnDefinition = "money", nullable = false)
    private BigDecimal lastMarketCost;
    @Column(name = "from_0", columnDefinition = "tinyint", nullable = false)
    private Integer from_0;
    @Column(name = "to_0", columnDefinition = "numeric(3)", nullable = false)
    private Integer to_0;
    @Column(name = "perc_0", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_0;
    @Column(name = "perc_0sf", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_0sf;
    @Column(name = "unit_price", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice;
    @Column(name = "unit_pricesf", columnDefinition = "money", nullable = false)
    private BigDecimal unitPricesf;
    @Column(name = "unit", columnDefinition = "varchar(13)", nullable = true)
    private String unit;
    @Column(name = "to_1", columnDefinition = "numeric(3)", nullable = false)
    private Integer to_1;
    @Column(name = "perc_1", columnDefinition = "numeric(6,2)", nullable = false)
    private Integer perc_1;
    @Column(name = "perc_1sf", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_1sf;
    @Column(name = "unit_price1", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice1;
    @Column(name = "unit_price1sf", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice1sf;
    @Column(name = "unit1", columnDefinition = "varchar(13)", nullable = true)
    private String unit1;
    @Column(name = "to_2", columnDefinition = "numeric(3)", nullable = false)
    private Integer to_2;
    @Column(name = "perc_2", columnDefinition = "numeric(6,2)", nullable = false)
    private Integer perc_2;
    @Column(name = "perc_2sf", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_2sf;
    @Column(name = "unit_price2", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice2;
    @Column(name = "unit_price2sf", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice2sf;
    @Column(name = "unit2", columnDefinition = "varchar(13)", nullable = true)
    private String unit2;
    @Column(name = "to_3", columnDefinition = "numeric(3)", nullable = false)
    private Integer to_3;
    @Column(name = "perc_3", columnDefinition = "numeric(6,2)", nullable = false)
    private Integer perc_3;
    @Column(name = "perc_3sf", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_3sf;
    @Column(name = "unit_price3", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice3;
    @Column(name = "unit_price3sf", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice3sf;
    @Column(name = "unit3", columnDefinition = "varchar(13)", nullable = true)
    private String unit3;
    @Column(name = "to_4", columnDefinition = "numeric(6)", nullable = false)
    private Integer to_4;
    @Column(name = "perc_4", columnDefinition = "numeric(6,2)", nullable = false)
    private Integer perc_4;
    @Column(name = "perc_4sf", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_4sf;
    @Column(name = "unit_price4", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice4;
    @Column(name = "unit_price4sf", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice4sf;
    @Column(name = "to_5", columnDefinition = "numeric(6)", nullable = false)
    private Integer to_5;
    @Column(name = "perc_5", columnDefinition = "numeric(6,2)", nullable = false)
    private Integer perc_5;
    @Column(name = "perc_5sf", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal perc_5sf;
    @Column(name = "unit_price5", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice5;
    @Column(name = "unit_price5sf", columnDefinition = "money", nullable = false)
    private BigDecimal unitPrice5sf;
    @Column(name = "cty01", columnDefinition = "numeric(6,2)", nullable = true)
    private BigDecimal cty01;
    @Column(name = "unit_price_cty01", columnDefinition = "money", nullable = true)
    private BigDecimal unitPriceCty01;
    @Column(name = "cty02", columnDefinition = "numeric(6,2)", nullable = true)
    private BigDecimal cty02;
    @Column(name = "unit_price_cty02", columnDefinition = "money", nullable = true)
    private BigDecimal unitPriceCty02;
    @Column(name = "cty03", columnDefinition = "numeric(6,2)", nullable = true)
    private BigDecimal cty03;
    @Column(name = "unit_price_cty03", columnDefinition = "money", nullable = true)
    private BigDecimal unitPriceCty03;
    @Column(name = "cty04", columnDefinition = "numeric(6,2)", nullable = true)
    private BigDecimal cty04;
    @Column(name = "unit_price_cty04", columnDefinition = "money", nullable = true)
    private BigDecimal unitPriceCty04;
    @Column(name = "cty05", columnDefinition = "numeric(6,2)", nullable = true)
    private BigDecimal cty05;
    @Column(name = "unit_price_cty05", columnDefinition = "money", nullable = true)
    private BigDecimal unitPriceCty05;
    @Column(name = "retail_price", columnDefinition = "money", nullable = false)
    private BigDecimal retailPrice;
    @Column(name = "package", columnDefinition = "varchar(25)", nullable = true)
    private String packages;
    @Column(name = "factor", columnDefinition = "numeric(8,2)", nullable = false)
    private BigDecimal factor;
    @Column(name = "weight", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal weight;
    @Column(name = "weight1", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal weight1;
    @ManyToOne
    @ForeignKey(name = "FK__products__packag__75A278F5")
    @JoinColumn(name = "package_id", referencedColumnName = "package_id")
    private Packages packageEn;
    @Column(name = "description", columnDefinition = "varchar(254)", nullable = true)
    private String description;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "pay_tax", columnDefinition = "bit", nullable = true)
    private Boolean payTax;
    @Column(name = "no_tax_object", columnDefinition = "bit", nullable = true)
    private Boolean noTaxObject;
    @Column(name = "last_purchase_date", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastPurchaseDate;
    @Column(name = "d_unit_price", columnDefinition = "money", nullable = false)
    private BigDecimal dUnitPrice;
    @Column(name = "d_last_purchase_price", columnDefinition = "money", nullable = false)
    private BigDecimal dLastPurchasePrice;
    @Column(name = "d_last_purchase_discount", columnDefinition = "money", nullable = false)
    private BigDecimal dLastPurchaseDiscount;
    @Column(name = "d_last_purchase_discount1", columnDefinition = "money", nullable = false)
    private BigDecimal dLastPurchaseDiscount1;
    @Column(name = "family_id", columnDefinition = "varchar(4)", nullable = true)
    private String familyId;
    @Column(name = "categ_id", columnDefinition = "char(1)", nullable = false)
    private String categId;
    @Column(name = "line_id", columnDefinition = "char(1)", nullable = false)
    private String lineId;
    @ManyToOne
    @ForeignKey(name = "FK__products__brand___74AE54BC")
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    private PBrands pBrand;
    @Column(name = "presenta_id", columnDefinition = "char(2)", nullable = true)
    private String presentaId;
    @Column(name = "pgroup_id", columnDefinition = "char(2)", nullable = true)
    private String pgroupId;
    @Column(name = "employee_id", columnDefinition = "char(6)", nullable = false)
    private String employeeId;
    @Column(name = "created", columnDefinition = "smalldatetime", nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @Column(name = "volume", columnDefinition = "numeric(7,3)", nullable = false)
    private BigDecimal volume;
    @Column(name = "stockne", columnDefinition = "numeric(12,3)", nullable = false)
    private BigDecimal stockne;
    @Column(name = "bonus", columnDefinition = "varchar(25)", nullable = true)
    private String bonus;
    @Column(name = "serials", columnDefinition = "bit", nullable = true)
    private Boolean serials;
    @Column(name = "pricechanged", columnDefinition = "bit", nullable = true)
    private Boolean pricechanged;
    @Column(name = "toledo", columnDefinition = "bit", nullable = true)
    private Boolean toledo;
    @Column(name = "toprint", columnDefinition = "bit", nullable = true)
    private Boolean toprint;
    @Column(name = "cemento", columnDefinition = "bit", nullable = true)
    private Boolean cemento;
    @Column(name = "flete", columnDefinition = "numeric(4,2)", nullable = false)
    private BigDecimal flete;
    @Column(name = "service", columnDefinition = "bit", nullable = true)
    private Boolean service;
    @Column(name = "ice", columnDefinition = "bit", nullable = true)
    private Boolean ice;
    @Column(name = "ice_id", columnDefinition = "varchar(4)", nullable = true)
    private String iceId;
    @Column(name = "flete_perc", columnDefinition = "numeric(5,2)", nullable = false)
    private BigDecimal fletePerc;
    @Column(name = "internac", columnDefinition = "numeric(6,2)", nullable = false)
    private BigDecimal internac;
    @Column(name = "uunits", columnDefinition = "bit", nullable = true)
    private Boolean uunits;
    @Column(name = "no_units", columnDefinition = "numeric(3)", nullable = false)
    private Integer noUnits;
    @Column(name = "observ", columnDefinition = "varchar(53)", nullable = true)
    private String observ;
    @Column(name = "tipart", columnDefinition = "char(1)", nullable = true)
    private String tipart;
    @Column(name = "estpro", columnDefinition = "char(1)", nullable = true)
    private String estpro;
    @Column(name = "seccion", columnDefinition = "varchar(4)", nullable = true)
    private String seccion;
    @Column(name = "serie", columnDefinition = "varchar(4)", nullable = true)
    private String serie;
    @Column(name = "rin", columnDefinition = "varchar(2)", nullable = true)
    private String rin;
    @Column(name = "p_cHile", columnDefinition = "numeric(1)", nullable = true)
    private Integer pCHile;
    @Column(name = "p_olmedo", columnDefinition = "numeric(1)", nullable = true)
    private Integer pOlmedo;
    @Column(name = "p_eloy", columnDefinition = "numeric(1)", nullable = true)
    private Integer pEloy;
    @Column(name = "p_amazoNas", columnDefinition = "numeric(1)", nullable = true)
    private Integer pAmazoNas;
    @Column(name = "p_plazagrande", columnDefinition = "numeric(1)", nullable = true)
    private Integer pPlazaGrande;
    @Column(name = "p_luque", columnDefinition = "numeric(1)", nullable = true)
    private Integer pLuque;
    @Column(name = "p_urdesa", columnDefinition = "numeric(1)", nullable = true)
    private Integer pUrdesa;
    @Column(name = "p_recreo1", columnDefinition = "numeric(1)", nullable = true)
    private Integer pRecreo1;
    @Column(name = "p_condado", columnDefinition = "numeric(1)", nullable = true)
    private Integer pCondado;
    @Column(name = "p_colon", columnDefinition = "numeric(1)", nullable = true)
    private Integer pColon;
    @Column(name = "p_recreo2", columnDefinition = "numeric(1)", nullable = true)
    private Integer pRecreo2;
    @Column(name = "p_nacionesunidas", columnDefinition = "numeric(1)", nullable = true)
    private Integer pNacionesUnidas;
    @Column(name = "p_cumbaya", columnDefinition = "numeric(1)", nullable = true)
    private Integer pCumbaya;
    @Column(name = "p_andes", columnDefinition = "numeric(1)", nullable = true)
    private Integer pAndes;
    @Column(name = "p_bosque", columnDefinition = "numeric(1)", nullable = true)
    private Integer pBosque;
    @Column(name = "p_policentro", columnDefinition = "numeric(1)", nullable = true)
    private Integer pPolicentro;
    @Column(name = "p_duran", columnDefinition = "numeric(1)", nullable = true)
    private Integer pDuran;
    @Column(name = "p_cevallos", columnDefinition = "numeric(1)", nullable = true)
    private Integer pCevallos;
    @Column(name = "p_9octubre", columnDefinition = "numeric(1)", nullable = true)
    private Integer p9Octubre;
    @Column(name = "p_dorado", columnDefinition = "numeric(1)", nullable = true)
    private Integer pDorado;
    @Column(name = "p_quicentro", columnDefinition = "numeric(1)", nullable = true)
    private Integer pQuicentro;
    @Column(name = "p_paseo", columnDefinition = "numeric(1)", nullable = true)
    private Integer pPaseo;
    @Column(name = "p_portal", columnDefinition = "numeric(1)", nullable = true)
    private Integer pPortal;

    @MapsId("customer_id")
    @ManyToOne
    @ForeignKey(name = "FK__products__71D1E811")
    @JoinColumns({
        @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
        ,
        @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    })
    private Customers customer;
    @Column(name = "line", columnDefinition = "char(1)", nullable = true)
    private String line;

    public Products() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public String getAlterno() {
        return alterno;
    }

    public void setAlterno(String alterno) {
        this.alterno = alterno;
    }

    public String getOwnerCompanyId() {
        return ownerCompanyId;
    }

    public void setOwnerCompanyId(String ownerCompanyId) {
        this.ownerCompanyId = ownerCompanyId;
    }

    public String getOwnerBodegaId() {
        return ownerBodegaId;
    }

    public void setOwnerBodegaId(String ownerBodegaId) {
        this.ownerBodegaId = ownerBodegaId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public ProductGroups getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroups productGroup) {
        this.productGroup = productGroup;
    }

    public PriceGroups getPriceGroup() {
        return priceGroup;
    }

    public void setPriceGroup(PriceGroups priceGroup) {
        this.priceGroup = priceGroup;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodFabrica() {
        return codFabrica;
    }

    public void setCodFabrica(String codFabrica) {
        this.codFabrica = codFabrica;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getPromoDesde() {
        return promoDesde;
    }

    public void setPromoDesde(Date promoDesde) {
        this.promoDesde = promoDesde;
    }

    public Date getPromoHasta() {
        return promoHasta;
    }

    public void setPromoHasta(Date promoHasta) {
        this.promoHasta = promoHasta;
    }

    public BigDecimal getPromoDscto() {
        return promoDscto;
    }

    public void setPromoDscto(BigDecimal promoDscto) {
        this.promoDscto = promoDscto;
    }

    public Integer getCantMinPedido() {
        return cantMinPedido;
    }

    public void setCantMinPedido(Integer cantMinPedido) {
        this.cantMinPedido = cantMinPedido;
    }

    public BigDecimal getCubicaje() {
        return cubicaje;
    }

    public void setCubicaje(BigDecimal cubicaje) {
        this.cubicaje = cubicaje;
    }

    public Boolean getJustIntegers() {
        return justIntegers;
    }

    public void setJustIntegers(Boolean justIntegers) {
        this.justIntegers = justIntegers;
    }

    public String getQuantityCode() {
        return quantityCode;
    }

    public void setQuantityCode(String quantityCode) {
        this.quantityCode = quantityCode;
    }

    public String getQuantityInUnit() {
        return quantityInUnit;
    }

    public void setQuantityInUnit(String quantityInUnit) {
        this.quantityInUnit = quantityInUnit;
    }

    public Integer getQuantityNumber() {
        return quantityNumber;
    }

    public void setQuantityNumber(Integer quantityNumber) {
        this.quantityNumber = quantityNumber;
    }

    public BigDecimal getFobPrice() {
        return fobPrice;
    }

    public void setFobPrice(BigDecimal fobPrice) {
        this.fobPrice = fobPrice;
    }

    public BigDecimal getPrevMarketCost() {
        return prevMarketCost;
    }

    public void setPrevMarketCost(BigDecimal prevMarketCost) {
        this.prevMarketCost = prevMarketCost;
    }

    public BigDecimal getLastMarketCost() {
        return lastMarketCost;
    }

    public void setLastMarketCost(BigDecimal lastMarketCost) {
        this.lastMarketCost = lastMarketCost;
    }

    public Integer getFrom_0() {
        return from_0;
    }

    public void setFrom_0(Integer from_0) {
        this.from_0 = from_0;
    }

    public Integer getTo_0() {
        return to_0;
    }

    public void setTo_0(Integer to_0) {
        this.to_0 = to_0;
    }

    public BigDecimal getPerc_0() {
        return perc_0;
    }

    public void setPerc_0(BigDecimal perc_0) {
        this.perc_0 = perc_0;
    }

    public BigDecimal getPerc_0sf() {
        return perc_0sf;
    }

    public void setPerc_0sf(BigDecimal perc_0sf) {
        this.perc_0sf = perc_0sf;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPricesf() {
        return unitPricesf;
    }

    public void setUnitPricesf(BigDecimal unitPricesf) {
        this.unitPricesf = unitPricesf;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getTo_1() {
        return to_1;
    }

    public void setTo_1(Integer to_1) {
        this.to_1 = to_1;
    }

    public Integer getPerc_1() {
        return perc_1;
    }

    public void setPerc_1(Integer perc_1) {
        this.perc_1 = perc_1;
    }

    public BigDecimal getPerc_1sf() {
        return perc_1sf;
    }

    public void setPerc_1sf(BigDecimal perc_1sf) {
        this.perc_1sf = perc_1sf;
    }

    public BigDecimal getUnitPrice1() {
        return unitPrice1;
    }

    public void setUnitPrice1(BigDecimal unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }

    public BigDecimal getUnitPrice1sf() {
        return unitPrice1sf;
    }

    public void setUnitPrice1sf(BigDecimal unitPrice1sf) {
        this.unitPrice1sf = unitPrice1sf;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public Integer getTo_2() {
        return to_2;
    }

    public void setTo_2(Integer to_2) {
        this.to_2 = to_2;
    }

    public Integer getPerc_2() {
        return perc_2;
    }

    public void setPerc_2(Integer perc_2) {
        this.perc_2 = perc_2;
    }

    public BigDecimal getPerc_2sf() {
        return perc_2sf;
    }

    public void setPerc_2sf(BigDecimal perc_2sf) {
        this.perc_2sf = perc_2sf;
    }

    public BigDecimal getUnitPrice2() {
        return unitPrice2;
    }

    public void setUnitPrice2(BigDecimal unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    public BigDecimal getUnitPrice2sf() {
        return unitPrice2sf;
    }

    public void setUnitPrice2sf(BigDecimal unitPrice2sf) {
        this.unitPrice2sf = unitPrice2sf;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public Integer getTo_3() {
        return to_3;
    }

    public void setTo_3(Integer to_3) {
        this.to_3 = to_3;
    }

    public Integer getPerc_3() {
        return perc_3;
    }

    public void setPerc_3(Integer perc_3) {
        this.perc_3 = perc_3;
    }

    public BigDecimal getPerc_3sf() {
        return perc_3sf;
    }

    public void setPerc_3sf(BigDecimal perc_3sf) {
        this.perc_3sf = perc_3sf;
    }

    public BigDecimal getUnitPrice3() {
        return unitPrice3;
    }

    public void setUnitPrice3(BigDecimal unitPrice3) {
        this.unitPrice3 = unitPrice3;
    }

    public BigDecimal getUnitPrice3sf() {
        return unitPrice3sf;
    }

    public void setUnitPrice3sf(BigDecimal unitPrice3sf) {
        this.unitPrice3sf = unitPrice3sf;
    }

    public String getUnit3() {
        return unit3;
    }

    public void setUnit3(String unit3) {
        this.unit3 = unit3;
    }

    public Integer getTo_4() {
        return to_4;
    }

    public void setTo_4(Integer to_4) {
        this.to_4 = to_4;
    }

    public Integer getPerc_4() {
        return perc_4;
    }

    public void setPerc_4(Integer perc_4) {
        this.perc_4 = perc_4;
    }

    public BigDecimal getPerc_4sf() {
        return perc_4sf;
    }

    public void setPerc_4sf(BigDecimal perc_4sf) {
        this.perc_4sf = perc_4sf;
    }

    public BigDecimal getUnitPrice4() {
        return unitPrice4;
    }

    public void setUnitPrice4(BigDecimal unitPrice4) {
        this.unitPrice4 = unitPrice4;
    }

    public BigDecimal getUnitPrice4sf() {
        return unitPrice4sf;
    }

    public void setUnitPrice4sf(BigDecimal unitPrice4sf) {
        this.unitPrice4sf = unitPrice4sf;
    }

    public Integer getTo_5() {
        return to_5;
    }

    public void setTo_5(Integer to_5) {
        this.to_5 = to_5;
    }

    public Integer getPerc_5() {
        return perc_5;
    }

    public void setPerc_5(Integer perc_5) {
        this.perc_5 = perc_5;
    }

    public BigDecimal getPerc_5sf() {
        return perc_5sf;
    }

    public void setPerc_5sf(BigDecimal perc_5sf) {
        this.perc_5sf = perc_5sf;
    }

    public BigDecimal getUnitPrice5() {
        return unitPrice5;
    }

    public void setUnitPrice5(BigDecimal unitPrice5) {
        this.unitPrice5 = unitPrice5;
    }

    public BigDecimal getUnitPrice5sf() {
        return unitPrice5sf;
    }

    public void setUnitPrice5sf(BigDecimal unitPrice5sf) {
        this.unitPrice5sf = unitPrice5sf;
    }

    public BigDecimal getCty01() {
        return cty01;
    }

    public void setCty01(BigDecimal cty01) {
        this.cty01 = cty01;
    }

    public BigDecimal getUnitPriceCty01() {
        return unitPriceCty01;
    }

    public void setUnitPriceCty01(BigDecimal unitPriceCty01) {
        this.unitPriceCty01 = unitPriceCty01;
    }

    public BigDecimal getCty02() {
        return cty02;
    }

    public void setCty02(BigDecimal cty02) {
        this.cty02 = cty02;
    }

    public BigDecimal getUnitPriceCty02() {
        return unitPriceCty02;
    }

    public void setUnitPriceCty02(BigDecimal unitPriceCty02) {
        this.unitPriceCty02 = unitPriceCty02;
    }

    public BigDecimal getCty03() {
        return cty03;
    }

    public void setCty03(BigDecimal cty03) {
        this.cty03 = cty03;
    }

    public BigDecimal getUnitPriceCty03() {
        return unitPriceCty03;
    }

    public void setUnitPriceCty03(BigDecimal unitPriceCty03) {
        this.unitPriceCty03 = unitPriceCty03;
    }

    public BigDecimal getCty04() {
        return cty04;
    }

    public void setCty04(BigDecimal cty04) {
        this.cty04 = cty04;
    }

    public BigDecimal getUnitPriceCty04() {
        return unitPriceCty04;
    }

    public void setUnitPriceCty04(BigDecimal unitPriceCty04) {
        this.unitPriceCty04 = unitPriceCty04;
    }

    public BigDecimal getCty05() {
        return cty05;
    }

    public void setCty05(BigDecimal cty05) {
        this.cty05 = cty05;
    }

    public BigDecimal getUnitPriceCty05() {
        return unitPriceCty05;
    }

    public void setUnitPriceCty05(BigDecimal unitPriceCty05) {
        this.unitPriceCty05 = unitPriceCty05;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight1() {
        return weight1;
    }

    public void setWeight1(BigDecimal weight1) {
        this.weight1 = weight1;
    }

    public Packages getPackageEn() {
        return packageEn;
    }

    public void setPackageEn(Packages packageEn) {
        this.packageEn = packageEn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Boolean getPayTax() {
        return payTax;
    }

    public void setPayTax(Boolean payTax) {
        this.payTax = payTax;
    }

    public Boolean getNoTaxObject() {
        return noTaxObject;
    }

    public void setNoTaxObject(Boolean noTaxObject) {
        this.noTaxObject = noTaxObject;
    }

    public Date getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(Date lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public BigDecimal getdUnitPrice() {
        return dUnitPrice;
    }

    public void setdUnitPrice(BigDecimal dUnitPrice) {
        this.dUnitPrice = dUnitPrice;
    }

    public BigDecimal getdLastPurchasePrice() {
        return dLastPurchasePrice;
    }

    public void setdLastPurchasePrice(BigDecimal dLastPurchasePrice) {
        this.dLastPurchasePrice = dLastPurchasePrice;
    }

    public BigDecimal getdLastPurchaseDiscount() {
        return dLastPurchaseDiscount;
    }

    public void setdLastPurchaseDiscount(BigDecimal dLastPurchaseDiscount) {
        this.dLastPurchaseDiscount = dLastPurchaseDiscount;
    }

    public BigDecimal getdLastPurchaseDiscount1() {
        return dLastPurchaseDiscount1;
    }

    public void setdLastPurchaseDiscount1(BigDecimal dLastPurchaseDiscount1) {
        this.dLastPurchaseDiscount1 = dLastPurchaseDiscount1;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getCategId() {
        return categId;
    }

    public void setCategId(String categId) {
        this.categId = categId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public PBrands getpBrand() {
        return pBrand;
    }

    public void setpBrand(PBrands pBrand) {
        this.pBrand = pBrand;
    }

    public String getPresentaId() {
        return presentaId;
    }

    public void setPresentaId(String presentaId) {
        this.presentaId = presentaId;
    }

    public String getPgroupId() {
        return pgroupId;
    }

    public void setPgroupId(String pgroupId) {
        this.pgroupId = pgroupId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getStockne() {
        return stockne;
    }

    public void setStockne(BigDecimal stockne) {
        this.stockne = stockne;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public Boolean getSerials() {
        return serials;
    }

    public void setSerials(Boolean serials) {
        this.serials = serials;
    }

    public Boolean getPricechanged() {
        return pricechanged;
    }

    public void setPricechanged(Boolean pricechanged) {
        this.pricechanged = pricechanged;
    }

    public Boolean getToledo() {
        return toledo;
    }

    public void setToledo(Boolean toledo) {
        this.toledo = toledo;
    }

    public Boolean getToprint() {
        return toprint;
    }

    public void setToprint(Boolean toprint) {
        this.toprint = toprint;
    }

    public Boolean getCemento() {
        return cemento;
    }

    public void setCemento(Boolean cemento) {
        this.cemento = cemento;
    }

    public BigDecimal getFlete() {
        return flete;
    }

    public void setFlete(BigDecimal flete) {
        this.flete = flete;
    }

    public Boolean getService() {
        return service;
    }

    public void setService(Boolean service) {
        this.service = service;
    }

    public Boolean getIce() {
        return ice;
    }

    public void setIce(Boolean ice) {
        this.ice = ice;
    }

    public String getIceId() {
        return iceId;
    }

    public void setIceId(String iceId) {
        this.iceId = iceId;
    }

    public BigDecimal getFletePerc() {
        return fletePerc;
    }

    public void setFletePerc(BigDecimal fletePerc) {
        this.fletePerc = fletePerc;
    }

    public BigDecimal getInternac() {
        return internac;
    }

    public void setInternac(BigDecimal internac) {
        this.internac = internac;
    }

    public Boolean getUunits() {
        return uunits;
    }

    public void setUunits(Boolean uunits) {
        this.uunits = uunits;
    }

    public Integer getNoUnits() {
        return noUnits;
    }

    public void setNoUnits(Integer noUnits) {
        this.noUnits = noUnits;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getTipart() {
        return tipart;
    }

    public void setTipart(String tipart) {
        this.tipart = tipart;
    }

    public String getEstpro() {
        return estpro;
    }

    public void setEstpro(String estpro) {
        this.estpro = estpro;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRin() {
        return rin;
    }

    public void setRin(String rin) {
        this.rin = rin;
    }

    public Integer getpCHile() {
        return pCHile;
    }

    public void setpCHile(Integer pCHile) {
        this.pCHile = pCHile;
    }

    public Integer getpOlmedo() {
        return pOlmedo;
    }

    public void setpOlmedo(Integer pOlmedo) {
        this.pOlmedo = pOlmedo;
    }

    public Integer getpEloy() {
        return pEloy;
    }

    public void setpEloy(Integer pEloy) {
        this.pEloy = pEloy;
    }

    public Integer getpAmazoNas() {
        return pAmazoNas;
    }

    public void setpAmazoNas(Integer pAmazoNas) {
        this.pAmazoNas = pAmazoNas;
    }

    public Integer getpPlazaGrande() {
        return pPlazaGrande;
    }

    public void setpPlazaGrande(Integer pPlazaGrande) {
        this.pPlazaGrande = pPlazaGrande;
    }

    public Integer getpLuque() {
        return pLuque;
    }

    public void setpLuque(Integer pLuque) {
        this.pLuque = pLuque;
    }

    public Integer getpUrdesa() {
        return pUrdesa;
    }

    public void setpUrdesa(Integer pUrdesa) {
        this.pUrdesa = pUrdesa;
    }

    public Integer getpRecreo1() {
        return pRecreo1;
    }

    public void setpRecreo1(Integer pRecreo1) {
        this.pRecreo1 = pRecreo1;
    }

    public Integer getpCondado() {
        return pCondado;
    }

    public void setpCondado(Integer pCondado) {
        this.pCondado = pCondado;
    }

    public Integer getpColon() {
        return pColon;
    }

    public void setpColon(Integer pColon) {
        this.pColon = pColon;
    }

    public Integer getpRecreo2() {
        return pRecreo2;
    }

    public void setpRecreo2(Integer pRecreo2) {
        this.pRecreo2 = pRecreo2;
    }

    public Integer getpNacionesUnidas() {
        return pNacionesUnidas;
    }

    public void setpNacionesUnidas(Integer pNacionesUnidas) {
        this.pNacionesUnidas = pNacionesUnidas;
    }

    public Integer getpCumbaya() {
        return pCumbaya;
    }

    public void setpCumbaya(Integer pCumbaya) {
        this.pCumbaya = pCumbaya;
    }

    public Integer getpAndes() {
        return pAndes;
    }

    public void setpAndes(Integer pAndes) {
        this.pAndes = pAndes;
    }

    public Integer getpBosque() {
        return pBosque;
    }

    public void setpBosque(Integer pBosque) {
        this.pBosque = pBosque;
    }

    public Integer getpPolicentro() {
        return pPolicentro;
    }

    public void setpPolicentro(Integer pPolicentro) {
        this.pPolicentro = pPolicentro;
    }

    public Integer getpDuran() {
        return pDuran;
    }

    public void setpDuran(Integer pDuran) {
        this.pDuran = pDuran;
    }

    public Integer getpCevallos() {
        return pCevallos;
    }

    public void setpCevallos(Integer pCevallos) {
        this.pCevallos = pCevallos;
    }

    public Integer getP9Octubre() {
        return p9Octubre;
    }

    public void setP9Octubre(Integer p9Octubre) {
        this.p9Octubre = p9Octubre;
    }

    public Integer getpDorado() {
        return pDorado;
    }

    public void setpDorado(Integer pDorado) {
        this.pDorado = pDorado;
    }

    public Integer getpQuicentro() {
        return pQuicentro;
    }

    public void setpQuicentro(Integer pQuicentro) {
        this.pQuicentro = pQuicentro;
    }

    public Integer getpPaseo() {
        return pPaseo;
    }

    public void setpPaseo(Integer pPaseo) {
        this.pPaseo = pPaseo;
    }

    public Integer getpPortal() {
        return pPortal;
    }

    public void setpPortal(Integer pPortal) {
        this.pPortal = pPortal;
    }

}
