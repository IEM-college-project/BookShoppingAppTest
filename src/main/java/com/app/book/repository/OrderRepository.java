package com.app.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.book.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
