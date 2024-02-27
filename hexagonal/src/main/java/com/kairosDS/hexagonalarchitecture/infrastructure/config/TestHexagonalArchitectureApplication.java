package com.kairosDS.hexagonalarchitecture.infrastructure.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/*
 * 
 * clase para configurar e inyectar los bean desde
 * el paquete configurado
 */
@SpringBootApplication(scanBasePackages = "com.kairosDS.hexagonalarchitecture.infrastructure")
@EntityScan(basePackages = "com.kairosDS.hexagonalarchitecture.domain")
public class TestHexagonalArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestHexagonalArchitectureApplication.class, args);
	}

}
