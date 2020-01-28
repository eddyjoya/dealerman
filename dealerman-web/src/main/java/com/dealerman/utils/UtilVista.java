package com.dealerman.utils;

import java.math.BigDecimal;

/**
 *
 * @author eddie
 */
public class UtilVista {

    public static boolean isNumeric(String cadena) {
        try {
            new BigDecimal(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
