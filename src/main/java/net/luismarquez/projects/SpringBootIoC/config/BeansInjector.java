package net.luismarquez.projects.SpringBootIoC.config;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepository createProductRepository(){
        return new ProductRepository();
    }

}
