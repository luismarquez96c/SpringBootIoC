package net.luismarquez.projects.SpringBootIoC.service;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepository;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {

    @Autowired
    private ProductRepositoryA productRepositoryA;

    public ProductService() {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
    }

    public void save(String name){
        productRepositoryA.save(name);
    }

    public void remove(String name){
        productRepositoryA.remove(name);
    }

}
