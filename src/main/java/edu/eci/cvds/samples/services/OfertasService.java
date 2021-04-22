package edu.eci.cvds.samples.services;
import edu.eci.cvds.samples.entities.Oferta;
import java.util.List;



public interface OfertasService {
    public abstract void registrarOferta(Oferta oferta) throws SolidaridadException;

    public abstract List<Oferta> consultarOferta() throws SolidaridadException;
}
