package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRestClientApplication.class, args);
	}
@Bean
public RestTemplate restTemplate() {
	return new RestTemplate();
}
}
