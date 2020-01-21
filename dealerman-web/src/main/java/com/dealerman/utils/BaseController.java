package com.dealerman.utils;

import com.dealerman.accessDataManager.AccessDM;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "baseController")
@SessionScoped
public abstract class BaseController extends MessageController
        implements Serializable {

    @Inject
    protected AccessDM accessDM;

    public String urlBase() {
        String serverName = accessDM.getRequest().getServerName();
        String contexto = accessDM.getRequest().getContextPath();
        String scheme = accessDM.getRequest().getHeader("X-Forwarded-Proto");
        if (scheme == null) {
            scheme = accessDM.getRequest().getScheme();
            int serverPort = accessDM.getRequest().getServerPort();
            return scheme + "://" + serverName + ":" + serverPort
                    + contexto;
        }
        return scheme + "://" + serverName + contexto;
    }

    public UIComponent getCurrentComponent() {
        FacesContext context = getFacesContext();
        return UIComponent.getCurrentComponent(context);
    }

    protected static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    protected Object getRequestParameter(final String parameterName) {
        return getFacesContext().getExternalContext().getRequestParameterMap().get(parameterName);
    }

    protected String getRemoteUser() {
        String username = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
        return username;
    }

    protected HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    protected ServletContext getServletContext() {
        return (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();

    }

    protected HttpServletResponse getServletResponse() {
        return (HttpServletResponse) getFacesContext().getExternalContext().getResponse();
    }

    protected HttpServletRequest getServletRequest() {
        return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
    }

    protected Map<String, Object> getSessionMap() {
        return getFacesContext().getExternalContext().getSessionMap();
    }

    public Locale getCurrentLocale() {
        return getFacesContext().getViewRoot().getLocale();
    }

    public String getStringLocale() {
        return getCurrentLocale().getLanguage();
    }

    public String getViewId() {
        return FacesContext.getCurrentInstance().getViewRoot().getViewId();
    }

    public String getCurrentPage() {
        String currentPage = getServletContext().getContextPath() + getViewId();
        return currentPage.replace("xhtml", "jsf");
    }

    public AccessDM getAccessDM() {
        return accessDM;
    }

    public void setAccessDM(AccessDM accessDM) {
        this.accessDM = accessDM;
    }

}
