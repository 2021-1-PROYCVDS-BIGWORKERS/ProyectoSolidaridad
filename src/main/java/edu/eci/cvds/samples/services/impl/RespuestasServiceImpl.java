package edu.eci.cvds.samples.services.impl;

import edu.eci.cvds.samples.services.RespuestasService;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.RespuestasDAO;
import edu.eci.cvds.samples.entities.Respuesta;
import edu.eci.cvds.samples.services.*;
import edu.eci.cvds.samples.services.SolidaridadException;
import javax.transaction.Transactional;
import java.util.List;


public class RespuestasServiceImpl implements RespuestasService {
    @Inject
    private RespuestasDAO RespuestasDAO;

    @Transactional
    @Override
    public void registrarRespuesta(Respuesta Respuesta) throws SolidaridadException {
        try{
            RespuestasDAO.save(Respuesta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Respuesta> consultarRespuestas() throws SolidaridadException {
        try{
            return RespuestasDAO.load();
        }catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran Respuestas");
        }
    }

}

