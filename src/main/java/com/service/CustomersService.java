package com.service;

import java.util.Optional;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customers;
import com.repository.CustomerRepository;
@Service
public class CustomersService {
	
	@Autowired
	CustomerRepository customerRepository;

	// Customer Registration
	public String RegisterCustomers(Customers c)
	{
		Optional<Customers> op=customerRepository.findById(c.getCid());
		if(op.isPresent()) {
			
			return "Cutomer allredy exist";
		}else {
			customerRepository.save(c);
			return "Cutomer Register  Sucessfully";
		}
	}
	

	
	public String LoginCustomer (Customers c) {
		Optional<Customers> op = customerRepository.findEmailIid(c.getEmail());
		if(op.isPresent()) {
			Customers ll=op.get();
			if(ll.getPassword().equals(c.getPassword()))
			{
				return "Login Sucessfully Done ";
			}
			else
			{
				return "Login Id or Password is Worng";
			}
		}
			else
			{
				return "Account dose not exists";
			}
		}
		
	}
	
	

