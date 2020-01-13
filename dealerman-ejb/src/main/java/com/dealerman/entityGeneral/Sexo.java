/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.entityGeneral;

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
@Table(name = "sexo")
public class Sexo implements Serializable {

    @Id
    @Column(name = "sexo", columnDefinition = "tinyint")
    private Integer sexo;
    @Column(name = "sexo_name", columnDefinition = "varchar(10)", nullable = false)
    private String sexoName;

    public Sexo() {
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getSexoName() {
        return sexoName;
    }

    public void setSexoName(String sexoName) {
        this.sexoName = sexoName;
    }

}
