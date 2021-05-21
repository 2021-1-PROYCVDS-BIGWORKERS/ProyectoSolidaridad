package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface CategoriasDAO {
    void save(Categoria categoria) throws SolidaridadException;

    void delete(String nombre, String idCategoria) throws SolidaridadException;

    List<Categoria> load() throws SolidaridadException;

    void update(Categoria categoriaNombre, String nombre, String descripcion, String estado) throws SolidaridadException;

    Categoria load(String nombre) throws SolidaridadException;
    public List<Categoria> consultarNumeroCategoriasPorCategoria( String categoria) throws SolidaridadException;
    
}
