package com.app.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.book.entity.Customer;
import com.app.book.repository.CustomerRepository;

public class CustomerInterfaceImpl implements CustomerInterface {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {

		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomers(Customer customer) {

		return customerRepository.save(customer);
	}

}
