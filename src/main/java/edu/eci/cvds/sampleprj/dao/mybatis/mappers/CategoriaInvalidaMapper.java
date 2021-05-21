package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.CategoriaInvalida;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CategoriaInvalidaMapper {
    List<CategoriaInvalida> consultarCategoriasInvalidas();

    CategoriaInvalida consultarCategoriaInvalida(@Param("palabra") String palabra);

}
