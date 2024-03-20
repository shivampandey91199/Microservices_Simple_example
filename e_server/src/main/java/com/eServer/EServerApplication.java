package com.eServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EServerApplication.class, args);
	}

}
