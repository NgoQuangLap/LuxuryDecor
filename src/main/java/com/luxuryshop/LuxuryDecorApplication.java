package com.luxurydecor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class LuxuryDecorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuxuryDecorApplication.class, args);
	}

}
