package com.self;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

	@GetMapping("/jenkins")
	public String dockerJenkinsIntegration(){
		return "this is docker jenkins integration,,,";
	}

}
