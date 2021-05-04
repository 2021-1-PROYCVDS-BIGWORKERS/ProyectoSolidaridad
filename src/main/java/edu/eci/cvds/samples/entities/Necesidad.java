package edu.eci.cvds.samples.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class Necesidad {
    private String idNecesidad;
    private String idCategoria;
    private String nombre;
    private String descripcion;
    private String urgencia;
    private Date fechaDeCreacion;
    private String estado;
    private Date fechaDeModificacion;
    private String nickname;

    public Necesidad(String nombre, String descripcion, String idCategoria, String urgencia, String nickname){
        this.idNecesidad = UUID.randomUUID().toString();
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urgencia = urgencia;
        this.fechaDeCreacion = Date.valueOf(LocalDate.now());
        this.estado = "Activa";
        this.fechaDeModificacion = Date.valueOf(LocalDate.now());
        this.nickname=nickname;
    }
    public Necesidad( String idNecesidad,String idCategoria,String nombre, String descripcion,String urgencia, Date fechaDeCreacion,String estado, Date fechaDeModificacion,String nickname){

    }
    public String getIdNecesidad() {
        return this.idNecesidad;
    }

    public void setIdNecesidad(String idNecesidad) {
        this.idNecesidad = idNecesidad;
    }

    public String getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrgencia() {
        return this.urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public Date getFechaDeCreacion() {
        return this.fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    @Override
    public String toString(){
        return "Necesidad{" + "idNecesidad="+idNecesidad+",idCategoria="+idCategoria+", nombre="+nombre+", descripcion="+descripcion+", estado="+estado+"}\n";
    }

}
