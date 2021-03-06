package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriasDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.CategoriaMapper;
import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.SolidaridadException;
import org.postgresql.util.PSQLException;

import java.util.List;

public class MyBatisCategoriasDAO implements CategoriasDAO {
    @Inject
    private CategoriaMapper categoriaMapper;

    @Override
    public void save(Categoria categoria) throws SolidaridadException {
        try{
            categoriaMapper.insertarCategoria(categoria);
        }catch (Exception e){
            throw new SolidaridadException("Error al insertar la categoria ",e);
        }
    }

    @Override
    public List<Categoria> load() throws SolidaridadException  {
        try{
            return categoriaMapper.consultarCategorias();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar las categorias ",e);
        }
    }

    @Override
    public void update(Categoria categoria, String nombre, String descripcion, String estado) throws SolidaridadException, PSQLException {
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
            throw new SolidaridadException("Error al actualizar la categoria "+nombre);
        }
    }

    @Override
    public Categoria load(String nombre) throws SolidaridadException {
        try{
            return categoriaMapper.consultarCategoria(nombre);
        }catch (Exception e){
            throw new SolidaridadException("La categoria consultada no existe");
        }
    }
    @Override

    public List<Categoria> consultarNumeroCategoriasPorCategoria(String categoria) throws SolidaridadException {
        try{
            return categoriaMapper.consultarNumeroCategoriasPorCategoria(categoria);
        }
        catch (Exception exception){
            throw new SolidaridadException("Error al consultar las categorias ",exception );

        }
    }
   public void delete(String nombre, String idCategoria) throws SolidaridadException {
        try{
            categoriaMapper.eliminarCategoria(nombre,idCategoria);
        }catch (Exception e){
            System.out.println("3");
            e.printStackTrace();
        }
   }
}
