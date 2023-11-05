package net.luismarquez.projects.SpringBootIoC;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryA;
import net.luismarquez.projects.SpringBootIoC.repository.ProductRepositoryB;
import net.luismarquez.projects.SpringBootIoC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication {

	private ProductService productService;

	@Autowired
	public SpringBootIoCApplication(ProductService productService){
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Bean
	public CommandLineRunner comandoUtilizandoAutowired(){
		return args -> {

			productService.save("Teclado RGB");
			productService.remove("Auriculares básicos");

		};
	}
}
