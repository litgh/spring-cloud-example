package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lee
 * @date 2017/10/09
 */
@SpringBootApplication
public class App implements CommandLineRunner{

	@Value("${name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("*******************" + name + "*********************");
	}
}
