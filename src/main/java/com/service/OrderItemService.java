package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.OrderItem;
import com.repository.OrderItemRepository;

@Service
public class OrderItemService {
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	public String addOrderItem(OrderItem OI) {
		Optional<OrderItem>op=orderItemRepository.findById(OI.getOid());
		if(op.isPresent()) {
			return "Already Order Item is Present";
		}else {
			orderItemRepository.save(OI);
			return "OrderItem Stored Successfully";
		}
		
	}

}
