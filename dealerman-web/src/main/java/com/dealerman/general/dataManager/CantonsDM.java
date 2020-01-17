/* 
 * Copyright (C) 2020 eddie.
 */
package com.dealerman.general.dataManager;

import com.dealerman.general.Cantons;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author eddie
 */
@ManagedBean(name = "cantonsDM")
@SessionScoped
public class CantonsDM implements Serializable {

    private Cantons canton;

    public Cantons getCanton() {
        return canton;
    }

    public void setCanton(Cantons canton) {
        this.canton = canton;
    }

}
