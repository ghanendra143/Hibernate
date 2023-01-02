package com.pojo;

import java.util.List;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

@Transactional
public class EmpDao {
	private HibernateTemplate htemp;

	public HibernateTemplate getHtemp() {
		return htemp;
	}
	public void setHtemp(HibernateTemplate htemp) {
		this.htemp = htemp;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void InsertEmp(Employee emp)
	{
		System.out.print("enter emp_name :  ");
		String name = sc.next();
		System.out.print("enter emp_age : ");
		int age = sc.nextInt();
		System.out.print("enter emp_address : ");
		String address = sc.next();
		
		emp.setEmp_name(name);
		emp.setEmp_age(age);
		emp.setEmp_address(address);
		
		Integer row = (Integer) htemp.save(emp);
		System.out.println(row + " row inserted");
		 
	}

	public void UpdateEmp(Employee emp)
	{
		System.out.print("enter emp_id : ");
		int id = sc.nextInt();
		System.out.print("enter emp_name : ");
		String name = sc.next();
		System.out.print("enter emp_age : ");
		int age = sc.nextInt();
		System.out.print("enter emp_address : ");
		String address = sc.next();
		
		emp.setEmp_id(id);
		emp.setEmp_name(name);
		emp.setEmp_age(age);
		emp.setEmp_address(address);
		
		htemp.update(emp);
		System.out.println("data updated");
	}
	
	public void DelEmp()
	{
		System.out.print("enter emp_id : ");
		int id = sc.nextInt();
		Employee emp = htemp.get(Employee.class, id);
		htemp.delete(emp);
		System.out.println("employee deleted");
	}
	
	public void GetOneEmp()
	{
		System.out.print("enter emp_id : ");
		int id = sc.nextInt();
		Employee emp = htemp.get(Employee.class, id);
		System.out.println("emp id : "+emp.getEmp_id());
		System.out.println("emp name : "+emp.getEmp_name());
		System.out.println("emp age : "+emp.getEmp_age());
		System.out.println("emp address : "+emp.getEmp_address());
	}
	
	public void GetAllEmp()
	{
		List<Employee> emp = htemp.loadAll(Employee.class);
		for(Employee e:emp)
		{
			System.out.println("emp id : "+e.getEmp_id());
			System.out.println("emp name : "+e.getEmp_name());
			System.out.println("emp age : "+e.getEmp_age());
			System.out.println("emp address : "+e.getEmp_address());
			System.out.println("=========================");
		}
	}
}
