package com.nagarro.devopsAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAssignmentApplication {
	
	@GetMapping("/")
	public String test() {
		return "Application running Sucessfully !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsAssignmentApplication.class, args);
	}

}
