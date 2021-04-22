package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriasDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.CategoriaMapper;
import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public class MyBatisCategoriasDAO implements CategoriasDAO {
    @Inject
    private CategoriaMapper categoriaMapper;

    @Override
    public void save(Categoria categoria) throws SolidaridadException {
        try{
            categoriaMapper.insertarCategoria(categoria);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Categoria> load() throws SolidaridadException  {
        try{
            return categoriaMapper.consultarCategorias();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar los clientes MyBatisCategorias ",e);
        }
    }

    @Override
    public void update(String categoriaNombre, String nombre, String descripcion, String estado) throws SolidaridadException {
        try{
            if(nombre!=null) { categoriaMapper.updateNombre(categoriaNombre,nombre); }
            if(descripcion!=null) { categoriaMapper.updateDescripcion(categoriaNombre,descripcion); }
            if(estado!=null) { categoriaMapper.updateEstado(categoriaNombre,estado); }
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("Error al actualizar la categoria "+nombre);
        }
    }
}
