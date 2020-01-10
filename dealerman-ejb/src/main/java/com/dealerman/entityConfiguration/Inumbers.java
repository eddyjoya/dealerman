/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityConfiguration;

import com.dealerman.entityGeneral.Company;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "inumbers")
public class Inumbers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    @ManyToOne
    private Company companyId;

    @Column(name = "branch_id", columnDefinition = "char(2)", nullable = true)
    private String branchId;
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

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
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

}
