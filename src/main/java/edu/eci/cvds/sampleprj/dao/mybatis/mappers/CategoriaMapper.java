package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import edu.eci.cvds.samples.entities.Categoria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoriaMapper {
    void insertarCategoria(@Param("categoria") Categoria categoria);

    List<Categoria> consultarCategorias();

    void updateNombre(@Param("categoria") String categoriaNombre, @Param("nombre") String nombre);

    void updateDescripcion(@Param("categoria")String categoriaNombre, @Param("descripcion") String descripcion);

    void updateEstado(@Param("categoria")String categoriaNombre,@Param("estado") String estado);
}
