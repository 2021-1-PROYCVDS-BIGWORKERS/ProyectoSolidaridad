package edu.eci.cvds.guice;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.eci.cvds.samples.services.*;
import  edu.eci.cvds.samples.services.impl.*;
import  edu.eci.cvds.security.*;
import  edu.eci.cvds.sampleprj.dao.mybatis.*;
import  edu.eci.cvds.sampleprj.dao.*;

import  edu.eci.cvds.security.*;


public class GuiceContextListener implements ServletContextListener  {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
		
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
			
            @Override
            protected void initialize() {

                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");
				
				// //binding
                // //login
                bind(Log.class).to(ShiroLog.class);
                // //DAO
                bind(CategoriasDAO.class).to(MyBatisCategoriasDAO.class);
                bind(NecesidadesDAO.class).to(MyBatisNecesidadesDAO.class);
                        // bind(OfertasDAO.class).to(MyBatisOfertasDAO.class);
                bind(RespuestasDAO.class).to(MyBatisRespuestasDAO.class);
                // //Impl
                bind(CategoriasService.class).to(CategoriasServiceImpl.class);
                bind(NecesidadesService.class).to(NecesidadesServiceImpl.class);
                // bind(OfertasService.class).to(OfertasServiceImpl.class);
                bind(RespuestasService.class).to(RespuestasServiceImpl.class);
            }
        });

        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute(Injector.class.getName(), injector);
    }

}
