package net.luismarquez.projects.SpringBootIoC.config;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {

    @Bean
    public RestTemplate restTemplate(@Qualifier("productXMLRepository") ProductRepository productRepository ){
        System.out.println("Creando de un RestTemplate");
        productRepository.save("T-SHIRT XL");
        return new RestTemplate();
    }

}
