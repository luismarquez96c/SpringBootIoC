package net.luismarquez.projects.SpringBootIoC.service;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepository;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ProductService {

    private ProductRepository productRepository;


    public ProductService() {
        System.out.println("Creando instancia de " + this.getClass().getSimpleName());
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
