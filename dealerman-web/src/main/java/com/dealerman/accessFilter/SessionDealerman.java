package com.dealerman.accessFilter;

import com.dealerman.accessDataManager.AccessDM;
import javax.inject.Inject;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author eddie
 */
public class SessionDealerman implements HttpSessionListener {

    @Inject
    AccessDM accessDM;

    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        try {

        } catch (Exception ex) {

        }
    }
}
