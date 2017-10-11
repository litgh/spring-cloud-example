package com.example;

import com.example.api.HelloController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@RestController
public class App {
	@Autowired
	HelloController controller;

	@RequestMapping("/")
	public String hello() {
		return controller.hello();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
