package com.dealerman.generalDaoUI;

import com.dealerman.exceptions.EntidadNoBorradaException;
import com.dealerman.exceptions.EntidadNoEncontradaException;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import java.io.Serializable;

/**
 * Interface IGenericDao.
 *
 * @param <T> the generic type
 * @param <PK> the generic id type
 * @author eddie
 */
public interface IGenericDao<T, PK extends Serializable> {

    /**
     * Guardar un objeto en la base de datos.
     *
     * @param o the o
     * @throws com.dealerman.exceptions.EntidadNoGrabadaException
     */
    void create(T o) throws EntidadNoGrabadaException;

    /**
     * Obtener un objeto almacenado utilizando su llave primaria.
     *
     * @param id llave primaria.
     *
     * @return the T
     * @throws com.dealerman.exceptions.EntidadNoEncontradaException
     */
    T get(PK id) throws EntidadNoEncontradaException;

    /**
     * Almacenar los cambios hechos a un objeto.
     *
     * @param o the o
     * @throws com.dealerman.exceptions.EntidadNoGrabadaException
     */
    void update(T o) throws EntidadNoGrabadaException;

    /**
     * Eliminar un objeto de la base de datos.
     *
     * @param o the o
     * @throws com.dealerman.exceptions.EntidadNoBorradaException
     */
    void delete(T o) throws EntidadNoBorradaException;

}
