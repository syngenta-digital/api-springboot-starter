package com.poc.helloworld.apispringbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiSpringbootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringbootStarterApplication.class, args);
		System.out.println("Hello world !!");
	}

}
