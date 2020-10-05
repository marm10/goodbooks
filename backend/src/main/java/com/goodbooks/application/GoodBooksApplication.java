package com.goodbooks.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@EntityScan( basePackages = {"com.goodbooks.domain"})
@EnableJpaRepositories("com.goodbooks.repository")
@ComponentScan( basePackages = {"com.goodbooks.controller"})
public class GoodBooksApplication {

	public static void main(final String[] args) {
		SpringApplication.run(GoodBooksApplication.class, args);
	}
}
