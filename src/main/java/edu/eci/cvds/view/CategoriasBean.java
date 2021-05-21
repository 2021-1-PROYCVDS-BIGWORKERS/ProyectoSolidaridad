package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.services.*;
import edu.eci.cvds.samples.services.SolidaridadException;
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

    
}
