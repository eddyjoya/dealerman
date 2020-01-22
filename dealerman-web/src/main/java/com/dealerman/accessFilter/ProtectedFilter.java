package com.dealerman.accessFilter;

import com.dealerman.accessDataManager.AccessDM;
import com.dealerman.configuration.Employee;
import com.dealerman.general.Branches;
import com.dealerman.general.Company;
import com.dealerman.servicesUI.IBranchesService;
import com.dealerman.servicesUI.ICompanyService;
import com.dealerman.servicesUI.IEmployeeService;
import com.dealerman.utils.BaseController;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author eddie
 */
@WebFilter(filterName = "protectedFilter", urlPatterns = {"/pages/*"})
@ManagedBean(name = "protectedFilter")
public class ProtectedFilter implements Filter {

    @Inject
    AccessDM accessDM;

    @EJB
    private IEmployeeService employeeService;
    @EJB
    private ICompanyService companyService;
    @EJB
    private IBranchesService branchesService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String urlLocal = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        try {
            String loggedUserName = request.getRemoteUser();
            HttpSession sesion = request.getSession();
            String datosUser = request.getHeader("user-agent");
            accessDM.setDatosUser(datosUser);
            if ((loggedUserName != null) && (accessDM.getListAccessModulos().isEmpty())) {
                accessDM.setCompanySelect(null);
                /**
                 * En el caso que el usuario ingrese con otra sesion se inactiva
                 * la sesion anterior
                 */
                if (!cargaDatosEmployee(loggedUserName)) {
                    inactiveSession(urlLocal, response, sesion, "1");
                    return;
                }
                /**
                 * Cuando es un grupo que tiene más de una compania
                 */
                if (!consultaCompanys(accessDM.getEmployeeSelect().getCompanyId())) {
                    accessDM.setCompanySelect(new Company());
                    accessDM.setShowDialogCompanys(true);
                } else {
                    /**
                     * En el caso que el usuario no tiene asignado ninguna
                     * sucursal se inactiva la sesion
                     */
                    if (!consultaBranch(accessDM.getCompanySelect(), accessDM.getEmployeeSelect().getBranchId())) {
                        inactiveSession(urlLocal, response, sesion, "2");
                        return;
                    }
                }

                accessDM.setRequest(request);
                accessDM.setResponse(response);
                accessDM.setSesion(sesion);
                listAccessModulos();
                response.sendRedirect(urlLocal + moduloAccess("accesoHome"));
            }

        } catch (IOException e) {
            response.sendRedirect(urlLocal + moduloAccess("accesoHome"));
        }
        chain.doFilter(request, response);
    }

    private boolean cargaDatosEmployee(String loggedUserName) {
        List<Employee> employee = employeeService.buscar(new Employee(loggedUserName, Boolean.TRUE));
        if (employee.isEmpty()) {
            return false;
        }
        accessDM.setEmployeeSelect(employee.get(0));
        return true;
    }

    private boolean consultaCompanys(String company) {
        List<Company> listCompanys = companyService.buscar(new Company(company));
        if (company == null) {
            accessDM.setListcompanys(listCompanys);
            return false;
        } else {
            accessDM.setCompanySelect(listCompanys.get(0));
            return true;
        }
    }

    private boolean consultaBranch(Company company, String branch) {

        List<Branches> branches = branchesService.buscar(new Branches(company, branch));
        if (branches.isEmpty()) {
            return false;
        }
        accessDM.setBranchSelect(branches.get(0));
        return true;

    }

    private void inactiveSession(String urlLocal, HttpServletResponse response, HttpSession sesion, String codigo) throws IOException {
        sesion.invalidate();
        response.sendRedirect(urlLocal + "/dealerman-web/pages/index.jsf?error=" + codigo);
    }

    private void listAccessModulos() {
        accessDM.getListAccessModulos().add(moduloAccess("accesoHome"));
    }

    public String moduloAccess(String properties) {
        try {
            accessDM.setProperties(new Properties());
            accessDM.getProperties().load(getClass().getResourceAsStream("/com/properties/Modulos.properties"));
            return accessDM.getProperties().getProperty(properties);

        } catch (IOException ex) {
            Logger.getLogger(BaseController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public void destroy() {

    }

}
