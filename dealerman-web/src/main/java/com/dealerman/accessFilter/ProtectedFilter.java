package com.dealerman.accessFilter;

import com.dealerman.accessDataManager.AccessDM;
import com.dealerman.utils.BaseController;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String urlLocal = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
        try {
            String loggedUsername = request.getRemoteUser();
            HttpSession sesion = request.getSession();
            String datosUser = request.getHeader("user-agent");
            accessDM.setDatosUser(datosUser);
            if (loggedUsername != null) {
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
