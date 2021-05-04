package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.OfertasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;

public class MyBatisClient {
        public static void main(String[] args) throws SolidaridadException {
            OfertasService ofertasService = SolidaridadFactory.getInstance().getOfertasService();
            System.out.println("--------------------------------------------");
            //ofertasService.registrarOferta(new Oferta("1", "Categoria1", "JAHDSJJ","Activa","4"));
            //ofertasService.actualizarOferta("Yoko", "Activa");
            //System.out.println(ofertasService.consultarOfertas()) ;
            System.out.println(ofertasService.consultarOferta("Yoko")) ;
        }
    }
