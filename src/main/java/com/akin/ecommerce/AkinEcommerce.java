package com.akin.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class AkinEcommerce {

	public static void main(String[] args) {
		Arrays.sort(args);
		SpringApplication.run(AkinEcommerce.class, args);
	}

}
