package net.luismarquez.projects.SpringBootIoC;

import net.luismarquez.projects.SpringBootIoC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Spring con la interfaz CommandLineRunner");
	}

	@Bean
	public CommandLineRunner comandoGenerico(){
		return (args) -> {
			System.out.println("Hola Spring con la interfaz CommandLineRunner implementada con una expresión Lambda");
		};
	}

	@Bean
	public CommandLineRunner comandoUtilizandoAutowired(){
		return args -> {
			productRepository.save("Control Remoto");
			productRepository.remove("Mouse USB Genérico");
		};
	}
}
