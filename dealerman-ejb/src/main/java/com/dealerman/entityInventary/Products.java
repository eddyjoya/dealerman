/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityInventary;

import com.dealerman.entityGeneral.Countries;
import com.dealerman.entityOrders.Customers;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
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
    @MapsId("customer_id")
    @ManyToOne
    @ForeignKey(name = "FK__products__71D1E811")
    @JoinColumns({
        @JoinColumn(name = "aplicacion", referencedColumnName = "aplicacion")
        ,
        @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    })
    private Customers customer;
}
