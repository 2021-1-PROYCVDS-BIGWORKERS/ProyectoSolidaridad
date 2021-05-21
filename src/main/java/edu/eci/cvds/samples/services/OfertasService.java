package edu.eci.cvds.samples.services;
import edu.eci.cvds.samples.entities.Oferta;
import java.util.List;



public interface OfertasService {
    public abstract void registrarOferta(Oferta oferta) throws SolidaridadException;

    public abstract List<Oferta> consultarOfertas() throws SolidaridadException;

    public abstract void actualizarOferta(String nombreOferta, String estado) throws SolidaridadException;

    Oferta consultarOferta(String nombre) throws SolidaridadException;

    int consultarNumeroOfertaPorEstado(String estado);

}
