package com.pojo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pojo/emp.xml");
		
		JdbcTemplate jdbctemp = (JdbcTemplate) context.getBean("jdbcTemp");
		
		// for inserting values in the db
		String insertQuery = "insert into emp values(?,?)";
		int row = jdbctemp.update(insertQuery, 4,"raj");
		System.out.println(row+" row inserted");
		
		// for updating values
		String updateQuery = "update emp set emp_name =? where emp_id=?";
		int rowu = jdbctemp.update(updateQuery, "ghanendra",1);
		System.out.println(rowu+" row updated");
		
		// for deleting values
		String deleteQuery = "delete from emp where emp_id=?";
		int rowd = jdbctemp.update(deleteQuery,4);
		System.out.println(rowd+" row deleted");  

		// fetching single row data from db
		String getQuery = "select * from emp where emp_id=?";
		RowMapper<Emp> rowmapper = new RowMapperImpl();
		Emp emp = jdbctemp.queryForObject(getQuery, rowmapper, 2);
		System.out.println(emp);
		
		// fetching all rows from db
		String getAllQuery = "select * from emp";
		RowMapper<Emp> rowmapper1 = new RowMapperImpl();
		List<Emp> emp_list = (List<Emp>) jdbctemp.query(getAllQuery, rowmapper1);
		System.out.println(emp_list);
				
		for(Emp e:emp_list)
		{
			System.out.println(e);
		}
		
//		for (Iterator iterator = emp_list.iterator(); iterator.hasNext();) {
//		Emp emp = (Emp) iterator.next();
//		System.out.println(emp);
//		}
	}
}
