package net.luismarquez.projects.SpringBootIoC.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("productXMLRepository")
@Repository("productXMLRepository")
public class ProductRepositoryB implements ProductRepository {

    @PostConstruct
    public void postConstruct(){
        System.out.println("====> Creando instancia de " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("====> Destruyendo instancia de " + this.getClass().getSimpleName());
    }

    public void save(String name){
        System.out.println("== SAVE " + this.getClass().getSimpleName() + " ==");
        System.out.println("Producto guardado exitosamente: " + name);
    }

    public void remove(String name){
        System.out.println("== REMOVE " + this.getClass().getSimpleName() + " ==");
        System.out.println("Producto eliminiado exitosamente: " + name);
    }

}
