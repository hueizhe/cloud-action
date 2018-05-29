package com.cloud.cloudbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@Configurable
@EnableAdminServer
@SpringCloudApplication
@EnableAutoConfiguration
public class CloudBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudBootAdminApplication.class, args);
	}
}
