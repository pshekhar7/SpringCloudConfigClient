package com.pshekhar.cloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.pshekhar.cloudconfigclient.*")
public class CloudconfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudconfigClientApplication.class, args);
	}

}
