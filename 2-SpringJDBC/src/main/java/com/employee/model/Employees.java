package com.employee.model;

public class Employees {
	private int empId;
	private String empName;
	private String empAddress;
	private String empEmail;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empEmail="
				+ empEmail + "]";
	}
	
	public Employees(int empId, String empName, String empAddress, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
	}
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
}
