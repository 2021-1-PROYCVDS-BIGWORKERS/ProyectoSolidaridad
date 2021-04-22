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

    public void registrarOferta(String idCategoria, String nombre, String descripcion, String nickname) {
        try {
            ofertasService.registrarOferta(new Oferta(idCategoria,nombre, descripcion,nickname));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Oferta> consultarOfertas() throws SolidaridadException{
        try{
            return ofertasService.consultarOferta();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las ofertas en OfertasBean");
        }
    }


}

