package com.employee.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.model.Employees;

public class MainClass {
	
	static Scanner sc = new Scanner(System.in);
	EmployeeDaoImpl obj = new EmployeeDaoImpl();
	static Employees emp = new Employees();
	
	static ApplicationContext context = new ClassPathXmlApplicationContext("com/employee/main/config.xml");
	static EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
	
	public static void InsertEmp()
	{
		System.out.print("enter employee name : ");
		String emp_name = sc.next();
		System.out.print("enter employee address : ");
		String emp_add = sc.next();
		System.out.print("enter employee email : ");
		String emp_mail = sc.next();
		
		emp.setEmpName(emp_name);
		emp.setEmpAddress(emp_add);
		emp.setEmpEmail(emp_mail);
		int row = empDao.addEmployee(emp);
		System.out.println(row+" row inserted");
	}
	
	public static void UpdateEmp()
	{
		System.out.print("enter employee id : ");
		int emp_id = sc.nextInt();
		System.out.print("enter employee name : ");
		String emp_name = sc.next();
		System.out.print("enter employee address : ");
		String emp_add = sc.next();
		System.out.print("enter employee email : ");
		String emp_mail = sc.next();
		
		emp.setEmpId(emp_id);
		emp.setEmpName(emp_name);
		emp.setEmpAddress(emp_add);
		emp.setEmpEmail(emp_mail);
		int row = empDao.updateEmployee(emp);
		System.out.println(row+" row updated");
	}
	
	public static void delEmp()
	{
		System.out.print("enter employee id : ");
		int emp_id = sc.nextInt();
		emp.setEmpId(emp_id);
		int row = empDao.deleteEmployee(emp);
		System.out.println(row+" row deleted");
	}
	
	public static void viewOneEmp()
	{
		System.out.print("enter employee id : ");
		int emp_id = sc.nextInt();
		emp.setEmpId(emp_id);
		Employees emp = empDao.viewSingleEmployee(emp_id);
		List<Employees> list = new ArrayList<Employees>();
		list.add(emp);
		for(Employees e:list)
		{
			System.out.println("emp_id : "+e.getEmpId());
			System.out.println("emp_name : "+e.getEmpName());
			System.out.println("emp_address : "+e.getEmpAddress());
			System.out.println("emp_mail : "+e.getEmpEmail());
		}
		
	}
	
	public static void ViewAllEmp()
	{
		List<Employees> list = empDao.viewAllEmployees();
		for(Employees e:list)
		{
			System.out.println("emp_id : "+e.getEmpId());
			System.out.println("emp_name : "+e.getEmpName());
			System.out.println("emp_address : "+e.getEmpAddress());
			System.out.println("emp_mail : "+e.getEmpEmail());
			System.out.println("=========================");
		}
	}
}
