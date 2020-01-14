/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityAccounting;

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
@Table(name = "journal_daily")
public class JournalDaily implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "aplicacion", columnDefinition = "char(1)")
    private String aplicacion;
    @Id
    @Column(name = "diario", columnDefinition = "char(2)")
    private String diario;
    @Column(name = "diario_name", columnDefinition = "char(11)", nullable = false)
    private String diarioName;

    public JournalDaily() {
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getDiario() {
        return diario;
    }

    public void setDiario(String diario) {
        this.diario = diario;
    }

    public String getDiarioName() {
        return diarioName;
    }

    public void setDiarioName(String diarioName) {
        this.diarioName = diarioName;
    }

}
