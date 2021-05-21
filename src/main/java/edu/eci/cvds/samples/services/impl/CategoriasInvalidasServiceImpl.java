package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriasInvalidasDAO;
import edu.eci.cvds.samples.entities.CategoriaInvalida;
import edu.eci.cvds.samples.services.CategoriasInvalidasService;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;


public class CategoriasInvalidasServiceImpl implements CategoriasInvalidasService{

    @Inject
    private CategoriasInvalidasDAO categoriasInvalidasDAO;

    @Override
    public List<CategoriaInvalida> consultarCategoriasInvalidas() throws SolidaridadException {
        try{
            return categoriasInvalidasDAO.load();
        }catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran categoria Invalida");
        }
    }

    @Override
    public CategoriaInvalida consultarCategoriaInvalida(String palabra) throws SolidaridadException {
        try{
            return categoriasInvalidasDAO.load(palabra);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La categoria Invalida "+palabra+" no existe");
        }
    }
}
