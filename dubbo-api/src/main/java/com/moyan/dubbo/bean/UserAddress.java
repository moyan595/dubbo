package com.moyan.dubbo.bean;

import java.io.Serializable;

public class UserAddress implements Serializable{
	private Integer id;
	private String name;
	private String phone;
	private String userId;
	private String address;
	public UserAddress(Integer id, String name, String phone, String userId, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.userId = userId;
		this.address = address;
	}
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}