package edu.eci.cvds.samples.entities;


import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class Respuesta {
    private String idRespuesta;
    private String idNecesidad;
    private String idOferta;
    private String nombre;
    private String comentarios;
    private Date fechaDeCreacion;
    private Date fechaDeModificacion;
    private String nickname;

   

    public Respuesta(String nombre, String comentarios, String idNecesidad,String idOferta, String nickname){
        this.idRespuesta= UUID.randomUUID().toString();
        this.idOferta = idOferta;
        this.idNecesidad = idNecesidad;
        this.nombre = nombre;
        this.comentarios = comentarios;
        this.fechaDeCreacion = Date.valueOf(LocalDate.now());
        this.fechaDeModificacion = Date.valueOf(LocalDate.now());
        this.nickname=nickname;
    }
    public Respuesta(String idRespuesta,String idNecesidad, String idOferta, String nombre, String comentarios, Date fechaDeCreacion, Date fechaDeModificacion,String nickname){
    }
    public String getIdRespuesta() {
        return this.idRespuesta;
    }

    public void setIdRespuesta(String idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getIdNecesidad() {
        return this.idNecesidad;
    }

    public void setIdNecesidad(String idNecesidad) {
        this.idNecesidad = idNecesidad;
    }

    public String getIdOferta() {
        return this.idOferta;
    }

    public void setIdOferta(String idOferta) {
        this.idOferta = idOferta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaDeCreacion() {
        return this.fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Date getFechaDeModificacion() {
        return this.fechaDeModificacion;
    }

    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
