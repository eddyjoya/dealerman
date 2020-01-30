package com.dealerman.enumerator;

/**
 *
 * @author eddie
 */
public enum CreditTermsEnum {
    CONTADO("AL CONTADO"),
    CREDITO_8_DIAS("CREDITO 8 DIAS"),
    CREDITO_15_DIAS("CREDITO A 15 DIAS"),
    CREDITO_30_DIAS("CREDITO A 30 DIAS"),
    CREDITO_45_DIAS("CREDITO A 45 DIAS"),
    CREDITO_60_DIAS("CREDITO A 30 DIAS"),
    CREDITO_90_DIAS("CREDITO A 30 DIAS"),
    CREDITO_120_DIAS("CREDITO A 120 DIAS"),;

    private String nombre;

    private CreditTermsEnum(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
