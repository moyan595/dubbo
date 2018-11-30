package com.moyan.dubbo.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.moyan.dubbo.bean.UserAddress;
import com.moyan.dubbo.service.OrderService;
import com.moyan.dubbo.service.UserService;
@Service
public class OrderServiceImpl implements OrderService{

	@Reference //消费服务
	private UserService userService;
	
	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("Invoke UserService Provider : " + userId);
		return userService.findList(userId);
	}

}
