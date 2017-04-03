package com.sb;
/**
 * Spring Boot main application
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SpringBootRestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
