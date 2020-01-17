/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.servicesUI;

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
