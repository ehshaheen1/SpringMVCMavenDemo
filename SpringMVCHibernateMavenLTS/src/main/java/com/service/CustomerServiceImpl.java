package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.CustomerDao;
import com.entity.Customer;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private CustomerDao customerDao;
  @Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}
@Override
@Transactional
public void saveCustomer(Customer customerSave) {
	// TODO Auto-generated method stub
	 customerDao.saveCustomer(customerSave);
	
}
@Override
@Transactional
public Customer updateCustomer(int custID) {
	// TODO Auto-generated method stub
	return customerDao.updateCustomer(custID);
}
@Override
@Transactional
public void deleteCustomer(int deleteID) {
	// TODO Auto-generated method stub
	 customerDao.deleteCustomer(deleteID);
}

}
