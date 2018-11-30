package com.moyan.dubbo.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.dubbo.config.annotation.Service;
import com.moyan.dubbo.bean.UserAddress;
import com.moyan.dubbo.service.UserService;
@Service//暴露服务
public class UserServiceImpl implements UserService{

	@Override
	public List<UserAddress> findList(String userId) {
		Map<String, List<UserAddress>> map = new HashMap<>();
		map.put("1001", Arrays.asList(new UserAddress(1,"Tom","1248416498","1001","深圳福田"),
									  new UserAddress(2,"je","1248485658","1002","深圳宝安"),
									  new UserAddress(3,"Tm","1248548","1003","深圳龙华"),
									  new UserAddress(4,"om","1248416498","1004","深圳龙岗")
									));
		
		return map.get(userId);
	}

}
