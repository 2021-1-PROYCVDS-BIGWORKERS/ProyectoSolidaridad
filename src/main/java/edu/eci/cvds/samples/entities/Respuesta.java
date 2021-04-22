package edu.eci.cvds.samples.entities;

import java.io.Serializable;
import java.util.Date;

public class Respuesta implements Serializable{

    private int idRespuesta;
    private int idOferta;
    private int idNecesidad;
    private String nombre;
    private String comentarios;
    private Date fechacreacion;
    private Date fechamodificacion;
    private String nickname;

    public Respuesta(int idRespuesta,int idOferta,int idNecesidad,String nombre,String comentarios,Date fechacreacion,Date fechamodificacion,String nickname){
    this.idRespuesta = idRespuesta;
    this.idOferta = idOferta;
    this.idNecesidad = idNecesidad;
    this.nombre = nombre;
    this.comentarios = comentarios;
    this.fechacreacion = fechacreacion;
    this.fechamodificacion = fechamodificacion;
    this.nickname = nickname;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }
    public int getIdOferta() {
        return idOferta;
    }
    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public int getIdNecesidad() {
        return idNecesidad;
    }

    public void setIdNecesidad(int idNecesidad) {
        this.idNecesidad = idNecesidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
