package com.practice.code;

import com.practice.code.springboot.caching.ProductService;
import com.practice.code.springboot.customAnnotation.SampleService;
import com.practice.code.springboot.qualifier.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableCaching
public class CodeApplication implements CommandLineRunner{

	@Autowired
	private SampleService sampleService;
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(CodeApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext ctx) {
		return args -> {
			Qualifier qualifier = ctx.getBean(Qualifier.class);
			qualifier.animalDetails();  // Output: ¡Hola!
		};
	}

	public void run(String... args) throws InterruptedException {
		System.out.println(sampleService.performTask());
		System.out.println(productService.getProductById("101")); // fetches from db
		System.out.println(productService.getProductById("101")); // fetches from cache
	}

}
