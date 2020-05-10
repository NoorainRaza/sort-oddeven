package com.tenpearls.sort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is a simple spring boot application that sorts numbers.
 */
@SpringBootApplication
@ComponentScan("com.tenpearls.sort")
public class SortApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortApplication.class, args);
	}

}
