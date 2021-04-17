package edu.eci.cvds.security;

import edu.eci.cvds.samples.services.SolidaridadException;
public interface Log {
    /**
     *metodo encargado del logueo del usuario
     * @param correo, representa correo del usuario
     * @param contrasena, contraseña ingresada por el usuario
     */
    public void login(String correo, String contrasena) throws SolidaridadException;

    /**
     * metodo hace logout al usuario
     */
    public void logout() throws SolidaridadException;

    /**
     * Metodo retorna si esta logueado el user o no
     */
    public boolean isLogged();
}
