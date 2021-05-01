package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.NecesidadesDAO;
import edu.eci.cvds.samples.entities.Necesidad;
import edu.eci.cvds.samples.services.NecesidadesService;
import edu.eci.cvds.samples.services.SolidaridadException;
import javax.transaction.Transactional;
import java.util.List;

public class NecesidadesServiceImpl implements NecesidadesService {
    @Inject
    private NecesidadesDAO NecesidadesDAO;

    @Transactional
    @Override
    public void registrarNecesidad(Necesidad Necesidad) throws SolidaridadException {
        try{
            NecesidadesDAO.save(Necesidad);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Necesidad> consultarNecesidades() throws SolidaridadException {
        try{
            return NecesidadesDAO.load();
        }catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran Necesidades");
        }
    }

    @Override
    public void actualizarNecesidad(String nombreNecesidad, String estado) throws SolidaridadException {
        try{
            NecesidadesDAO.update(nombreNecesidad,estado);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("No se puede actualizar el estado a "+estado);
        }
    }

    @Override
    public Necesidad consultarNecesidad(String nombre) throws SolidaridadException {
        try{
            return NecesidadesDAO.load(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La necesidad "+nombre+" no existe");
        }
    }   
}


