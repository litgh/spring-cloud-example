package com.example.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lee
 * @date 2017/10/09
 */
@FeignClient(value = "SPRING-CLOUD-EUREKA-CLIENT")
public interface HelloController {
	@RequestMapping("/")
	String hello();
}
