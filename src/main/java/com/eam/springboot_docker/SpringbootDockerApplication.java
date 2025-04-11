package com.eam.springboot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@SpringBootApplication
public class SpringbootDockerApplication {

	@RequestMapping("/")
	public String home() {
		return "Hola desde Spring Boot con Docker!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
