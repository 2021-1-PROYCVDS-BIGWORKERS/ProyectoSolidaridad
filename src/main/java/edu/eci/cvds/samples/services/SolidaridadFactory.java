package edu.eci.cvds.samples.services;

import com.google.inject.Injector;
import edu.eci.cvds.sampleprj.dao.CategoriasDAO;
import edu.eci.cvds.sampleprj.dao.OfertasDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.MyBatisCategoriasDAO;
import edu.eci.cvds.sampleprj.dao.mybatis.MyBatisOfertasDAO;
import edu.eci.cvds.samples.entities.Oferta;
import edu.eci.cvds.samples.services.impl.CategoriasServiceImpl;
import edu.eci.cvds.samples.services.impl.OfertasServiceImpl;
import org.mybatis.guice.XMLMyBatisModule;
import java.util.Optional;

import static com.google.inject.Guice.createInjector;

public class SolidaridadFactory {
    private static final SolidaridadFactory instance = new SolidaridadFactory();
    private static Optional<Injector> optionalInjector;

    private Injector myBatisInjector(String env, String pathResource){
        return createInjector(new XMLMyBatisModule(){

            @Override
            protected void initialize() {
                setEnvironmentId(env);
                setClassPathResource(pathResource);
                bind(CategoriasService.class).to(CategoriasServiceImpl.class);
                bind(CategoriasDAO.class).to(MyBatisCategoriasDAO.class);
                bind(OfertasService.class).to(OfertasServiceImpl.class);
                bind(OfertasDAO.class).to(MyBatisOfertasDAO.class);
            }
        });
    }

    private SolidaridadFactory() { optionalInjector = Optional.empty();}

    public CategoriasService getCategoriasService(){
        if(!optionalInjector.isPresent()){
            optionalInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optionalInjector.get().getInstance(CategoriasService.class);
    }
    public OfertasService getOfertasService(){
        if(!optionalInjector.isPresent()){
            optionalInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optionalInjector.get().getInstance(OfertasService.class);
    }
    public static SolidaridadFactory getInstance(){ return instance; }


}