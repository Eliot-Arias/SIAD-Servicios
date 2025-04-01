package com.siad.main.siadservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SiadserviciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiadserviciosApplication.class, args);
	}
}
