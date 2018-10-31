package com.javatechie.spring.boot.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAdminClientApplication {

	Logger log = LoggerFactory.getLogger(SpringBootAdminClientApplication.class);

	@GetMapping("/message")
	public String getMessage() {
		log.debug("Logging for message() method....");
		return "Spring boot admin client example";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminClientApplication.class, args);
	}
}
