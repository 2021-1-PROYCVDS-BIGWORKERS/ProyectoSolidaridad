package edu.eci.cvds.samples.services.client;


import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.services.*;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;

import java.sql.Date;
import java.time.LocalDate;

public class MyBatisClient {
    public static void main(String[] args) throws SolidaridadException {
        NecesidadesService necesidadesService = SolidaridadFactory.getInstance().getNecesidadesService();
        //RespuestasService respuestasService = SolidaridadFactory.getInstance().getRespuestasService();
        System.out.println("--------------------------------------------");
        //necesidadesService.actualizarNecesidad("Flint", "Cerrada");
        //respuestasService.registrarRespuesta(new Respuesta("prueba","funciona", "2", null, "2"));
        necesidadesService.registrarNecesidad(new Necesidad("PaPa", "Falta de de PaPa","1" ,"Poca", "1"));
        System.out.println("--------------------------------------------");
        //System.out.println(necesidadesService.consultarNecesidades()) ;
        //System.out.println(respuestasService.consultarRespuesta("Boy")) ;
        
        }
}
