package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.Categoria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoriaMapper {
    void insertarCategoria(@Param("categoria") Categoria categoria);

    List<Categoria> consultarCategorias();

    Categoria consultarCategoria(@Param("nombre") String nombre);

    List<Categoria> consultarNumeroCategoriasPorCategoria(@Param("categoria") String categoria);

    void update(@Param("categoria") Categoria categoria, @Param("aNombre") String aNombre);
}
