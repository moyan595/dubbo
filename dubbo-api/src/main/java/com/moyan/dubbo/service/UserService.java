package com.moyan.dubbo.service;

import java.util.List;

import com.moyan.dubbo.bean.UserAddress;

/**
 * 提供端
 * @author 莫言
 *
 */
public interface UserService {
	
	List<UserAddress> findList(String userId);

}
