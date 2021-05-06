package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Necesidad;
import edu.eci.cvds.samples.services.NecesidadesService;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.sql.Date;
import java.util.List;

@ManagedBean(name = "NecesidadesBean")
@ApplicationScoped
public class NecesidadesBean extends BasePageBean{
    @Inject
    private NecesidadesService NecesidadesService;

    public void registrarNecesidad( String nombre, String descripcion, String idCategoria, String urgencia, String nickname){
        try{
            NecesidadesService.registrarNecesidad(new Necesidad(nombre, descripcion,idCategoria,urgencia,nickname));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Necesidad> consultarNecesidades() throws SolidaridadException{
        try{
            return NecesidadesService.consultarNecesidades();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las Necesidades en NecesidadesBean");
        }
    }

    public void actualizarNecesidad(String nombreNecesidad,String estado) throws SolidaridadException {
        try{
            NecesidadesService.actualizarNecesidad(nombreNecesidad,estado);
        }catch (Exception e){
            throw new SolidaridadException("Error al actualizar el estado de la Necesidad "+estado);
        }
    }
    public Necesidad consultarNecesidad(String nombre) throws SolidaridadException{
        try{
            return NecesidadesService.consultarNecesidad(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La necesidad no existe");
        }
    }

}
