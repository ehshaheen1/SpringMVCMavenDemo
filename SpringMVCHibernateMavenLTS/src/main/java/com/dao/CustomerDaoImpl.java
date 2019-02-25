package com.dao;

import java.util.List;
import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Customer> getAllCustomer() {
		Session currentSession= sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = currentSession.createQuery("from Customer",Customer.class);
		
		List <Customer> listCustomer = theQuery.getResultList();
		
		return listCustomer;
	}
	@Override
	public void saveCustomer(Customer customerSave) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(customerSave);
		
	}

}
