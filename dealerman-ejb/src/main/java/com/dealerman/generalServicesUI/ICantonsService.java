package com.dealerman.generalServicesUI;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.general.Cantons;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICantonsService {

    public void saveCantons(Cantons canton) throws EntidadNoGrabadaException;

    public void updateCantons(Cantons canton) throws EntidadNoGrabadaException;

}
