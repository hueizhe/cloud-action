package com.cloud.sleuthTrace1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@EnableDiscoveryClient
@SpringBootApplication
public class SleuthTrace1Application {

	private final Logger logger = LoggerFactory.getLogger(SleuthTrace1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SleuthTrace1Application.class, args);
	}
}
