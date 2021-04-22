
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
        System.out.println( correo);
        System.out.println( constrasena);
        System.out.println( "correo y constraseña");
        try {
            Subject subject = SecurityUtils.getSubject();
            System.out.println( subject);
            System.out.println( new Sha256Hash(constrasena));
            System.out.println( new Sha256Hash(constrasena).toHex().toUpperCase());
            System.out.println( new Sha256Hash(constrasena).toHex().toUpperCase().getClass());
            UsernamePasswordToken token = new UsernamePasswordToken(correo, new Sha256Hash(constrasena).toHex(),false);
            System.out.println( token);
            subject.getSession().setAttribute("correo", correo);
            System.out.println(  "despues de set attribute correp");
            subject.login(token);
            System.out.println(  " subject.login(token)");
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
            System.out.println( "authentication exeption");
            System.out.println( authenticationException);
            System.out.println( authenticationException.getMessage());
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
            FacesContext.getCurrentInstance().getExternalContext().redirect("/login.xhtml");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw new SolidaridadException("Woops, ha ocurrido un error",ioException);
        }
    }

    @Override
    public boolean isLogged() {
        System.out.println( "is authenticated");
        System.out.println( SecurityUtils.getSubject().isAuthenticated());
        return SecurityUtils.getSubject().isAuthenticated();
    }

}