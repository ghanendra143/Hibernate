package com.autowireByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	
	@Autowired
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

}
