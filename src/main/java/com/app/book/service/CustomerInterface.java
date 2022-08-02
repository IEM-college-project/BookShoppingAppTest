package com.app.book.service;

import java.util.List;

import com.app.book.entity.Customer;

public interface CustomerInterface {
	public List<Customer> getAllCustomers();

	public Customer saveCustomers(Customer customer);
    public Customer updateCustomerById(Long id, Customer customer);
    

}
