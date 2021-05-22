package edu.eci.cvds;

import static org.junit.Assert.assertTrue;

import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.OfertasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;
import org.junit.Assert;
import org.junit.Test;

public class OfertaTest {
    OfertasService ofertasService = SolidaridadFactory.getInstance().getOfertasService();

    @Test
    public void deberiaRegistrarOferta(){
        try {
            //ofertasService.registrarOferta(new Oferta("2", "Categoria2", "ASDASDA", "Activa", "4"));
            Assert.assertEquals(ofertasService.consultarOferta("Categoria2").getNombre(),"Categoria2");
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaConsultarOfertas(){
        try{
            System.out.println(ofertasService.consultarOfertas());
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaConsultarOfertaEspecifica(){
        try{
            Assert.assertEquals(ofertasService.consultarOferta("Categoria2").getNombre(),"Categoria2");
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaActualizarOferta(){
        try{
            ofertasService.actualizarOferta("Categoria2","Resuelta");
            Assert.assertEquals(ofertasService.consultarOferta("Categoria2").getEstado(),"Resuelta");
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

}
