package com.codingshuttle.project.uber.uberApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProdUberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdUberApplication.class, args);
	}
}

