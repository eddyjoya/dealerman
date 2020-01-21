package com.dealerman.accessDataManager;

import com.dealerman.configuration.Employee;
import com.dealerman.general.Company;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author eddie
 */
@SessionScoped
@Named
public class AccessDM implements Serializable {

    private String irModuloPath = "";
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession sesion;
    private String moduloActivePath = "";
    private String moduloIrPath = "";
    private String respLogin = null;
    private Employee employeeUser;
    private Properties properties = new Properties();
    private Company companySelect;
    private String datosUser;
    private String messageLogin = null;
    private List<String> listAccessModulos = new ArrayList();

    public AccessDM() {
    }

    public List<String> getListAccessModulos() {
        return listAccessModulos;
    }

    public void setListAccessModulos(List<String> listAccessModulos) {
        this.listAccessModulos = listAccessModulos;
    }

    public String getModuloIrPath() {
        return moduloIrPath;
    }

    public String getMessageLogin() {
        return messageLogin;
    }

    public void setMessageLogin(String messageLogin) {
        this.messageLogin = messageLogin;
    }

    public void setModuloIrPath(String moduloIrPath) {
        this.moduloIrPath = moduloIrPath;
    }

    public String getDatosUser() {
        return datosUser;
    }

    public Company getCompanySelect() {
        return companySelect;
    }

    public void setCompanySelect(Company companySelect) {
        this.companySelect = companySelect;
    }

    public void setDatosUser(String datosUser) {
        this.datosUser = datosUser;
    }

    public String getRespLogin() {
        return respLogin;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Employee getEmployeeUser() {
        return employeeUser;
    }

    public void setEmployeeUser(Employee employeeUser) {
        this.employeeUser = employeeUser;
    }

    public void setRespLogin(String respLogin) {
        this.respLogin = respLogin;
    }

    public HttpSession getSesion() {
        return sesion;
    }

    public void setSesion(HttpSession sesion) {
        this.sesion = sesion;
    }

    public String getModuloActivePath() {
        return moduloActivePath;
    }

    public void setModuloActivePath(String moduloActivePath) {
        this.moduloActivePath = moduloActivePath;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public String getIrModuloPath() {
        return irModuloPath;
    }

    public void setIrModuloPath(String irModuloPath) {
        this.irModuloPath = irModuloPath;
    }

}
