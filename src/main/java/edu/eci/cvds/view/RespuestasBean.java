package edu.eci.cvds.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.services.*;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.sql.Date;
import java.util.List;

@ManagedBean(name = "RespuestasBean")
@ApplicationScoped
public class RespuestasBean extends BasePageBean{

    @Inject
    private RespuestasService RespuestasService;

    public void registrarRespuesta(String nombre, String comentarios, String idNecesidad,String idOferta, String nickname){
        try{
            RespuestasService.registrarRespuesta(new Respuesta(nombre,comentarios,idNecesidad,idOferta,nickname));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Respuesta> consultarRespuestas() throws SolidaridadException{
        try{
            return RespuestasService.consultarRespuestas();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las Respuestas en RespuestasBean");
        }
    }
}

