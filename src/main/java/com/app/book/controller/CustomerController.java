package com.app.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.book.entity.Customer;
import com.app.book.service.CustomerInterface;

@RestController
@RequestMapping("/customer-api")
public class CustomerController {

	@Autowired
	CustomerInterface customerInterface;

	@GetMapping("/getACustomer/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		Customer customer = customerInterface.getACustomerById(id);
		return ResponseEntity.ok(customer);
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerInterface.getAllCustomers();
	}

	@GetMapping("/registerCustomer")
	public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer) {
		customerInterface.registerCustomers(customer);
		return ResponseEntity.ok(customer);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public ResponseEntity<?> deleteCustomerbyId(@PathVariable Long id) {
		customerInterface.deleteCustomerbyId(id);
		return new ResponseEntity<>("Customer Deleted", HttpStatus.OK);
	}

	@PutMapping("/updateCustomer/{id}")
	public ResponseEntity<Customer> updateCustomerById(@PathVariable Long id, @RequestBody Customer customer) {
		Customer updateCustomer = customerInterface.updateCustomerById(id, customer);
		return ResponseEntity.ok(updateCustomer);
	}

}
