package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.services.*;
import edu.eci.cvds.samples.services.SolidaridadException;
import org.primefaces.model.chart.*;
import javax.annotation.PostConstruct;
import edu.eci.cvds.samples.services.SolidaridadFactory;


import java.sql.Date;
import java.util.List;

@ManagedBean(name = "UsuariosBean")
@ApplicationScoped
public class UsuariosBean extends BasePageBean{
    @Inject
    private UsuariosService UsuariosService;


 
    public Usuario consultarUsuario(String correo) throws SolidaridadException{
        try{
            return UsuariosService.consultarUsuario(correo);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("el Usuario no existe");
        }
    }

    public List<Usuario> consultarUsuarios() throws SolidaridadException{
        try{
            return UsuariosService.consultarUsuarios();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar los Usuarios en UsuariosBean");
        }
    }

 
    
}
