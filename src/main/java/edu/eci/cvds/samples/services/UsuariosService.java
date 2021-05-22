package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Usuario;

import java.util.List;

public interface UsuariosService {

    public abstract List<Usuario> consultarUsuarios() throws SolidaridadException;

    Usuario consultarUsuario(String correo) throws SolidaridadException;

}
