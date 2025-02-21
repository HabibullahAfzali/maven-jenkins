package com.testjenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void printMessage(String text) {

		System.out.println(text);
	}

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
		printMessage("******************************");
		printMessage("Hola desde Spring boot!");
		printMessage("******************************");
	}

}
