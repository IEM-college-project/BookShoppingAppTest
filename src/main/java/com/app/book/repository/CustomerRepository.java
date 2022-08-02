package com.app.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.book.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
