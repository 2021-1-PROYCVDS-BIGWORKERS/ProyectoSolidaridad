package edu.eci.cvds;

import static org.junit.Assert.assertTrue;

import edu.eci.cvds.samples.entities.Respuesta;
import edu.eci.cvds.samples.services.RespuestasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RespuestaTest
{
    RespuestasService respuestasService = SolidaridadFactory.getInstance().getRespuestasService();

    @Test
    public void deberiaRegistrarRespuestas() {
        try {
            //respuestasService.registrarRespuesta(new Respuesta("Calculo", "Yo lo hago", null, "1", "1"));
            Assert.assertEquals(respuestasService.consultarRespuesta("Calculo").getNombre(),"Calculo");
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void consultarRespuestas(){
        try{
            System.out.println(respuestasService.consultarRespuestas());
        }catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void consultarRespuesta(){
        try{
            Assert.assertEquals(respuestasService.consultarRespuesta("Calculo").getNombre(),"Calculo");
        }catch (SolidaridadException e){
            Assert.fail();
        }
    }
}
