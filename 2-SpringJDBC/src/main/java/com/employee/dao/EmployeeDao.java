package com.employee.dao;

import java.util.List;

import com.employee.model.Employees;

public interface EmployeeDao {
	// add employee
	public int addEmployee(Employees emp);
	
	// update employee
	public int updateEmployee(Employees emp);
	
	// delete employee
	public int deleteEmployee(Employees emp);
	
	// view single employee
	public Employees viewSingleEmployee(int empId);
	
	// view all employees
	public List<Employees> viewAllEmployees();
	
}
