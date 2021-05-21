package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.CategoriaInvalida;
import java.util.List;

public interface CategoriasInvalidasService {
    public abstract List<CategoriaInvalida> consultarCategoriasInvalidas() throws SolidaridadException;

    CategoriaInvalida consultarCategoriaInvalida(String palabra) throws SolidaridadException;

}
