package net.luismarquez.projects.SpringBootIoC.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepository;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

//@Component
@Service
//@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)

@RequestScope
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)

//@ApplicationScope
//@Scope(value = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductService {

    private ProductRepository productRepository;

    @PostConstruct
    public void postConstruct(){
        System.out.println("====> Creando instancia de " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("====> Destruyendo instancia de " + this.getClass().getSimpleName());
    }

    public void save(String name){
        productRepository.save(name);
    }

    public void remove(String name){
        productRepository.remove(name);
    }

    @Qualifier("productXMLRepository")
    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

}
