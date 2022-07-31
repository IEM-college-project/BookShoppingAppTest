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

	@Override
	public Customer updateCustomerById(Long id, Customer customer) {
		Customer _customer=customerRepository.findById(id).orElse(null);
		if(_customer!=null)
			return customerRepository.save(customer);
		return null;
	}

}
