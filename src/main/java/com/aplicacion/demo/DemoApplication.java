package com.aplicacion.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aplicacion.demo.model.Blog;
import com.aplicacion.demo.repository.BlogRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(BlogRepository blogRepository) {
		return (args) -> {
//			blogRepository.save(new Blog("Titulo 1 Java", "Contenido Java"));
		};
	}
}
