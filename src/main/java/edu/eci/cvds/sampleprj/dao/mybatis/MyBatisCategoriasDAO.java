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
    public void update(Categoria categoria, String nombre, String descripcion, String estado) throws SolidaridadException {
        try{
            String aNombre = categoria.getNombre();
            if (nombre != null){
                categoria.setNombre(nombre);
            }
            if (descripcion != null){
                categoria.setDescripcion(descripcion);
            }
            if (descripcion != null){
                categoria.setEstado(estado);
            }
            categoriaMapper.update(categoria,aNombre);

        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("Error al actualizar la categoria "+nombre);
        }
    }

    @Override
    public Categoria load(String nombre) throws SolidaridadException {
        try{
            return categoriaMapper.consultarCategoria(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La categoria consultada no existe");
        }
    }
}
