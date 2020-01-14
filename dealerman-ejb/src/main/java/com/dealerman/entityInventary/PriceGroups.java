/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityInventary;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "price_groups")
public class PriceGroups implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "p_group_id", columnDefinition = "char(6)")
    private String pGroupId;
    @Column(name = "p_group_name", columnDefinition = "varchar(60)", nullable = true)
    private String pGroupName;
    @Column(name = "p_group_fob", columnDefinition = "money", nullable = false)
    private BigDecimal pGroupFob;
    @Column(name = "p_group_price", columnDefinition = "money", nullable = false)
    private BigDecimal pGroupPrice;
    @Column(name = "p_group_dprice", columnDefinition = "money", nullable = false)
    private BigDecimal pGroupDprice;
    @Column(name = "p_group_cost", columnDefinition = "money", nullable = false)
    private BigDecimal pGroupCost;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public PriceGroups() {
    }

    public String getpGroupId() {
        return pGroupId;
    }

    public void setpGroupId(String pGroupId) {
        this.pGroupId = pGroupId;
    }

    public String getpGroupName() {
        return pGroupName;
    }

    public void setpGroupName(String pGroupName) {
        this.pGroupName = pGroupName;
    }

    public BigDecimal getpGroupFob() {
        return pGroupFob;
    }

    public void setpGroupFob(BigDecimal pGroupFob) {
        this.pGroupFob = pGroupFob;
    }

    public BigDecimal getpGroupPrice() {
        return pGroupPrice;
    }

    public void setpGroupPrice(BigDecimal pGroupPrice) {
        this.pGroupPrice = pGroupPrice;
    }

    public BigDecimal getpGroupDprice() {
        return pGroupDprice;
    }

    public void setpGroupDprice(BigDecimal pGroupDprice) {
        this.pGroupDprice = pGroupDprice;
    }

    public BigDecimal getpGroupCost() {
        return pGroupCost;
    }

    public void setpGroupCost(BigDecimal pGroupCost) {
        this.pGroupCost = pGroupCost;
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

}
