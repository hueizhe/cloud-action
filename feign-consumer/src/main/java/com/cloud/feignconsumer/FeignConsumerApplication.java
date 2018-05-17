package com.cloud.feignconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringCloudApplication
public class FeignConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);
	}
}
