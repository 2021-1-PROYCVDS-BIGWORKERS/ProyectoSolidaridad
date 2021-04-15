package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name = "login")
@SessionScoped
public class LoginBean extends BasePageBean{
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
