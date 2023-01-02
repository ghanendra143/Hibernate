package com.autowireByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new 
			ClassPathXmlApplicationContext("com/autowireByAnnotation/autowire.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);

	}

}
