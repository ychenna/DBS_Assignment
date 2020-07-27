package com.orderservice.order.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.orderservice.order.repository.OrderRepository;

@Component
public class OrderItemService {

	@Autowired
	OrderRepository repository;
	
	// retrieve all the OrderItems
	public List<OrderItem> retrieveOrderItemsInfo() {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		repository.findAll().forEach(orderItem -> orderItems.add(orderItem));

		return orderItems;
	}
	
	//create Order Item and save into H2 DB
	public void createOrderItem(OrderItem orderItem)   
	{  
		repository.save(orderItem);  
	} 
	
	//retrieve specific OrderItem
	@GetMapping
	public OrderItem findSpecificOrderItem(int productCode) {
		return repository.findById(productCode).get();
	}

}
