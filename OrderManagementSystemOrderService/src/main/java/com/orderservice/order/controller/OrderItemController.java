package com.orderservice.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.order.exception.OrderItemNotFoundException;
import com.orderservice.order.model.OrderItem;
import com.orderservice.order.model.OrderItemService;

@RestController
@RequestMapping("/order-service")
public class OrderItemController {

	@Autowired
	OrderItemService orderItemService;
	
	
	// retrieve all Order Items
	@GetMapping("/ordered-items")
	public List<OrderItem> retrieveOrderItemsInfo() {
		return orderItemService.retrieveOrderItemsInfo();

	}
	
	// create OrderItem 
	@PostMapping("/order-item")
	private int createOrderItem(@RequestBody OrderItem orderItem) {
		orderItemService.createOrderItem(orderItem);
		return orderItem.getProductCode();
	}
	
	// retrieve specific product
	@GetMapping("/ordered-items/{productCode}")
	public OrderItem findSpecificOrderItem(@PathVariable int productCode) {
		OrderItem oItem = orderItemService.findSpecificOrderItem(productCode);

		if (oItem == null) { 
			throw new OrderItemNotFoundException("Product Code " + productCode);
		}
		return oItem;
	}

}
