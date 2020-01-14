/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityPayroll;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eddie
 */
@Entity
@Table(name = "deptment")
public class Deptment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "company_id", columnDefinition = "char(2)", nullable = false)
    private String companyId;
    @Id
    @Column(name = "dept_id", columnDefinition = "char(1)")
    private String deptId;
    @Column(name = "dept_name", columnDefinition = "varchar(25)", nullable = true)
    private String deptName;
    @Column(name = "state", columnDefinition = "varchar(10)", nullable = true)
    private String state;
    @Column(name = "canton", columnDefinition = "varchar(10)", nullable = true)
    private String canton;
    @Column(name = "city", columnDefinition = "varchar(10)", nullable = true)
    private String city;
    @Column(name = "address", columnDefinition = "varchar(36)", nullable = true)
    private String address;
    @Column(name = "intersection", columnDefinition = "varchar(23)", nullable = true)
    private String intersection;
    @Column(name = "apartado", columnDefinition = "varchar(23)", nullable = true)
    private String apartado;
    @Column(name = "oficina", columnDefinition = "varchar(23)", nullable = true)
    private String oficina;
    @Column(name = "discontinued", columnDefinition = "bit", nullable = true)
    private Boolean discontinued;
    @Column(name = "sales_acc", columnDefinition = "char(20)", nullable = false)
    private String salesAcc;
    @Column(name = "returns_acc", columnDefinition = "char(20)", nullable = false)
    private String returnsAcc;
    @Column(name = "discount_acc", columnDefinition = "char(20)", nullable = false)
    private String discountAcc;
    @Column(name = "costofsales_acc", columnDefinition = "char(20)", nullable = false)
    private String costofsalesAcc;
    @Column(name = "sueldo", columnDefinition = "char(20)", nullable = false)
    private String sueldo;
    @Column(name = "sueldo16", columnDefinition = "char(20)", nullable = false)
    private String sueldo16;
    @Column(name = "altocvida", columnDefinition = "char(20)", nullable = false)
    private String altocvida;
    @Column(name = "bonifcomp", columnDefinition = "char(20)", nullable = false)
    private String bonifcomp;
    @Column(name = "transporte", columnDefinition = "char(20)", nullable = false)
    private String transporte;
    @Column(name = "rbenefley", columnDefinition = "char(20)", nullable = false)
    private String rbenefley;
    @Column(name = "represent", columnDefinition = "char(20)", nullable = false)
    private String represent;
    @Column(name = "comisione", columnDefinition = "char(20)", nullable = false)
    private String comisione;
    @Column(name = "hextras", columnDefinition = "char(20)", nullable = false)
    private String hExtras;
    @Column(name = "movilizac", columnDefinition = "char(20)", nullable = false)
    private String movilizac;
    @Column(name = "responsab", columnDefinition = "char(20)", nullable = false)
    private String responsab;
    @Column(name = "oingresos", columnDefinition = "char(20)", nullable = false)
    private String oingresos;
    @Column(name = "oingreso1", columnDefinition = "char(20)", nullable = true)
    private String oingreso1;
    @Column(name = "oingreso2", columnDefinition = "char(20)", nullable = true)
    private String oingreso2;
    @Column(name = "oingreso3", columnDefinition = "char(20)", nullable = true)
    private String oingreso3;
    @Column(name = "oingreso4", columnDefinition = "char(20)", nullable = true)
    private String oingreso4;
    @Column(name = "oingreso5", columnDefinition = "char(20)", nullable = true)
    private String oingreso5;
    @Column(name = "oingreso6", columnDefinition = "char(20)", nullable = true)
    private String oingreso6;
    @Column(name = "sueldo13", columnDefinition = "char(20)", nullable = false)
    private String sueldo13;
    @Column(name = "psueldo13", columnDefinition = "char(20)", nullable = false)
    private String psueldo13;
    @Column(name = "sueldo14", columnDefinition = "char(20)", nullable = false)
    private String sueldo14;
    @Column(name = "psueldo14", columnDefinition = "char(20)", nullable = false)
    private String psueldo14;
    @Column(name = "freserva", columnDefinition = "char(20)", nullable = false)
    private String freserva;
    @Column(name = "pfreserva", columnDefinition = "char(20)", nullable = false)
    private String pfreserva;
    @Column(name = "sueldo15", columnDefinition = "char(20)", nullable = false)
    private String sueldo15;
    @Column(name = "psueldo15", columnDefinition = "char(20)", nullable = false)
    private String psueldo15;
    @Column(name = "patronal", columnDefinition = "char(20)", nullable = false)
    private String patronal;
    @Column(name = "ppatronal", columnDefinition = "char(20)", nullable = false)
    private String ppatronal;
    @Column(name = "vacacion", columnDefinition = "char(20)", nullable = false)
    private String vacacion;
    @Column(name = "pvacacion", columnDefinition = "char(20)", nullable = false)
    private String pvacacion;
    @Column(name = "subfamili", columnDefinition = "char(20)", nullable = false)
    private String subfamili;
    @Column(name = "subantigu", columnDefinition = "char(20)", nullable = false)
    private String subantigu;
    @Column(name = "bonosemes", columnDefinition = "char(20)", nullable = false)
    private String bonosemes;
    @Column(name = "added", columnDefinition = "bit", nullable = true)
    private Boolean added;
    @Column(name = "modified", columnDefinition = "bit", nullable = true)
    private Boolean modified;

    public Deptment() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntersection() {
        return intersection;
    }

    public void setIntersection(String intersection) {
        this.intersection = intersection;
    }

    public String getApartado() {
        return apartado;
    }

    public void setApartado(String apartado) {
        this.apartado = apartado;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public String getSalesAcc() {
        return salesAcc;
    }

    public void setSalesAcc(String salesAcc) {
        this.salesAcc = salesAcc;
    }

    public String getReturnsAcc() {
        return returnsAcc;
    }

    public void setReturnsAcc(String returnsAcc) {
        this.returnsAcc = returnsAcc;
    }

    public String getDiscountAcc() {
        return discountAcc;
    }

    public void setDiscountAcc(String discountAcc) {
        this.discountAcc = discountAcc;
    }

    public String getCostofsalesAcc() {
        return costofsalesAcc;
    }

    public void setCostofsalesAcc(String costofsalesAcc) {
        this.costofsalesAcc = costofsalesAcc;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getSueldo16() {
        return sueldo16;
    }

    public void setSueldo16(String sueldo16) {
        this.sueldo16 = sueldo16;
    }

    public String getAltocvida() {
        return altocvida;
    }

    public void setAltocvida(String altocvida) {
        this.altocvida = altocvida;
    }

    public String getBonifcomp() {
        return bonifcomp;
    }

    public void setBonifcomp(String bonifcomp) {
        this.bonifcomp = bonifcomp;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getRbenefley() {
        return rbenefley;
    }

    public void setRbenefley(String rbenefley) {
        this.rbenefley = rbenefley;
    }

    public String getRepresent() {
        return represent;
    }

    public void setRepresent(String represent) {
        this.represent = represent;
    }

    public String getComisione() {
        return comisione;
    }

    public void setComisione(String comisione) {
        this.comisione = comisione;
    }

    public String gethExtras() {
        return hExtras;
    }

    public void sethExtras(String hExtras) {
        this.hExtras = hExtras;
    }

    public String getMovilizac() {
        return movilizac;
    }

    public void setMovilizac(String movilizac) {
        this.movilizac = movilizac;
    }

    public String getResponsab() {
        return responsab;
    }

    public void setResponsab(String responsab) {
        this.responsab = responsab;
    }

    public String getOingresos() {
        return oingresos;
    }

    public void setOingresos(String oingresos) {
        this.oingresos = oingresos;
    }

    public String getOingreso1() {
        return oingreso1;
    }

    public void setOingreso1(String oingreso1) {
        this.oingreso1 = oingreso1;
    }

    public String getOingreso2() {
        return oingreso2;
    }

    public void setOingreso2(String oingreso2) {
        this.oingreso2 = oingreso2;
    }

    public String getOingreso3() {
        return oingreso3;
    }

    public void setOingreso3(String oingreso3) {
        this.oingreso3 = oingreso3;
    }

    public String getOingreso4() {
        return oingreso4;
    }

    public void setOingreso4(String oingreso4) {
        this.oingreso4 = oingreso4;
    }

    public String getOingreso5() {
        return oingreso5;
    }

    public void setOingreso5(String oingreso5) {
        this.oingreso5 = oingreso5;
    }

    public String getOingreso6() {
        return oingreso6;
    }

    public void setOingreso6(String oingreso6) {
        this.oingreso6 = oingreso6;
    }

    public String getSueldo13() {
        return sueldo13;
    }

    public void setSueldo13(String sueldo13) {
        this.sueldo13 = sueldo13;
    }

    public String getPsueldo13() {
        return psueldo13;
    }

    public void setPsueldo13(String psueldo13) {
        this.psueldo13 = psueldo13;
    }

    public String getSueldo14() {
        return sueldo14;
    }

    public void setSueldo14(String sueldo14) {
        this.sueldo14 = sueldo14;
    }

    public String getPsueldo14() {
        return psueldo14;
    }

    public void setPsueldo14(String psueldo14) {
        this.psueldo14 = psueldo14;
    }

    public String getFreserva() {
        return freserva;
    }

    public void setFreserva(String freserva) {
        this.freserva = freserva;
    }

    public String getPfreserva() {
        return pfreserva;
    }

    public void setPfreserva(String pfreserva) {
        this.pfreserva = pfreserva;
    }

    public String getSueldo15() {
        return sueldo15;
    }

    public void setSueldo15(String sueldo15) {
        this.sueldo15 = sueldo15;
    }

    public String getPsueldo15() {
        return psueldo15;
    }

    public void setPsueldo15(String psueldo15) {
        this.psueldo15 = psueldo15;
    }

    public String getPatronal() {
        return patronal;
    }

    public void setPatronal(String patronal) {
        this.patronal = patronal;
    }

    public String getPpatronal() {
        return ppatronal;
    }

    public void setPpatronal(String ppatronal) {
        this.ppatronal = ppatronal;
    }

    public String getVacacion() {
        return vacacion;
    }

    public void setVacacion(String vacacion) {
        this.vacacion = vacacion;
    }

    public String getPvacacion() {
        return pvacacion;
    }

    public void setPvacacion(String pvacacion) {
        this.pvacacion = pvacacion;
    }

    public String getSubfamili() {
        return subfamili;
    }

    public void setSubfamili(String subfamili) {
        this.subfamili = subfamili;
    }

    public String getSubantigu() {
        return subantigu;
    }

    public void setSubantigu(String subantigu) {
        this.subantigu = subantigu;
    }

    public String getBonosemes() {
        return bonosemes;
    }

    public void setBonosemes(String bonosemes) {
        this.bonosemes = bonosemes;
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
