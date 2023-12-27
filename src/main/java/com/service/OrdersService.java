package com.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Orders;
import com.repository.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	public String storeOdersDetails(Orders orders) 
	{
		Optional<Orders>op=ordersRepository.findById(orders.getOid());
		if(op.isPresent()) {
			return "Oder exsist " ;
		}else {
			LocalDate returnvalues=(LocalDate.now()).plusDays(7);
			orders.setOrder_date(LocalDate.now());
			orders.setDelivery_date(returnvalues);
			ordersRepository.save(orders);
			return "Add Orders ";
		}
	}

}