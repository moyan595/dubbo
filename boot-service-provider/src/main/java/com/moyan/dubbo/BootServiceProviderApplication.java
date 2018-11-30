package com.moyan.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


@EnableDubbo //开启dubbo注解支持
@SpringBootApplication
public class BootServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootServiceProviderApplication.class, args);
	}
}
