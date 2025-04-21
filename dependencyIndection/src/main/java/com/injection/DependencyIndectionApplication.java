package com.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyIndectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyIndectionApplication.class, args);
		System.out.println("Ram Kumar maniyari");
	}
}
