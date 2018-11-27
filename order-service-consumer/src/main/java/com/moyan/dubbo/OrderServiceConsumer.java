package com.moyan.dubbo;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moyan.dubbo.bean.UserAddress;
import com.moyan.dubbo.service.OrderService;

/**
 * 消费方
 * @author 莫言
 *
 */
public class OrderServiceConsumer {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();

		//调用服务
		OrderService orderService = context.getBean(OrderService.class);
		List<UserAddress> userAddressesList = orderService.initOrder("1001");
		for(UserAddress userAddress : userAddressesList) {
			System.out.println(userAddress.getAddress());
		}
		System.in.read();

	}

}
