package com.pojo;

public class Employee {
	private int emp_id;
	private String emp_name;
	private Address add;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public Employee(int emp_id, String emp_name, Address add) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.add = add;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", add=" + add + "]";
	}
	
	

}
