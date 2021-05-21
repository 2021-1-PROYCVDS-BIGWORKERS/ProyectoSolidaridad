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
    public List<Oferta> consultarOfertas() throws SolidaridadException {
        try {
            return ofertasDAO.load();
        } catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran clientes");
        }
    }
    @Override
    public void actualizarOferta(String nombreOferta, String estado) throws SolidaridadException {
        try{
            ofertasDAO.update(nombreOferta,estado);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("No se puede actualizar el estado a "+estado);
        }
    }

    @Override
    public Oferta consultarOferta(String nombre) throws SolidaridadException {
        try{
            return ofertasDAO.load(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La oferta "+nombre+" no existe");
        }
    }
    @Override
    public int consultarNumeroOfertaPorEstado(String estado) {
        try{
            return ofertasDAO.consultarNumeroOfertaPorEstado(estado).size();
        }
        catch (Exception e){
            return 0;
        }
    }
}


