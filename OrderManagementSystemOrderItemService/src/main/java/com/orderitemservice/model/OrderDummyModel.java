package com.orderitemservice.model;

import java.util.Date;
import java.util.List;

public class OrderDummyModel {
	
	
	private int id;	
	
	private String customerName;	
	
	private Date orderDate;	
	
	private String shippingAddress;		
	
	private long total;	
	private List<OrderItem> items;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public OrderDummyModel(int id, String customerName, Date orderDate, String shippingAddress, long total,
			List<OrderItem> items) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.total = total;
		this.items = items;
	}
	public OrderDummyModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	}
