package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.UsuariosDAO;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.UsuariosService;
import edu.eci.cvds.samples.services.SolidaridadException;
import javax.transaction.Transactional;
import java.util.List;

public class UsuariosServiceImpl implements UsuariosService {
    @Inject
    private UsuariosDAO UsuariosDAO;


    @Override
    public List<Usuario> consultarUsuarios() throws SolidaridadException {
        try{
            return UsuariosDAO.load();
        }catch (Exception e) {
            e.printStackTrace();
            throw new SolidaridadException("No se encuentran clientes");
        }
    }

    @Override
    public Usuario consultarUsuario(String correo) throws SolidaridadException {
        try{
            return UsuariosDAO.load(correo);
        }catch (Exception e){
            e.printStackTrace();
            throw new SolidaridadException("La Usuario "+correo+" no existe");
        }
    }


 

}
