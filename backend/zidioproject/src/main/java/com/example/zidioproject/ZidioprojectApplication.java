package com.example.zidioproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.zidioproject.entity")
public class ZidioprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZidioprojectApplication.class, args);
	}


}
