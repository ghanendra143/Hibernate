package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/pojo/student.xml");
//		Student st = context.getBean("stud",Student.class);
//		System.out.println(st);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/pojo/employee.xml");
		Employee empl = (Employee) context.getBean("emp");
		System.out.println(empl);
	}

}
