package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		System.out.println("Main Method called");
		SpringApplication.run(MyAppApplication.class, args);
	}

}
