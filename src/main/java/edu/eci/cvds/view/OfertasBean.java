package edu.eci.cvds.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.OfertasService;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.sql.Date;
import java.util.List;

@ManagedBean(name = "OfertasBean")
@ApplicationScoped
public class OfertasBean extends BasePageBean{
    @Inject
    private OfertasService ofertasService;

    public void registrarOferta(String idCategoria, String nombre, String descripcion,String estado,String nickname) {
        try {
            ofertasService.registrarOferta(new Oferta(idCategoria,nombre, descripcion,estado,nickname));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Oferta consultarOferta(String nombre) throws SolidaridadException{
        try{
            return ofertasService.consultarOferta(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La oferta no existe");
        }
    }

    public void actualizarOferta(String nombreOferta,String estado) throws SolidaridadException {
        try{
            ofertasService.actualizarOferta(nombreOferta,estado);
        }catch (Exception e){
            throw new SolidaridadException("Error al actualizar el estado de la Oferta "+estado);
        }
    }

    public List<Oferta> consultarOfertas() throws SolidaridadException{
        try{
            return ofertasService.consultarOfertas();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las ofertas en CategoriasBean");
        }
    }


}

