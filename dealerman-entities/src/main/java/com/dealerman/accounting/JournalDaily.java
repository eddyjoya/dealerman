/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.accounting;

import java.io.Serializable;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.aplicacion);
        hash = 61 * hash + Objects.hashCode(this.diario);
        hash = 61 * hash + Objects.hashCode(this.diarioName);
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
        final JournalDaily other = (JournalDaily) obj;
        if (!Objects.equals(this.aplicacion, other.aplicacion)) {
            return false;
        }
        if (!Objects.equals(this.diario, other.diario)) {
            return false;
        }
        if (!Objects.equals(this.diarioName, other.diarioName)) {
            return false;
        }
        return true;
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
