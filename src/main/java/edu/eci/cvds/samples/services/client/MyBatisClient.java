package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.OfertasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;

public class MyBatisClient {
        public static void main(String[] args) throws SolidaridadException {
            OfertasService ofertasService = SolidaridadFactory.getInstance().getOfertasService();
            ofertasService.registrarOferta(new Oferta("1", "Categoria1", "JAHDSJJ","holaaa"));


        }
    }
