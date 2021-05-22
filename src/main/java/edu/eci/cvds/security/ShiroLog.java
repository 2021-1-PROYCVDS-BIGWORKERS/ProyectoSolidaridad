
package edu.eci.cvds.security;

import edu.eci.cvds.samples.services.SolidaridadException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import javax.faces.context.FacesContext;
import java.io.IOException;

public class ShiroLog implements Log {
    @Override
    public void login(String correo, String constrasena) throws SolidaridadException {
     
        try {
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(correo, new Sha256Hash(constrasena).toHex(),false);
            subject.getSession().setAttribute("correo", correo);
            subject.login(token);
        }
        catch (LockedAccountException lockedAccountException){
            throw new SolidaridadException("Ha habido demasiados intentos.",lockedAccountException);
        }
        catch (UnknownAccountException unknownAccountException){
            throw new SolidaridadException("Su cuenta no es conocida.",unknownAccountException);
        }
        catch (IncorrectCredentialsException incorrectCredentialsException ){
            throw new SolidaridadException("Credenciales incorrectas.",incorrectCredentialsException);
        }
        catch (AuthenticationException authenticationException){
            throw new SolidaridadException("Error en la autenticacion.",authenticationException);
        }
        catch( Exception exception){
            throw new SolidaridadException("Woops, error inesperado",exception);
        }
    }

    @Override
    public void logout()throws SolidaridadException {
        SecurityUtils.getSubject().logout();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/login.xhtml");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw new SolidaridadException("Woops, ha ocurrido un error",ioException);
        }
    }

    @Override
    public boolean isLogged() {
        return SecurityUtils.getSubject().isAuthenticated();
    }

}