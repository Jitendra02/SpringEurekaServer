package com.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients("com.converter.service")
@SpringBootApplication
public class ConverterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterServiceApplication.class, args);
	}
}
