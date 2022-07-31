package com.app.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.book.entity.Order;
import com.app.book.repository.OrderRepository;

public class OrderInterfaceImpl implements OrderInterface {
	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrders() {

		return orderRepository.findAll();
	}

	@Override
	public Order saveOrders(Order order) {

		return orderRepository.save(order);

	}

}
