package com.app.book.service;

import java.util.List;

import com.app.book.entity.Order;

public interface OrderInterface {
	public List<Order> getAllOrders();

	public Order saveOrders(Order order);

}
