package edu.eci.cvds.samples.services.client;

import edu.eci.cvds.samples.entities.Categoria;
import edu.eci.cvds.samples.services.CategoriasService;
import edu.eci.cvds.samples.services.SolidaridadException;
import edu.eci.cvds.samples.services.SolidaridadFactory;

import java.sql.Date;
import java.time.LocalDate;

public class MyBatisClient {
    public static void main(String[] args) throws SolidaridadException {
        CategoriasService categoriasService = SolidaridadFactory.getInstance().getCategoriasService();
        System.out.println("--------------------------------------------");
        /*categoriasService.registrarCategoria(new Categoria("Calculo Diferencial",
                "Estudiar Calculo diferencial"));*/
        System.out.println("--------------------------------------------");
        System.out.println(categoriasService.consultarCategorias());
        categoriasService.actualizarCategoria("Calculo",null,"Hola","Resuelta");
    }
}
