package com.orderservice.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.order.model.OrderItem;

@Repository
public interface OrderRepository extends CrudRepository<OrderItem, Integer>   {

}
