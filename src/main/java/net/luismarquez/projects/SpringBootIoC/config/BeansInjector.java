package net.luismarquez.projects.SpringBootIoC.config;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryA;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryB;
import net.luismarquez.projects.SpringBootIoC.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepositoryA createProductRepositoryA(){
        return new ProductRepositoryA();
    }

    @Bean
    public ProductRepositoryB createProductRepositoryB(){
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }

}
