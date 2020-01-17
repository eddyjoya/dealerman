/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.accounting;

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
@Table(name = "journal_aplcs")
public class JournalAplcs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "aplicacion", columnDefinition = "char(1)")
    private String aplicacion;

    @Column(name = "aplicacion_name", columnDefinition = "char(11)", nullable = false)
    private String aplicacion_name;

    public JournalAplcs() {
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAplicacion_name() {
        return aplicacion_name;
    }

    public void setAplicacion_name(String aplicacion_name) {
        this.aplicacion_name = aplicacion_name;
    }

}
