package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.CategoriaInvalida;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface CategoriasInvalidasDAO {

    List<CategoriaInvalida> load() throws SolidaridadException;
    CategoriaInvalida load(String palabra) throws SolidaridadException;
}
