package com.app.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.book.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
