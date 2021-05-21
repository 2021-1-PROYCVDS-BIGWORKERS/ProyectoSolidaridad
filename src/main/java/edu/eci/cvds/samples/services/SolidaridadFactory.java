package edu.eci.cvds.samples.services;

import com.google.inject.Injector;

import edu.eci.cvds.sampleprj.dao.*;
import edu.eci.cvds.sampleprj.dao.mybatis.*;
import edu.eci.cvds.samples.services.impl.*;

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

                bind(RespuestasService.class).to(RespuestasServiceImpl.class);
                bind(RespuestasDAO.class).to(MyBatisRespuestasDAO.class);
                
                bind(NecesidadesService.class).to(NecesidadesServiceImpl.class);
                bind(NecesidadesDAO.class).to(MyBatisNecesidadesDAO.class);

                bind(OfertasService.class).to(OfertasServiceImpl.class);
                bind(OfertasDAO.class).to(MyBatisOfertasDAO.class);

                bind(CategoriasInvalidasService.class).to(CategoriasInvalidasServiceImpl.class);
                bind(CategoriasInvalidasDAO.class).to(MyBatisCategoriasInvalidasDAO.class);

            }
        });
    }

    private SolidaridadFactory() { optionalInjector = Optional.empty();}


    public RespuestasService getRespuestasService(){
        if(!optionalInjector.isPresent()){
            optionalInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optionalInjector.get().getInstance(RespuestasService.class);
    }
    
    public NecesidadesService getNecesidadesService(){
        if(!optionalInjector.isPresent()){
            optionalInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optionalInjector.get().getInstance(NecesidadesService.class);
    }
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

    public CategoriasInvalidasService getCategoriasInvalidasService() {
        if(!optionalInjector.isPresent()){
            optionalInjector = Optional.of(myBatisInjector("development","mybatis-config.xml"));
        }
        return optionalInjector.get().getInstance(CategoriasInvalidasService.class);
    }
    public static SolidaridadFactory getInstance(){ return instance; }
}

