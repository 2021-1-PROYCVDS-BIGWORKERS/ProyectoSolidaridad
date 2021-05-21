package edu.eci.cvds.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.OfertasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import org.primefaces.model.chart.*;
import javax.annotation.PostConstruct;

import java.sql.Date;
import java.util.List;

@ManagedBean(name = "OfertasBean")
@ApplicationScoped
public class OfertasBean extends BasePageBean{
    @Inject
    private OfertasService ofertasService;
    private PieChartModel pieModel;

    @PostConstruct
    public void init() {
        super.init();
        try {
            
            pieModel= createPieModel();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    private PieChartModel  createPieModel()  {
        pieModel = new PieChartModel();
        try{
            pieModel.set("Activas",ofertasService.consultarNumeroOfertaPorEstado("Activa"));
            pieModel.set("Cerradas",ofertasService.consultarNumeroOfertaPorEstado("Cerrada"));
            pieModel.set("Resueltas",ofertasService.consultarNumeroOfertaPorEstado("Resuelta"));
            pieModel.set("En proceso",ofertasService.consultarNumeroOfertaPorEstado("En proceso"));
            pieModel.setTitle("");
            pieModel.setShowDataLabels(true);
            pieModel.setDataLabelFormatString("%dK");
            pieModel.setLegendPosition("e");
            pieModel.setShowDatatip(true);
            pieModel.setShowDataLabels(true);
            pieModel.setDataFormat("value");
            pieModel.setDataLabelFormatString("%d");
            pieModel.setSeriesColors("ff8c00,87cefa");
            
            
        }catch (Exception e){
            e.printStackTrace();
           
        }
        return pieModel;

    }
    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }


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

