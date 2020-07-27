package com.orderservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderManagementSystemOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagementSystemOrderServiceApplication.class, args);
	}

}
