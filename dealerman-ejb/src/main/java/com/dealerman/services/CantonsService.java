package com.dealerman.services;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.general.Cantons;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import com.dealerman.daoUI.ICantonsDao;
import com.dealerman.servicesUI.ICantonsService;
import java.util.List;

/**
 *
 * @author eddie
 */
@Stateless
public class CantonsService implements ICantonsService {

    @EJB
    ICantonsDao cantonsDao;

    private void create(Cantons canton) throws EntidadNoGrabadaException {

        canton.setDiscontinued(Boolean.FALSE);
        canton.setAdded(Boolean.TRUE);
        canton.setModified(Boolean.FALSE);
        cantonsDao.create(canton);

    }

    private void update(Cantons canton) throws EntidadNoGrabadaException {
        canton.setDiscontinued(Boolean.FALSE);
        canton.setAdded(Boolean.FALSE);
        canton.setModified(Boolean.TRUE);
        cantonsDao.update(canton);
    }

    @Override
    public void saveCantons(Cantons canton) throws EntidadNoGrabadaException {
        validateInfoCantons(canton);
        create(canton);
    }

    @Override
    public void updateCantons(Cantons canton) throws EntidadNoGrabadaException {

    }

    private void validateInfoCantons(Cantons canton) throws EntidadNoGrabadaException {
        List<Cantons> listCantons = cantonsDao.buscar(new Cantons(canton.getProvinceId(), canton.getCantonId(), canton.getCantonName()));
        if (!listCantons.isEmpty()) {
            throw new EntidadNoGrabadaException("Ya exite un registro con los datos ingresados");
        }
    }

}
