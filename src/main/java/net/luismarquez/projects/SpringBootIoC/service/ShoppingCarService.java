package net.luismarquez.projects.SpringBootIoC.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCarService {

    private final List<String> products = new ArrayList<>();
    private Integer counter = 0;

    public void add(){
        counter++;
        products.add(counter.toString() + " - Microfono");
    }

    public List<String> get(){
        return products;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("====> Creando instancia de " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("====> Destruyendo instancia de " + this.getClass().getSimpleName());
    }

}
