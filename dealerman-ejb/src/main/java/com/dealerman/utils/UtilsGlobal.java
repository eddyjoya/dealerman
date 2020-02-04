package com.dealerman.utils;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import java.math.BigDecimal;
import java.text.ParseException;

/**
 *
 * @author eddie
 */
public class UtilsGlobal {

    private static String extraerCedulaDeRUC(String cedula) throws ParseException {

        if (cedula.length() > 12) {
            cedula = cedula.substring(0, 10); //Extrae la cedula
        } else {
            if (cedula.length() > 9) {
                cedula = cedula.substring(0, 10); //Devuelve la misma cédula
            }
        }
        return cedula;
    }

    public static String quitarEspacios(String buscar) {
        try {
            return buscar.trim();
        } catch (Exception e) {
            return buscar;
        }
    }

    public static boolean validadorDeCedula(String cedula) throws EntidadNoGrabadaException {
        boolean cedulaCorrecta = false;
        try {
            cedula = extraerCedulaDeRUC(cedula);
            if (cedula.length() == 10) {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = (10 - (suma % 10)) == verificador;
                    }
                }

            } else {
                cedulaCorrecta = false;
            }

        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (ParseException e) {
            System.out.println(e.getErrorOffset());
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            throw new EntidadNoGrabadaException("Cédula o ruc ingresados incorrectos");
        }
        return cedulaCorrecta;
    }

    public static boolean busquedaXPunto(String cadena) {
        try {
            String punto = cadena.substring(0, 1);
            return punto.equals(".");
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isNumeric(String cadena) {
        try {
            BigDecimal bigDecimal = new BigDecimal(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
