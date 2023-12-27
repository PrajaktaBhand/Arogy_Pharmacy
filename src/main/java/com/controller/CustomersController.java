package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bean.Customers;
import com.service.CustomersService;

@RestController
public class CustomersController {
	
	
	@Autowired
	CustomersService customersService;
	
	    //http://localhost:8080/RegisterCustomers
		@PostMapping(value="RegisterCustomers",consumes=MediaType.APPLICATION_JSON_VALUE)
		public String RegisterCustomers(@RequestBody Customers c)
		{
			return customersService.RegisterCustomers(c);
		}
		
	    //http://localhost:8080/LoginCustomer
		@PostMapping(value="LoginCustomer",consumes=MediaType.APPLICATION_JSON_VALUE)
		public String LoginCustomer(@RequestBody Customers c)
		{
			return customersService.LoginCustomer(c);
		}		
		
}
