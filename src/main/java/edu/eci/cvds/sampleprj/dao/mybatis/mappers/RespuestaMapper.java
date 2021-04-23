package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.Respuesta;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RespuestaMapper {
    void insertarRespuesta(@Param("Respuesta") Respuesta respuesta);

    List<Respuesta> consultarRespuestas();

}
