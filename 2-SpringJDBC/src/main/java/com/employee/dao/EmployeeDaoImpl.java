package com.employee.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.employee.model.Employees;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate temp;
	
	public JdbcTemplate getTemp() {
		return temp;
	}
	
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	public int addEmployee(Employees emp) {
		String insertQuery = "insert into Employee values(?,?,?)";
		int row = temp.update(insertQuery,emp.getEmpName(),emp.getEmpAddress(),emp.getEmpEmail());
		return row;
	}

	public int updateEmployee(Employees emp) {
		String updateQuery = "update Employee set empName=?,empAddress=?,empEmail=? where empId=?";
		int row = temp.update(updateQuery,emp.getEmpName(),emp.getEmpAddress(),emp.getEmpEmail(),emp.getEmpId());
		return row;
	}

	public int deleteEmployee(Employees emp) {
		String deleteQuery = "delete from Employee where empId=?";
		int row = temp.update(deleteQuery,emp.getEmpId());
		return row;
	}
	
	public Employees viewSingleEmployee(int empId) {
		String viewOne = "select * from Employee where empId=?";
		RowMapper<Employees> rm = new RowMapperImlp();
		Employees emp = temp.queryForObject(viewOne,rm,empId);
		return emp;
	}
	
	public List<Employees> viewAllEmployees() {
		String viewAll = "select * from Employee";
		List<Employees> list = temp.query(viewAll, new RowMapperImlp());
		return list;
	}

}
