package com.example.githubcicidactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicidActionsApplication {


	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to ci/cd";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicidActionsApplication.class, args);
	}

}
