package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.Necesidad;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NecesidadMapper {
    void insertarNecesidad(@Param("necesidad") Necesidad necesidad);

    List<Necesidad> consultarNecesidades();

    void updateEstado(@Param("necesidad")String necesidadNombre,@Param("estado") String estado);
}
