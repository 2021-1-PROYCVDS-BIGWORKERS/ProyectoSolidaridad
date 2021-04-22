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
            logCorrecto();
            System.out.println("current user----------------------------");
            
            System.out.println(SecurityUtils.getSubject());
            currentUser = SecurityUtils.getSubject();
             System.out.println("fin user----------------------------");
             
            //  System.out.println(log.isLogged());
             System.out.println("fin log----------------------------");
             System.out.println( SecurityUtils.getSubject().isAuthenticated());
             System.out.println( "fin isAuthenticated----------------------------");
             if (log.isLogged()) {
             System.out.println("Ya esta loggeado----------------------------");
                 throw new SolidaridadException("Ya estas loggeado");
             }
             else {
                System.out.println(" esta logeando----------------------------");
                System.out.println(correo);
                System.out.println(contrasena);
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
            facesContext.getExternalContext().redirect("../faces/home.xhtml");
        
                
        }
        catch (Exception exception) {
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
