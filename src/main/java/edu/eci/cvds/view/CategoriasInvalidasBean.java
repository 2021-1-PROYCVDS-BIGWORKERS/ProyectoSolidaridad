package edu.eci.cvds.view;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.CategoriaInvalida;
import edu.eci.cvds.samples.services.CategoriasInvalidasService;
import edu.eci.cvds.samples.services.SolidaridadException;


import java.util.List;

@ManagedBean(name = "CategoriasInvalidasBean")
@ApplicationScoped
public class CategoriasInvalidasBean extends BasePageBean{
    @Inject
    private CategoriasInvalidasService categoriasInvalidasService;

    public CategoriaInvalida consultarCategoriaInvalida(String palabra) throws SolidaridadException{
        try{
            return categoriasInvalidasService.consultarCategoriaInvalida(palabra);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La categoria no existe");
        }
    }

    public List<CategoriaInvalida> consultarCategoriasInvalidas() throws SolidaridadException{
        try{
            return categoriasInvalidasService.consultarCategoriasInvalidas();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las categorias Invalidas de  CategoriasBean");
        }
    }

}
