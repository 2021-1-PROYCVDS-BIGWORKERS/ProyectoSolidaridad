package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.UsuariosDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.UsuarioMapper;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public class MyBatisUsuariosDAO implements UsuariosDAO {
    @Inject
    private UsuarioMapper UsuarioMapper;

    @Override
    public List<Usuario> load() throws SolidaridadException  {
        try{
            return UsuarioMapper.consultarUsuarios();
        }catch (Exception e){
            throw new SolidaridadException("Error al consultar los clientes MyBatisUsuarios ",e);
        }
    }
    @Override
    public Usuario load(String correo) throws SolidaridadException {
        try{
            return UsuarioMapper.consultarUsuario(correo);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La Usuario consultada no existe");
        }
    }

}
