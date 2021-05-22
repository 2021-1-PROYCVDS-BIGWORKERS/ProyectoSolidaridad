package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.SolidaridadException;

import java.util.List;

public interface UsuariosDAO {

    List<Usuario> load() throws SolidaridadException;

    Usuario load(String correo) throws SolidaridadException;
    
}
