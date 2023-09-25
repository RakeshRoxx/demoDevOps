package com.amdocs.restDevOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDevOpsApplication.class, args);
	}
	
	@GetMapping("/")
	public String root() {
		return "Home Page";
	}
	
	@GetMapping("/hello")
	public String getTest() {
		return "Welcome to Spring Boot";
	}

}
