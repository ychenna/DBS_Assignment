package com.orderservice.order.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderItemNotFoundException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;
	
	public OrderItemNotFoundException(String message) {
		super(message);
	} 
}
