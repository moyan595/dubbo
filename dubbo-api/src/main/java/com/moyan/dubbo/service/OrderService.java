package com.moyan.dubbo.service;

import java.util.List;

import com.moyan.dubbo.bean.UserAddress;

/**
 *  消费端
 * @author 莫言
 *
 */
public interface OrderService {
	List<UserAddress> initOrder(String userId);
}
