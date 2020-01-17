/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.inventary;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "category_id", columnDefinition = "char(2)")
    private String categoryId;
    @Column(name = "category_name", columnDefinition = "varchar(30)", nullable = true)
    private String categoryName;
    @Column(name = "description", columnDefinition = "text", nullable = true)
    private String description;
    @Column(name = "picture_file", columnDefinition = "text", nullable = true)
    private String pictureFile;
    @Lob
    @Column(name = "picture", columnDefinition = "image", nullable = true)
    private byte[] picture;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;
    @Column(name = "assets_acc", columnDefinition = "char(20)", nullable = false)
    private String assetsAcc;
    @Column(name = "sales_acc", columnDefinition = "char(20)", nullable = false)
    private String salesAcc;
    @Column(name = "sales_0tax", columnDefinition = "char(20)", nullable = true)
    private String sales0Tax;
    @Column(name = "returns_acc", columnDefinition = "char(20)", nullable = false)
    private String returnsAcc;
    @Column(name = "returns_0tax", columnDefinition = "char(20)", nullable = true)
    private String returns0Tax;
    @Column(name = "discount_acc", columnDefinition = "char(20)", nullable = false)
    private String discountAcc;
    @Column(name = "discount_0tax", columnDefinition = "char(20)", nullable = true)
    private String discount0Tax;
    @Column(name = "costofsales_acc", columnDefinition = "char(20)", nullable = false)
    private String costofsalesAcc;
    @Column(name = "inprogress_acc", columnDefinition = "char(20)", nullable = false)
    private String inprogressAcc;
    @Column(name = "iipsales_acc", columnDefinition = "char(20)", nullable = false)
    private String iipsalesAcc;
    @Column(name = "iipreturns_acc", columnDefinition = "char(20)", nullable = false)
    private String iipreturnsAcc;
    @Column(name = "iipdiscount_acc", columnDefinition = "char(20)", nullable = false)
    private String iipdiscountAcc;
    @Column(name = "iipcos_acc", columnDefinition = "char(20)", nullable = false)
    private String iipcosAcc;
    @Column(name = "value1", columnDefinition = "int", nullable = true)
    private Integer value1;

    public Category() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(String pictureFile) {
        this.pictureFile = pictureFile;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
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

    public String getAssetsAcc() {
        return assetsAcc;
    }

    public void setAssetsAcc(String assetsAcc) {
        this.assetsAcc = assetsAcc;
    }

    public String getSalesAcc() {
        return salesAcc;
    }

    public void setSalesAcc(String salesAcc) {
        this.salesAcc = salesAcc;
    }

    public String getSales0Tax() {
        return sales0Tax;
    }

    public void setSales0Tax(String sales0Tax) {
        this.sales0Tax = sales0Tax;
    }

    public String getReturnsAcc() {
        return returnsAcc;
    }

    public void setReturnsAcc(String returnsAcc) {
        this.returnsAcc = returnsAcc;
    }

    public String getReturns0Tax() {
        return returns0Tax;
    }

    public void setReturns0Tax(String returns0Tax) {
        this.returns0Tax = returns0Tax;
    }

    public String getDiscountAcc() {
        return discountAcc;
    }

    public void setDiscountAcc(String discountAcc) {
        this.discountAcc = discountAcc;
    }

    public String getDiscount0Tax() {
        return discount0Tax;
    }

    public void setDiscount0Tax(String discount0Tax) {
        this.discount0Tax = discount0Tax;
    }

    public String getCostofsalesAcc() {
        return costofsalesAcc;
    }

    public void setCostofsalesAcc(String costofsalesAcc) {
        this.costofsalesAcc = costofsalesAcc;
    }

    public String getInprogressAcc() {
        return inprogressAcc;
    }

    public void setInprogressAcc(String inprogressAcc) {
        this.inprogressAcc = inprogressAcc;
    }

    public String getIipsalesAcc() {
        return iipsalesAcc;
    }

    public void setIipsalesAcc(String iipsalesAcc) {
        this.iipsalesAcc = iipsalesAcc;
    }

    public String getIipreturnsAcc() {
        return iipreturnsAcc;
    }

    public void setIipreturnsAcc(String iipreturnsAcc) {
        this.iipreturnsAcc = iipreturnsAcc;
    }

    public String getIipdiscountAcc() {
        return iipdiscountAcc;
    }

    public void setIipdiscountAcc(String iipdiscountAcc) {
        this.iipdiscountAcc = iipdiscountAcc;
    }

    public String getIipcosAcc() {
        return iipcosAcc;
    }

    public void setIipcosAcc(String iipcosAcc) {
        this.iipcosAcc = iipcosAcc;
    }

    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

}
