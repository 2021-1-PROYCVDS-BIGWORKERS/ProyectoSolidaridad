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
import edu.eci.cvds.security.Log;
import edu.eci.cvds.samples.services.SolidaridadException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "login")
@SessionScoped
public class LoginBean extends BasePageBean{
    @Inject
    private Log log;
    private String correo;
    private String contrasena;
    private Subject currentUser;

     private FacesMessage.Severity estado;
    private String message;

     public void loginUser() {
        try{
            currentUser = SecurityUtils.getSubject();
            logCorrecto();
            
            currentUser = SecurityUtils.getSubject();
             
             System.out.println( SecurityUtils.getSubject().isAuthenticated());
             
             if (log.isLogged()) {
             System.out.println("Ya esta loggeado----------------------------");
                 throw new SolidaridadException("Ya estas loggeado");
             }
             else {
                System.out.println(" esta logeando----------------------------");
                log.login(correo, contrasena);
                System.out.println(" redirigiro----------------------------");
                redireccion();
             }
        }
        catch( Exception exception){
            message = exception.getMessage();
            estado = FacesMessage.SEVERITY_WARN;
            System.out.println(exception);
             System.out.println(" error message----------------------------");
             System.out.println(message);
             System.out.println(" error message----------------------------");
             System.out.println(estado);
             System.out.println(" error xd----------------------------");
            restartInput();
        }
         
    }
    public void loginState() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(estado, "LogIn", message));
    }
    public void restartInput(){
        contrasena = "";
        correo = "";
    }
     public void logCorrecto(){
        message ="Login Correcto";
        estado = FacesMessage.SEVERITY_INFO;
    }

    public void redireccion() {
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            
            HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
            session.setAttribute("correo", correo);
           
            if(currentUser.hasRole("Administrador")){
                System.out.println("finaliza redireccion administrador");
                facesContext.getExternalContext().redirect("/faces/homeAdministrador.xhtml");
            }
            
            System.out.println("finaliza redireccion");
        
                
        }
        catch (Exception exception) {
            System.out.println("exepcion redireccion");
            System.out.println(exception.getMessage());
            logOut();
        }
    }
    public void logOut(){
        try{
            log.logout();
            restartInput();
        }
        catch(Exception exception){
        }
    }

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
