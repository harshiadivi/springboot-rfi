package com.learn.first_web_app;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FirstWebAppApplication implements CommandLineRunner {

	@Value("${spring.datasource.url}")
	private String databaseUrl;

	public static void main(String[] args) {
		SpringApplication.run(FirstWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Connected to database: " + databaseUrl);
	}
}