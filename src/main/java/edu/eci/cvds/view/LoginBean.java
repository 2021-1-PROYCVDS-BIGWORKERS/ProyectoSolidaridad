package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import com.google.inject.Inject;
import javax.servlet.http.HttpSession;



@ManagedBean(name = "login")
@SessionScoped
public class LoginBean extends BasePageBean{
    @Inject
    private String correo;
    private String contrasena;
    
    public String getCorreo() {
        return correo;
    }

    /**
     * set user email 
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Method to get user
     * @param contrasena, represents user password
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Method  to get user password
     * @return String
     */
    public String getContrasena() {
        return contrasena;
    }
}
