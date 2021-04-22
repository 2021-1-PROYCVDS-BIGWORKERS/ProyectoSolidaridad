package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface CategoriasDAO {
    void save(Categoria categoria) throws SolidaridadException;

    List<Categoria> load() throws SolidaridadException;

    void update(String categoriaNombre,String nombre, String descripcion, String estado) throws SolidaridadException;
}
