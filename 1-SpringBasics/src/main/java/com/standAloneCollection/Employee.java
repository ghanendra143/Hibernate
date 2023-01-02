package com.standAloneCollection;

import java.util.*;

public class Employee {
	private String emp_name;
	private List<String> projects;
	private Map<Integer, String> dept;
	private Properties connect;
	
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public Map<Integer, String> getDept() {
		return dept;
	}
	public void setDept(Map<Integer, String> dept) {
		this.dept = dept;
	}
	public Properties getConnect() {
		return connect;
	}
	public void setConnect(Properties connect) {
		this.connect = connect;
	}
	
	public Employee(String emp_name, List<String> projects, Map<Integer, String> dept, Properties connect) {
		super();
		this.emp_name = emp_name;
		this.projects = projects;
		this.dept = dept;
		this.connect = connect;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", projects=" + projects + ", dept=" + dept + ", connect=" + connect
				+ "]";
	}

}
