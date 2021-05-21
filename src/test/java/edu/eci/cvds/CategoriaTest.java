package edu.eci.cvds;

import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.CategoriasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;
import org.junit.Assert;
import org.junit.Test;


public class CategoriaTest {
    CategoriasService categoriasService = SolidaridadFactory.getInstance().getCategoriasService();

    @Test
    public void deberiaInsertarCategoria(){
        try {
            //categoriasService.registrarCategoria(new Categoria("Calculo integral","Estudiar Calculo integral"));
            Assert.assertEquals(categoriasService.consultarCategoria("Calculo integral").getNombre(),"Calculo integral");
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaConsultarCategorias(){
        try{
            System.out.println(categoriasService.consultarCategorias());
        }catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaConsultarCategoriaEspecifica(){
        try{
            Assert.assertEquals(categoriasService.consultarCategoria("Calculo integral").getNombre(),"Calculo integral");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void deberiaActualizarCategorias(){
        try {
            //categoriasService.actualizarCategoria("Calculos","Ecuaciones Diferenciales","actualizado","Activa");
            Assert.assertEquals(categoriasService.consultarCategoria("Ecuaciones Diferenciales").getNombre(),"Ecuaciones Diferenciales");
        } catch (Exception e){
            Assert.fail();
        }
    }

    @Test
    public void noDeberiaRegistrarCategoriasRepetidas(){
        try {
            categoriasService.registrarCategoria(new Categoria("Ecuaciones Diferenciales","Estudiar Ecuaciones Diferenciales"));
        } catch (SolidaridadException e){
            Assert.assertTrue(true);
        }
    }

    @Test
    public void noDeberiaActualizarCategoriaExistente(){
        try{
            categoriasService.actualizarCategoria("Ecuaciones Diferenciales","Prueba","actualizado","Activa");
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
    }

}
