package com.cloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EurekaServerApplication.class, args);

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		int i =0;
		for(String beanName : beanNames){
			System.out.println("------ "+i+" -----"+beanName);
			i++;
		}
	}
}
