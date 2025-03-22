 package com.campuso.campuso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.campuso")
@EntityScan(basePackages = "com.campuso.model")
@EnableJpaRepositories(basePackages = "com.campuso.Repo") class CampusoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampusoApplication.class, args);
	}
	

}
