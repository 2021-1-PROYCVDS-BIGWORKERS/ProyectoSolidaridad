package edu.eci.cvds.sampleprj.dao.mybatis;

import edu.eci.cvds.sampleprj.dao.RespuestasDAO;
import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.*;
import edu.eci.cvds.samples.entities.Respuesta;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public class MyBatisRespuestasDAO implements RespuestasDAO {
    @Inject
    private RespuestaMapper RespuestaMapper;

    @Override
    public void save(Respuesta Respuesta) throws SolidaridadException {
        try{
            RespuestaMapper.insertarRespuesta(Respuesta);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Respuesta> load() throws SolidaridadException  {
        try{
            return RespuestaMapper.consultarRespuestas();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar los clientes MyBatisRespuestas ",e);
        }
    }
    @Override
    public Respuesta load(String nombre) throws SolidaridadException {
        try{
            return RespuestaMapper.consultarRespuesta(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La necesidad consultada no existe");
        }
    }


}
