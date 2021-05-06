package edu.eci.cvds.samples.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.sql.Date;
import java.util.UUID;


public class Oferta {

    private String idOferta;
    private String idCategoria;
    private String nombre;
    private String descripcion;
    private Date fechacreacion;
    private String estado;
    private Date fechamodificacion;
    private String nickname;

   public Oferta(String idCategoria,String nombre,String descripcion,String estado, String nickname){

       this.idOferta=UUID.randomUUID().toString();
       this.idCategoria=idCategoria;
       this.nombre=nombre;
       this.descripcion=descripcion;
       this.fechacreacion= Date.valueOf(LocalDate.now());
       this.estado=estado;
       this.fechamodificacion=Date.valueOf(LocalDate.now());
       this.nickname= nickname;
   }

    public Oferta(String idOferta, String idCategoria,String nombre,String descripcion, Date fechacreacion, String estado , Date fechamodificacion,String nickname) {
    }

    public String getIdOferta() {
       return idOferta;
    }

    public void setIdOferta(String idOferta) {
       this.idOferta = idOferta;
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

    public Date getFechacreacion() {
       return this.fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
       this.fechacreacion = fechacreacion;
    }

    public String getEstado() {
       return this.estado;
    }

    public void setEstado(String estado) {
       this.estado = estado;
    }

    public Date getFechamodificacion() {
        return this.fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
       this.fechamodificacion = fechamodificacion;
    }

    public String getNickname() {
       return this.nickname;
    }

    public void setNickname(String nickname) {
       this.nickname = nickname;
    }

    @Override
    public String toString(){
        return "Oferta{" + "idOferta="+idOferta+"," + "idCategoria= "+idCategoria+", " + "nombre="+nombre+", " + "descripcion="+descripcion+"" + ", estado="+estado+"}\n";
    }
}

