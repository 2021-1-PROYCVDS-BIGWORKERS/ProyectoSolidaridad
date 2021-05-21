package edu.eci.cvds.samples.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

public class CategoriaInvalida {
    private String codigo;
    private String palabra;

    public CategoriaInvalida(String palabra){
        this.codigo = UUID.randomUUID().toString();
        this.palabra = palabra;
    }
    public CategoriaInvalida(String codigo,String palabra){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString(){
        return "CategoriaInvalida{" + "codigo="+codigo+", palabra="+palabra+"}\n";
    }
}
