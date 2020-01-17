package com.dealerman.general.controller;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.general.Cantons;
import com.dealerman.general.dataManager.CantonsDM;
import com.dealerman.utils.MessageController;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.dealerman.servicesUI.ICantonsService;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "cantonsController")
@ViewScoped
public class CantonsController extends MessageController
        implements Serializable {

    @ManagedProperty("#{cantonsDM}")
    CantonsDM cantonsDM;

    @EJB
    ICantonsService cantonsService;

    public void init() {
        cantonsDM.setCanton(new Cantons());
    }

    public void saveCantons() {
        try {
            cantonsService.saveCantons(cantonsDM.getCanton());
            addSuccessMessage("Registro éxitoso");
        } catch (EntidadNoGrabadaException ex) {
            addErrorMessage(ex.getMessage());
        }
    }

    public CantonsDM getCantonsDM() {
        return cantonsDM;
    }

    public void setCantonsDM(CantonsDM cantonsDM) {
        this.cantonsDM = cantonsDM;
    }

}
