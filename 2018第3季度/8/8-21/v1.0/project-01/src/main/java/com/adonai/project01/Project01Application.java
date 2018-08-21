package com.adonai.project01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project01Application {
	
	
	
	  @RequestMapping("/hello")
	    public String index() {
	        return "Hello World";
	    }

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);
	}
}
