package com.dao;

import java.util.List;

import com.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getAllCustomer();

	public void saveCustomer(Customer customerSave);
	public Customer updateCustomer(int custID);

	public void deleteCustomer(int deleteID);
	

}
