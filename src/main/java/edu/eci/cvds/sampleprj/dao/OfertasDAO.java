package edu.eci.cvds.sampleprj.dao;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface OfertasDAO{

        void save(Oferta oferta) throws SolidaridadException;

        List<Oferta> load() throws SolidaridadException;

        void update(String nombreOferta,String estado) throws SolidaridadException;

        Oferta load(String nombre) throws SolidaridadException;
}

