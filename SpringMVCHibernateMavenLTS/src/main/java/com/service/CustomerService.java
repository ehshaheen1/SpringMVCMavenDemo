package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();
    public void saveCustomer(Customer customerSave);
	public Customer updateCustomer(int custID);
	public void deleteCustomer(int deleteID);
}
