package com.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereoType/emp.xml");
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("emp name : "+emp.getEmp_name());
		System.out.println("emp projects : "+emp.getProjects());
		System.out.println("emp departments : "+emp.getDept());
		System.out.println("emp personal info : "+emp.getConnect());
		System.out.println("--------------------");
		System.out.println(emp);

	}

}
