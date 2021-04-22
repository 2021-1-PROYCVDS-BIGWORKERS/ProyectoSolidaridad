package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.NecesidadesDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.NecesidadMapper;
import edu.eci.cvds.samples.entities.Necesidad;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public class MyBatisNecesidadesDAO implements NecesidadesDAO {
    @Inject
    private NecesidadMapper NecesidadMapper;

    @Override
    public void save(Necesidad Necesidad) throws SolidaridadException {
        try{
            NecesidadMapper.insertarNecesidad(Necesidad);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Necesidad> load() throws SolidaridadException  {
        try{
            return NecesidadMapper.consultarNecesidades();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar los clientes MyBatisNecesidades ",e);
        }
    }

    @Override
    public void update( String nombreNecesidad, String estado) throws SolidaridadException {
        try{
            if(estado!=null) { NecesidadMapper.updateEstado(nombreNecesidad, estado); }
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("Error al actualizar el estado de la Necesidad "+estado);
        }
    }


    }

