package edu.eci.cvds;

import static org.junit.Assert.assertTrue;

import edu.eci.cvds.samples.services.NecesidadesService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;
import org.junit.Assert;
import org.junit.Test;

public class NecesidadTest {
    NecesidadesService necesidadesService = SolidaridadFactory.getInstance().getNecesidadesService();
    @Test
    public void deberiaRegistrarNecesidad() {
        try {
            //necesidadesService.registrarNecesidad(new Necesidad("Estudiar Ecuacion", "Estudiar Ecuaciones diferenciales", "1", "Poca", "1"));
            Assert.assertEquals(necesidadesService.consultarNecesidad("Estudiar Ecuacion").getNombre(),"Estudiar Ecuacion");
        } catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaConsultarNecesidades(){
        try{
            System.out.println(necesidadesService.consultarNecesidades());
        }catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaConsultarNecesidadExplicita(){
        try{
            Assert.assertEquals(necesidadesService.consultarNecesidad("Estudiar Ecuacion").getNombre(),"Estudiar Ecuacion");
        }catch (SolidaridadException e){
            Assert.fail();
        }
    }

    @Test
    public void deberiaActualizarNecesidad(){
        try {
            necesidadesService.actualizarNecesidad("Estudiar Ecuacion","Resuelta");
            Assert.assertEquals(necesidadesService.consultarNecesidad("Estudiar Ecuacion").getEstado(),"Resuelta");
        }catch (SolidaridadException e){
            Assert.fail();
        }
    }

}
