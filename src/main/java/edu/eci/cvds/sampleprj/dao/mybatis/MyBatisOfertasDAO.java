package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.OfertasDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.OfertaMapper;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public class MyBatisOfertasDAO implements OfertasDAO {
    @Inject
    private OfertaMapper ofertaMapper;

    @Override
    public void save(Oferta oferta) throws SolidaridadException {
        try {
            ofertaMapper.insertarOferta(oferta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Oferta> load() throws SolidaridadException {
        try {
            return ofertaMapper.consultarOfertas();
        } catch (Exception e) {
            throw new SolidaridadException("Error al consultar los clientes MyBatisOfertas ", e);
        }
    }
}

