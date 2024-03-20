package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

	 private Long userId;
	 private String name;
	 private String phone;
	 
	 List<Contact> Contacts=new ArrayList<>();
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public User(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		Contacts = contacts;
	}
	public List<Contact> getContacts() {
		return Contacts;
	}
	public void setContacts(List contacts2) {
		Contacts = contacts2;
	}
	public User(Long userId, String name, String phone) {
		
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

}
