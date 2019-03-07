package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Customer;
import com.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class UserDetailsController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value ="/list")
	public String listCustomer(Model model)
	{
	  List<Customer> theCustomer=customerService.getAllCustomer();
		model.addAttribute("customers", theCustomer);
		return "list-customers";

		
	}
	@RequestMapping(value="/showFormForAdd")
	public String showFormForAdd(Model mdel)
	{
		Customer customer= new Customer();
		mdel.addAttribute("cust", customer);
		
		return "customer-form";
	}
	
	@RequestMapping(value="/saveCustomer")
	public String saveCustomer(@ModelAttribute("cust") Customer customerSave)
	{
		customerService.saveCustomer(customerSave);
		return "redirect:/customer/list";
	}
	
	@RequestMapping(value="/updateCustomer")
	public String updateCustomer(@RequestParam("customerId") int custID, Model mdl)
	{
		
		Customer customerUpdate=customerService.updateCustomer(custID);
		mdl.addAttribute("cust", customerUpdate);
		
		return "customer-form";
		
		
		
	}
	
	
	@RequestMapping(value="/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerIdD") int deleteID)
	{
		customerService.deleteCustomer(deleteID);
		return "redirect:/customer/list";
	}
	
	
	
	
	
	
	
	
	

}
