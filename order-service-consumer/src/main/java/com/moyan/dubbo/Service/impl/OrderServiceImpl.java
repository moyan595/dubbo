package com.moyan.dubbo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moyan.dubbo.bean.UserAddress;
import com.moyan.dubbo.service.OrderService;
import com.moyan.dubbo.service.UserService;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private UserService userService;
	
	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("调用UserService Provider" + userId);
		return userService.findList(userId);
	}

}
