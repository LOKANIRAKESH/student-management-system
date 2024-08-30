package com.example.DemoOfControllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.DemoOfControllers.Controllers", "com.example.DemoOfControllers.Services"})
public class DemoOfControllersApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoOfControllersApplication.class, args);
	}
}
