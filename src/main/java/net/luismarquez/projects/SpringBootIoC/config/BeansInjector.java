package net.luismarquez.projects.SpringBootIoC.config;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryA;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryB;
import net.luismarquez.projects.SpringBootIoC.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeansInjector {

    @Bean("productMySQLRepository")
    @Primary
    public ProductRepositoryA createProductRepositoryA(){
        return new ProductRepositoryA();
    }

    @Bean("productXMLRepository")
    public ProductRepositoryB createProductRepositoryB(){
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }

}
