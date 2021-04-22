package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.CategoriasService;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.sql.Date;
import java.util.List;

@ManagedBean(name = "CategoriasBean")
@ApplicationScoped
public class CategoriasBean extends BasePageBean{
    @Inject
    private CategoriasService categoriasService;

    public void registrarCategoria( String nombre, String descripcion){
        try{
            categoriasService.registrarCategoria(new Categoria(nombre, descripcion));
        }catch (Exception e){
            e.printStackTrace();
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
