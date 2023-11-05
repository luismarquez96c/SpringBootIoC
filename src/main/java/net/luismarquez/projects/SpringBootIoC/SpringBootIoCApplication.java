package net.luismarquez.projects.SpringBootIoC;

import net.luismarquez.projects.SpringBootIoC.service.ProductService;
import net.luismarquez.projects.SpringBootIoC.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootIoCApplication {

	@Value("${messages.success}")
	private String message;

	@Autowired
	private ProductService productService;

	@Autowired
	private ShoppingCarService shoppingCarService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@RequestMapping("/example")
	public String example(){
		productService.save("Zapatos Nike");
		return "Hello Spring Boot IoC";
	}

	@RequestMapping("/get-message")
	public String getExample(){
		return message;
	}

	@RequestMapping("/add-product")
	public String addProduct(){
		shoppingCarService.add();
		return "Producto agregado";
	}

	@RequestMapping("/get-products")
	public List<String> getProducts(){
		return shoppingCarService.get();
	}

}
