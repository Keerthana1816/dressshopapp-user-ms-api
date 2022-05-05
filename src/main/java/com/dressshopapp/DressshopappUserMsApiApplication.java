package com.dressshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DressshopappUserMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DressshopappUserMsApiApplication.class, args);
	}

}
