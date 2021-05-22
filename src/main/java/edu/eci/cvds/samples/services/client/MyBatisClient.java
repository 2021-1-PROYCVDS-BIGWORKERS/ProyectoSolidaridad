package edu.eci.cvds.samples.services.client;



import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.services.*;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;
import org.postgresql.util.PSQLException;

import java.sql.Date;
import java.time.LocalDate;

public class MyBatisClient {
    public static void main(String[] args) throws SolidaridadException, PSQLException {

        CategoriasService categoriasService = SolidaridadFactory.getInstance().getCategoriasService();
        CategoriasInvalidasService categoriasInvalidasService =SolidaridadFactory.getInstance().getCategoriasInvalidasService();
        //categoriasService.registrarCategoria(new Categoria("pez","Estudiar l"));

        System.out.println("--------------------------------------------");
        //System.out.println(categoriasService.consultarCategorias());
        System.out.println(categoriasInvalidasService.consultarCategoriasInvalidas());
        System.out.println("--------------------------------------------");

        //System.out.println(categoriasService.consultarCategoria("pez"));
        System.out.println(categoriasInvalidasService.consultarCategoriaInvalida("pez"));
        //categoriasService.actualizarCategoria("Greg",null,null,"En proceso");
        //NecesidadesService necesidadesService = SolidaridadFactory.getInstance().getNecesidadesService();
        //RespuestasService respuestasService = SolidaridadFactory.getInstance().getRespuestasService();
        //System.out.println("--------------------------------------------");
        //necesidadesService.actualizarNecesidad("Flint", "Cerrada");
        //respuestasService.registrarRespuesta(new Respuesta("prueba","funciona", "2", null, "2"));
        //necesidadesService.registrarNecesidad(new Necesidad("PaPa", "Falta de de PaPa","1" ,"Poca", "1"));
        //System.out.println("--------------------------------------------");

        //System.out.println(necesidadesService.consultarNecesidades()) ;
        //System.out.println(respuestasService.consultarRespuesta("Boy")) ;
        //OfertasService ofertasService = SolidaridadFactory.getInstance().getOfertasService();
           // System.out.println("--------------------------------------------");
            //ofertasService.registrarOferta(new Oferta("1", "Categoria1", "JAHDSJJ","Activa","4"));
            //ofertasService.actualizarOferta("Yoko", "Activa");
            //System.out.println(ofertasService.consultarOfertas()) ;
            //System.out.println(ofertasService.consultarOferta("Yoko")) ;
       // System.out.println("--------------------------------------------");
       
        //
        

    }
}
