package com.customer;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String phone;
	private int age;
	private String address;
	private String userName;
	private String password;
	
	public Customer(int id, String name, String email, String phone, int age, String address, String userName,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
}