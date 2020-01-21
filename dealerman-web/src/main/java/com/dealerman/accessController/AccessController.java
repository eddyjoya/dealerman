package com.dealerman.accessController;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.utils.BaseController;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "accessController")
@ViewScoped
public class AccessController extends BaseController {

    public AccessController() {
    }

    public void init() throws IOException {
        if (accessDM.getRespLogin() != null) {
            if (accessDM.getRespLogin().equals("0")) {
                accessDM.setMessageLogin("Usuario o contraseña incorrectos");
            }
            if (accessDM.getRespLogin().equals("1")) {
                accessDM.setMessageLogin("Usuario inactivo");
            }
            accessDM.setRespLogin(null);
        }
        logout();
    }

    public void logout() throws IOException {
        try {
            if (accessDM.getSesion() != null) {

                String Urlseguridad = urlBase()
                        + accessDM.getModuloActivePath();
                FacesContext.getCurrentInstance().getExternalContext()
                        .redirect(Urlseguridad);
                accessDM.getSesion().invalidate();

            }
        } catch (IOException e) {
        }
    }

    public void redireccionarUrl(String urlDestino) throws IOException, EntidadNoGrabadaException {

        String urlFinal = urlBase()
                + urlDestino;
        accessDM.setModuloIrPath(urlDestino);
        FacesContext.getCurrentInstance().getExternalContext()
                .redirect(urlFinal);

    }

}
