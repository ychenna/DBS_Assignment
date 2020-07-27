package com.orderitemservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.orderitemservice.model.OrderItem;

@FeignClient( name="order-service", url="localhost:8081")
public interface OrderServiceProxy {
	
	// retrieve all Order Items
	@GetMapping("/order-service/ordered-items")
	public List<OrderItem> retrieveOrderItemsInfo();

}
