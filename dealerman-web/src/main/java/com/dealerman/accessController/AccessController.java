package com.dealerman.accessController;

import com.dealerman.exceptions.EntidadNoGrabadaException;
import com.dealerman.general.Branches;
import com.dealerman.general.Company;
import com.dealerman.generalServicesUI.IBranchesService;
import com.dealerman.generalServicesUI.ICompanyService;
import com.dealerman.utils.BaseController;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "accessController")
@ViewScoped
public class AccessController extends BaseController {

    @EJB
    private ICompanyService companyService;
    @EJB
    private IBranchesService branchesService;

    public AccessController() {
    }

    public void init() throws IOException {
        accessDM.setMessageLogin(null);
        if (accessDM.getRespLogin() != null) {
            if (accessDM.getRespLogin().equals("0")) {
                accessDM.setMessageLogin("Usuario o contraseña incorrectos");
            }
            if (accessDM.getRespLogin().equals("1")) {
                accessDM.setMessageLogin("Usuario inactivo");
            }
            if (accessDM.getRespLogin().equals("2")) {
                accessDM.setMessageLogin("Usuario sin ninguna sucursal asignada");
            }
            accessDM.setRespLogin(null);
        }
        logout();
    }

    public void selectCompany() throws IOException {
        List<Company> listCompanys = companyService.buscar(new Company(accessDM.getCompanySelect().getCompanyId()));
        accessDM.setCompanySelect(listCompanys.get(0));
        consultaBranch();
        accessDM.setShowDialogCompanys(false);
        PrimeFaces.current().executeScript("location.reload();");
    }

    private void consultaBranch() throws IOException {

        List<Branches> branches = branchesService.buscar(new Branches(accessDM.getCompanySelect(), accessDM.getEmployeeSelect().getBranchId()));
        if (branches.isEmpty()) {
            accessDM.setMessageLogin("Usuario sin ninguna sucursal asignada");
            logout();
        }
        accessDM.setBranchSelect(branches.get(0));
    }

    public void redireccionarUrl(String urlDestino) throws IOException, EntidadNoGrabadaException {
        String scheme = accessDM.getRequest().getScheme();
        String serverName = accessDM.getRequest().getServerName();
        int serverPort = accessDM.getRequest().getServerPort();
        String urlFinal = scheme + "://" + serverName + ":" + serverPort
                + urlDestino;
        FacesContext.getCurrentInstance().getExternalContext()
                .redirect(urlFinal);
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

}
