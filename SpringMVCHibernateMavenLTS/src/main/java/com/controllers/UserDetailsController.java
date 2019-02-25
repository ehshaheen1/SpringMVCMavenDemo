package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	

}
