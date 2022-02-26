package com.menu.microservice.menu_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MenuMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuMicroserviceApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
   