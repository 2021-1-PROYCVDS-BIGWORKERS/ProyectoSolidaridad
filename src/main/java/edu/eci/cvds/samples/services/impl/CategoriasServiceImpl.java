package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriasDAO;
import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.CategoriasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import org.postgresql.util.PSQLException;

import javax.transaction.Transactional;
import java.util.List;

public class CategoriasServiceImpl implements CategoriasService {
    @Inject
    private CategoriasDAO categoriasDAO;

    @Transactional
    @Override
    public void registrarCategoria(Categoria categoria) throws SolidaridadException {
        try{
            categoriasDAO.save(categoria);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Categoria> consultarCategorias() throws SolidaridadException {
        try{
            return categoriasDAO.load();
        }catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran clientes");
        }
    }

    @Override
    public void actualizarCategoria(String categoriaNombre, String nombre, String descripcion, String estado) throws SolidaridadException, PSQLException {
        try{
            Categoria categoria = consultarCategoria(categoriaNombre);
            categoriasDAO.update(categoria,nombre,descripcion,estado);
        }catch (Exception e){
            throw new SolidaridadException("No se puede actualizar la categoria "+nombre);
        }
    }

    @Override
    public Categoria consultarCategoria(String nombre) throws SolidaridadException {
        try{
            return categoriasDAO.load(nombre);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La categoria "+nombre+" no existe");
        }
    }
    @Override
    public int consultarNumeroCategoriasPorCategoria(String categoria) {
        try{
            System.out.println(categoriasDAO.consultarNumeroCategoriasPorCategoria(categoria).size());
            return categoriasDAO.consultarNumeroCategoriasPorCategoria(categoria).size();
        }
        catch (Exception e){
            return 0;
        }
    }

    @Override
    public void eliminarCategoria(String nombre,String idCategoria) throws SolidaridadException {
        try{
            categoriasDAO.delete(nombre, idCategoria);
        }catch (Exception e){
            System.out.println("2");
            e.printStackTrace();
        } 
        
    }

}
