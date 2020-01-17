package com.dealerman.utils;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "messageController")
@SessionScoped
public abstract class MessageController {

    protected void addSuccessMessage(final String resumen) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Información", resumen);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    protected void addWarnMessage(final String message) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", message);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    protected void addErrorMessage(final String message) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", message);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

}
