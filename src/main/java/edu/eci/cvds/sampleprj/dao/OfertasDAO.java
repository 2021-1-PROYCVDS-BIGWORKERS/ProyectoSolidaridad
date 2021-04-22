package edu.eci.cvds.sampleprj.dao;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface OfertasDAO<Ofertas> {

        void save(Oferta oferta) throws SolidaridadException;

        List<Oferta> load() throws SolidaridadException;
}

