package com.dealerman.enumerator;

/**
 *
 * @author eddie
 */
public enum CategoryDeudorEnum {
    PROVEEDORES("PROVEEDORES", "C"),
    CLIENTES("CLIENTES", "F"),
    PROVEEDORES_EXTERIOR("PROVEEDORES DEL EXTERIOR", "C"),
    EMPLEADOS("EMPLEADOS", "F");

    private String nombre;
    private String aplicacion;

    private CategoryDeudorEnum(String nombre, String aplicacion) {
        this.nombre = nombre;
        this.aplicacion = aplicacion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
