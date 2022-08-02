package com.app.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.book.entity.Customer;
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
	public Order updateOrderById(Long id, Order order) {
		Order order2=orderRepository.findById(id).orElse(null);
		if(order2!=null)
			return orderRepository.save(order);
		return null;
	}

}
