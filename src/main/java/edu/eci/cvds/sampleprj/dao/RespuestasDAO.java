package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Respuesta;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface RespuestasDAO {

    
    void save(Respuesta Respuesta) throws SolidaridadException;

    List<Respuesta> load() throws SolidaridadException;

    Respuesta load(String nombre) throws SolidaridadException;

}
