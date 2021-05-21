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

@ManagedBean(name = "CategoriasBean")
@ApplicationScoped
public class CategoriasBean extends BasePageBean{
    @Inject
    private CategoriasService categoriasService;
  @Inject
    private CategoriasInvalidasService categoriasInvalidasService;

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
           

            pieModel.set("Jillene",categoriasService.consultarNumeroCategoriasPorCategoria("Jillene"));
            System.out.println("Jillene");
            pieModel.set("Calculo Diferencial",categoriasService.consultarNumeroCategoriasPorCategoria("Calculo Diferencial"));
            pieModel.set("Diferencial",categoriasService.consultarNumeroCategoriasPorCategoria("Diferencial"));
            pieModel.set("Integral",categoriasService.consultarNumeroCategoriasPorCategoria("Integral"));
            pieModel.set("Ecuaciones",categoriasService.consultarNumeroCategoriasPorCategoria("Ecuaciones"));
            pieModel.set("Programacion",categoriasService.consultarNumeroCategoriasPorCategoria("Programacion"));
            pieModel.set("CVDS",categoriasService.consultarNumeroCategoriasPorCategoria("CVDS"));
            pieModel.set("POOB",categoriasService.consultarNumeroCategoriasPorCategoria("POOB"));
            pieModel.set("ARSW",categoriasService.consultarNumeroCategoriasPorCategoria("ARSW"));
            pieModel.set("Winne",categoriasService.consultarNumeroCategoriasPorCategoria("Winne"));
            pieModel.set("Yolis",categoriasService.consultarNumeroCategoriasPorCategoria("Yolis"));
            pieModel.set("Calculo integral",categoriasService.consultarNumeroCategoriasPorCategoria("Calculo integral"));
            pieModel.set("Fiorenze",categoriasService.consultarNumeroCategoriasPorCategoria("Fiorenze"));
            pieModel.setTitle("");
            System.out.println("title");
            pieModel.setShowDataLabels(true);
            System.out.println("datalabels");
            pieModel.setDataLabelFormatString("%dK");
            System.out.println("dataformat");
            pieModel.setLegendPosition("e");
            System.out.println("setlegenf");
            pieModel.setShowDatatip(true);
            System.out.println("dataship");
            pieModel.setShowDataLabels(true);
            System.out.println("datalabels");
            pieModel.setDataFormat("value");
            System.out.println("dataformat");
            pieModel.setDataLabelFormatString("%d");
            System.out.println("datalabelformat");
            pieModel.setSeriesColors("ff0000,ff4000,ff8000 ,ffbf00,ffff00,bfff00,80ff00,40ff00,00ff00,00ff40,00ff80,00ffbf,00ffff");
            System.out.println("color");
            
            
        }catch (Exception e){
            e.printStackTrace();
           
        }
        return pieModel;

    }



    public void registrarCategoria( String nombre, String descripcion){

        try{
           // CategoriasInvalidasService categoriasInvalidasService = SolidaridadFactory.getInstance().getCategoriasInvalidasService();
            System.out.println(categoriasInvalidasService.consultarCategoriasInvalidas());
            boolean valido = true;
            for (CategoriaInvalida i: categoriasInvalidasService.consultarCategoriasInvalidas()){
                System.out.println(i.getPalabra()+" "+nombre);
                if (i.getPalabra().contains(nombre)){
                    valido =false ;
                    break;   
                }
            }
            if (valido){
                categoriasService.registrarCategoria(new Categoria(nombre, descripcion));

            }else{
                throw new SolidaridadException("La categoria es no Valida");
            }

    

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void eliminarCategoria( String nombre, String idCategoria)throws SolidaridadException{
        try{
            categoriasService.eliminarCategoria(nombre, idCategoria);
        }catch (Exception e){
            System.out.println("1");
            e.printStackTrace();
        }
    }
    public Categoria consultarCategoria(String nombre) throws SolidaridadException{
        try{
            return categoriasService.consultarCategoria(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La categoria no existe");
        }
    }

    public List<Categoria> consultarCategorias() throws SolidaridadException{
        try{
            return categoriasService.consultarCategorias();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las categorias ne CategoriasBean");
        }
    }

    public void actualizarCategoria(String nombreCategoria, String nombre, String descripcion, String estado) throws SolidaridadException {
        try{
            categoriasService.actualizarCategoria(nombreCategoria,nombre,descripcion,estado);
        }catch (Exception e){
            throw new SolidaridadException("Error al actualizar la categoria "+nombre);
        }
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    
}
