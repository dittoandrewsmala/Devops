package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//create image  - docker build -f Dockerfile -t spring-boot-docker .
//list images   -docker images
// run docker   -docker run -p 8080:8080 spring-boot-docker
@SpringBootApplication
@RestController
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
	@GetMapping(path="getAllModel")
	public String getAllModel() {
	return "i am ditto";
    }
}
