package com.hyemin.designpattern;

import com.hyemin.designpattern.create.CreateClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {
	private final CreateClient createClient;

	public DesignPatternApplication(final CreateClient createClient) {
		this.createClient = createClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		createClient.run();
	}
}
