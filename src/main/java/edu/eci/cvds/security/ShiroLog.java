
package edu.eci.cvds.security;

import edu.eci.cvds.samples.services.SolidaridadException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;

public class ShiroLog implements Log {
    @Override
    public void login(String correo, String constraseña) throws SolidaridadException {
       
       
    }

    @Override
    public void logout()throws SolidaridadException {
       
    }

    @Override
    public boolean isLogged() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

}