package com.example;

import com.example.api.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class App implements HelloController{
	@Override
	public String hello() {
		return "hello from spring cloud eureka client";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
