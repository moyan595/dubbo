package com.moyan.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 提供方.
 * @author 莫言
 *
 */
public class UserServiceProvider {
	
	public static void main(String [] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		context.start();
		System.in.read();
	}

}
