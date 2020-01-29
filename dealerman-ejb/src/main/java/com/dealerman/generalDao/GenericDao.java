package com.dealerman.generalDao;

import com.dealerman.exceptions.EntidadNoBorradaException;
import com.dealerman.exceptions.EntidadNoEncontradaException;
import com.dealerman.exceptions.EntidadNoGrabadaException;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityExistsException;
import javax.persistence.PersistenceException;
import com.dealerman.generalDaoUI.IGenericDao;

/**
 * Class GenericDao.
 *
 * @param <T> the generic type
 * @param <PK> the generic id type
 */
@SuppressWarnings("unchecked")
public class GenericDao<T, PK extends Serializable> implements
        IGenericDao<T, PK> {

    @PersistenceContext(unitName = "dealermanDS")
    protected EntityManager em;

    private final Class<T> type;

    /**
     * Instancia un nuevo generic dao.
     *
     * @param type the type
     */
    public GenericDao(final Class<T> type) {
        this.type = type;
    }

    /**
     * @throws com.dealerman.exceptions.EntidadNoGrabadaException
     */
    @Override
    public void create(final T o) throws EntidadNoGrabadaException {
        try {
            em.persist(o);
        } catch (final PersistenceException e) {
            throw new EntidadNoGrabadaException("Error al grabar: ".concat(o
                    .toString()), e);
        } catch (IllegalArgumentException ex) {
            throw new EntityExistsException(ex.getMessage());
        }
    }

    /**
     * @throws com.dealerman.exceptions.EntidadNoEncontradaException
     */
    @Override
    public T get(final PK id) throws EntidadNoEncontradaException {

        final T entidad = em.find(type, id);

        if (entidad == null) {
            final StringBuffer msg = new StringBuffer();
            msg.append(type.getSimpleName());
            msg.append('[');
            msg.append(id.toString());
            msg.append("] no encontrada.");
            throw new EntidadNoEncontradaException(msg.toString());
        }

        return entidad;
    }

    /**
     * @throws com.dealerman.exceptions.EntidadNoGrabadaException
     */
    @Override
    public void update(final T o) throws EntidadNoGrabadaException {

        try {
            em.merge(o);
        } catch (IllegalArgumentException ex) {
            throw new EntityExistsException(ex.getMessage());
        }
    }

    /**
     * @throws com.dealerman.exceptions.EntidadNoBorradaException
     */
    @Override
    public void delete(final T o) throws EntidadNoBorradaException {

        try {
            em.merge(o);
            em.remove(o);
        } catch (IllegalArgumentException ex) {
            throw new EntityExistsException(ex.getMessage());
        }
    }

}
