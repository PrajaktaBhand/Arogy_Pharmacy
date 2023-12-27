package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bean.OrderItem;
import com.bean.Orders;
import com.service.OrderItemService;
import com.service.OrdersService;

@RequestMapping("admin")
@RestController
public class AdminController {
	@Autowired
	OrdersService orderService;
	
	@Autowired
	OrderItemService orderItemService;
	

			//http://localhost:8080/admin/addOrderItem
			@PostMapping(value="addOrderItem",consumes=MediaType.APPLICATION_JSON_VALUE)
			public String addOrderItem(@RequestBody  OrderItem OI)
			{
				return orderItemService.addOrderItem(OI);
			}
			
			//http://localhost:8080/admin/storeOdersDetails
			@PostMapping(value="storeOdersDetails",consumes=MediaType.APPLICATION_JSON_VALUE)
			public String storeOdersDetails(@RequestBody Orders orders) {
				return orderService.storeOdersDetails(orders);
			}
			
}
