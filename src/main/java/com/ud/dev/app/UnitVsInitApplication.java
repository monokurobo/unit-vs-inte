package com.ud.dev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ud.dev.controllers", "com.ud.dev.services"})
public class UnitVsInitApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitVsInitApplication.class, args);
	}

}
