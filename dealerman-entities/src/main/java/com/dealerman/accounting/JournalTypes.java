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
@Table(name = "journal_types")
public class JournalTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tipo", columnDefinition = "char(2)")
    private String tipo;

    @Column(name = "description", columnDefinition = "char(30)", nullable = false)
    private String description;

    public JournalTypes() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
