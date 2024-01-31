/*
 * File: DemoApplication.java
 * Author: Sabir Süleymanlı  		(GitHub: @sabir-suleyman) (Mail: @suleymanlisabir3@gmail.com)
 * Date: January 31, 2024
 * Description: A Spring Boot application demonstrating the basic setup of a Spring Boot project. 
 *              The main class, DemoApplication, is annotated with @SpringBootApplication, 
 *              indicating that it is the entry point of the application and includes 
 *              Spring Boot's auto-configuration features. The main method initializes the 
 *              Spring application context and starts the application.
 * 
 */

package edu.uludag.sabir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
