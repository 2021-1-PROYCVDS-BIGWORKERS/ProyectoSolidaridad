package edu.eci.cvds.samples.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class Usuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String correo;
    private String estado;
    private String idrol;
    
    public Usuario(String nickname,String nombre,String apellido,String correo, String estado, String idrol){
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.estado = estado;
        this.idrol = idrol;
    }
 
    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdrol() {
        return this.idrol;
    }

    public void setIdrol(String idrol) {
        this.idrol = idrol;
    }



   
    @Override
    public String toString(){
        return "Usuario{" + "nickname="+nickname+", nombre="+nombre+", apellido="+apellido+", correo="+correo+", estado="+estado+", idrol="+idrol+"}\n";
    }
}
