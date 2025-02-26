package com.testjenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TestApplication {

	public static void printMessage( String text) {
		String nombre;
		String apiedo;
		Scanner scanner = new Scanner(System.in);
		nombre =scanner.next();
		apiedo =scanner.next();
		System.out.println(nombre+" : ");
		System.out.prinln(apiedo + " : " + text);
	}

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);
		System.out.println("******************************");
		System.out.println("Su nombre! ");


		printMessage("bienvanida al programacion");
		System.out.println("******************************");
	}

}
