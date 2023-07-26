package com.mycityaz;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyCityAZApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCityAZApplication.class, args);
		System.out.println("Running mycityatoz");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
