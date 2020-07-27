package com.orderitemservice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderitemservice.model.OrderDummyModel;
import com.orderitemservice.model.OrderItem;
import com.orderitemservice.service.OrderServiceProxy;

@RestController
@RequestMapping("/order-item-service")
public class OrderItemServiceController {

	@Autowired
	OrderServiceProxy proxy;
	
	
	@GetMapping("/allOrderItems")
	public OrderDummyModel getAllOrderItems(){
		List<OrderItem> orderItems =  proxy.retrieveOrderItemsInfo();
		OrderDummyModel model = new OrderDummyModel();
		model.setId(10);
		model.setCustomerName("Chenna");
		model.setShippingAddress("Hyderabad");
		model.setOrderDate(new Date());
		model.setItems(orderItems);
		
		return model;
		
	}
	
}
