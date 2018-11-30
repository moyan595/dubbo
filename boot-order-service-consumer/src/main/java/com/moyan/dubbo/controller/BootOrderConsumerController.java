package com.moyan.dubbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moyan.dubbo.bean.UserAddress;
import com.moyan.dubbo.service.OrderService;



@RequestMapping("/order")
@RestController
public class BootOrderConsumerController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/initOrder/{userId}")
	public List<UserAddress> initOrder(@PathVariable String userId) {
			return orderService.initOrder(userId);
	}

}
