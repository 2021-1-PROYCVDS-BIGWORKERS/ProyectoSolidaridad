package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Necesidad;

import java.util.List;

public interface NecesidadesService {
    public abstract void registrarNecesidad(Necesidad Necesidad) throws SolidaridadException;

    public abstract List<Necesidad> consultarNecesidades() throws SolidaridadException;

    public abstract void actualizarNecesidad(String nombreNecesidad, String estado) throws SolidaridadException;

    Necesidad consultarNecesidad(String nombre)throws SolidaridadException;
    
    int consultarNumeroNecesidadPorEstado(String estado);
}
