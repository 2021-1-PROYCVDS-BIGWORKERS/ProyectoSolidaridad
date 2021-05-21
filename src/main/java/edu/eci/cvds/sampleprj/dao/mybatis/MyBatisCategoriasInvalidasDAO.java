package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.CategoriasInvalidasDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.CategoriaInvalidaMapper;
import edu.eci.cvds.samples.entities.CategoriaInvalida;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public class MyBatisCategoriasInvalidasDAO implements CategoriasInvalidasDAO{
    @Inject
    private CategoriaInvalidaMapper categoriaInvalidaMapper;

    public List<CategoriaInvalida> load() throws SolidaridadException {
        try {
            return categoriaInvalidaMapper.consultarCategoriasInvalidas();
        } catch (Exception e) {
            throw new SolidaridadException("Error al consultar las categorias Invalidas MyBatisCategoriasInvalidas ", e);
        }
    }

    @Override
    public CategoriaInvalida load(String palabra) throws SolidaridadException {
        try {
            return categoriaInvalidaMapper.consultarCategoriaInvalida(palabra);
        } catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("La categoria Invaldia consultada no existe");
        }
    }

}
