/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dealerman.daoUI;

import com.dealerman.general.Cantons;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author eddie
 */
@Local
public interface ICantonsDao
        extends IGenericDao<Cantons, Long> {

    public List<Cantons> buscar(Cantons cantons);
}
