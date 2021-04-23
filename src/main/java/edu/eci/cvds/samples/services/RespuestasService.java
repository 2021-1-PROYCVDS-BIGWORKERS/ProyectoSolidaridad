package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Respuesta;

import java.util.List;

public interface RespuestasService {
    public abstract void registrarRespuesta(Respuesta Respuesta) throws SolidaridadException;

    public abstract List<Respuesta> consultarRespuestas() throws SolidaridadException;
}
