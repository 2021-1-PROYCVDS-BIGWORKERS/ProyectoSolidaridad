package edu.eci.cvds.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import com.google.inject.Injector;

public abstract class BasePageBean implements Serializable {

  
    private Injector injector;

    public Injector getInjector() {
        System.out.println(injector);
        System.out.println("111111111111111111");
        if (injector == null) {
            ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
            System.out.println(servletContext);
            System.out.println("222222222222");
            injector = (Injector) servletContext.getAttribute(Injector.class.getName());
            System.out.println((Injector) servletContext.getAttribute(Injector.class.getName()) );
            System.out.println("3333333333");
        }
        return injector;
    }

    public void setInjector(Injector injector) {
        this.injector = injector;
    }

    @PostConstruct
    public void init() {
        System.out.println(getInjector());
        getInjector().injectMembers(this);
    }
}