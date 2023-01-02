package com.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.employee.model.Employees;

public class RowMapperImlp implements RowMapper<Employees> {

	public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employees emp = new Employees();
		emp.setEmpId(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setEmpAddress(rs.getString(3));
		emp.setEmpEmail(rs.getString(4));
		return emp;
	}
	
}
