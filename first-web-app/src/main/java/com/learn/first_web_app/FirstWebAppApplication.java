package com.learn.first_web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@Configuration → Defines this class as a configuration class.
//@EnableAutoConfiguration → Automatically configures Spring Boot based on dependencies.
//@ComponentScan → Scans the package for Spring components (like Controllers and Services).
@SpringBootApplication
public class FirstWebAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstWebAppApplication.class, args);
	}

}
