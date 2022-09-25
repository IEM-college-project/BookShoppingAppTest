package com.app.book.service;

import java.util.List;

import com.app.book.entity.Customer;

public interface CustomerInterface {
	public List<Customer> getAllCustomers();

	public Customer getACustomerById(Long id);

	public Customer registerCustomers(Customer customer);

	public void deleteCustomerbyId(Long id);

	public Customer updateCustomerById(Long id, Customer customer);

	Customer saveCustomers(Customer customer);

}
