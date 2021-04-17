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
    
    private String username;
    private String correo;
    private String contrasena;
     public void doLogin() {
    	// subject = SecurityUtils.getSubject();
    	// if (getUsername()=="") {
    	// 	setUsername(null);}
        // UsernamePasswordToken token = new UsernamePasswordToken(getUsername(), new Sha256Hash(getPassword()).toHex());
        // try {
        //     subject.login(token);
        //     if (subject.hasRole("Administrador")) {
        //         FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/inicioAdministrador.xhtml");
		// 	} 
		// 	else if (subject.hasRole("Proponente")) {
        //         FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/inicioUsuarioProponente.xhtml");
		// 	}
		// 	else if (subject.hasRole("Publico")) {
        //         FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/inicioPublico.xhtml");
		// 	}
		// 	else if (subject.hasRole("PersonalPMO")) {
        //         FacesContext.getCurrentInstance().getExternalContext().redirect("/faces/InicioPMO.xhtml");
		// 	}
			
        // }
        // catch (NullPointerException e) {
        //     System.err.println("Null Pointer");
        // }
		// catch (UnknownAccountException ex) {
		// 	FacesContext context = FacesContext.getCurrentInstance();
        //     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login", "Usuario desconocido."));
           
        // } 
		// catch (IncorrectCredentialsException ex) {
		// 	FacesContext context = FacesContext.getCurrentInstance();
        //     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login", "Contraseña incorrecta."));
        // } 
		// catch (LockedAccountException ex) {
		// 	FacesContext context = FacesContext.getCurrentInstance();
        //     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login", "Cuenta bloqueada."));
        // } 
		// catch (AuthenticationException | IOException ex) {
		// 	FacesContext context = FacesContext.getCurrentInstance();
        //     context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login", "Todos los campos son obligatorios."));
        // } 
    }
    public String getCorreo() {
        return correo;
    }
    /**
     * Method  to get user password
     * @return String
     */
    public String getUsername() {
        return username;
    }
    /**
     * Method  to get user password
     * @return String
     */
    public void setUsername(String username) {
        this.username = username;
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
