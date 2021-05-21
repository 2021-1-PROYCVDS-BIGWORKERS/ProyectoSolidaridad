package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.Categoria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoriaMapper {
    void insertarCategoria(@Param("categoria") Categoria categoria);

    void eliminarCategoria(@Param("nombre") String nombre,@Param("idCategoria") String idCategoria);

    List<Categoria> consultarCategorias();

    Categoria consultarCategoria(@Param("nombre") String nombre);

    void update(@Param("categoria") Categoria categoria, @Param("aNombre") String aNombre);
}
