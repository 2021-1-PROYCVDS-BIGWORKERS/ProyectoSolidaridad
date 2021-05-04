package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Categoria;

import java.util.List;

public interface CategoriasService {
    public abstract void registrarCategoria(Categoria categoria) throws SolidaridadException;

    public abstract List<Categoria> consultarCategorias() throws SolidaridadException;

    public abstract void actualizarCategoria(String categoriaNombre, String nombre, String descripcion, String estado) throws SolidaridadException;

    Categoria consultarCategoria(String nombre) throws SolidaridadException;
}
