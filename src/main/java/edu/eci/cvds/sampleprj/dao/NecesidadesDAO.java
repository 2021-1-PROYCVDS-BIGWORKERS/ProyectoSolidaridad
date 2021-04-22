package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Necesidad;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface NecesidadesDAO {

    void save(Necesidad Necesidad) throws SolidaridadException;

    List<Necesidad> load() throws SolidaridadException;

    void update(String nombreNecesidad,String estado) throws SolidaridadException;
}
