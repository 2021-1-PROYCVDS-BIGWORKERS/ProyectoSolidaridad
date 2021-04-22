package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.OfertasDAO;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.OfertasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import javax.transaction.Transactional;
import java.util.List;

public class OfertasServiceImpl implements OfertasService {
    @Inject
    private OfertasDAO ofertasDAO;

    @Transactional
    @Override
    public void registrarOferta(Oferta oferta) throws SolidaridadException {
        try{
            ofertasDAO.save(oferta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Oferta> consultarOferta() throws SolidaridadException {
        try{
            return ofertasDAO.load();
        }catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran clientes");
        }
    }
}
