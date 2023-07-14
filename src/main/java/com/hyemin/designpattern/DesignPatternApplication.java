package com.hyemin.designpattern;

import com.hyemin.designpattern.create.CreateClient;
import com.hyemin.designpattern.create.abstract_factory.AbstractFactoryClient;
import com.hyemin.designpattern.create.abstract_factory.factories.GUIFactory;
import com.hyemin.designpattern.create.abstract_factory.factories.MacOSFactory;
import com.hyemin.designpattern.create.abstract_factory.factories.WindowsFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {
	private final CreateClient createClient;

	public DesignPatternApplication(final CreateClient createClient) {
		this.createClient = createClient;
	}

	private static AbstractFactoryClient configureApplication() {
		final String osName = System.getProperty("os.name").toLowerCase();
		final GUIFactory factory = osName.contains("mac") ? new MacOSFactory() : new WindowsFactory();
		return new AbstractFactoryClient(factory);
	}

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		createClient.run();
		configureApplication().paint();
	}
}
