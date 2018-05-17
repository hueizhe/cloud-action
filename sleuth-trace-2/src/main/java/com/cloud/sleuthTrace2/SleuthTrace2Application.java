package com.cloud.sleuthTrace2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SleuthTrace2Application {


	private final Logger logger = LoggerFactory.getLogger(SleuthTrace2Application.class);

	@GetMapping("/trace-2")
	public String trace(){
		logger.info("------------------<call    trace-2>-------------------");
		return "Trace-2";
	}

	public static void main(String[] args) {
		SpringApplication.run(SleuthTrace2Application.class, args);
	}
}
