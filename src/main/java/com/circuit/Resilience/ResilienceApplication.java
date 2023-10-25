package com.circuit.Resilience;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.circuit")
public class ResilienceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResilienceApplication.class, args);
	}

}
