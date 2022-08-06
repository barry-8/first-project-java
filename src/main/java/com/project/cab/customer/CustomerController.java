package com.project.cab.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepo repo;

	@RequestMapping("/customer-list")
	public Iterable<Customer> getAllCustomer() {
		return repo.findAll();
	}

	@RequestMapping("/find-customer/{emailId}")
	public Customer findCustomer(@PathVariable("emailId") String emailId, Model model) {
		Customer c = repo.findById(emailId).get();
		return c;
	}

	@PostMapping("/add-customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return repo.save(customer);
	}

	@DeleteMapping("/delete-customer/emailId")
	public String deleteCustomer(@PathVariable String emailId) {
		repo.deleteById(emailId);
		return "Customer Deleted Succesfully";
	}
}