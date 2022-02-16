package com.springboot.carefirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "com.springboot.carefirst.*" })
public class CarefirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarefirstApplication.class, args);
	}

}
