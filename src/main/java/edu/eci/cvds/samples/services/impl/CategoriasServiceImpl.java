package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriasDAO;
import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.CategoriasService;
import edu.eci.cvds.samples.services.SolidaridadException;
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
    public void actualizarCategoria(String categoriaNombre,String nombre, String descripcion, String estado) throws SolidaridadException {
        try{
            categoriasDAO.update(categoriaNombre,nombre,descripcion,estado);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("No se puede actualizar la categoria "+nombre);
        }
    }

}
