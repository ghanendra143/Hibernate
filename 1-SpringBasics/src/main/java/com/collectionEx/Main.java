package com.collectionEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collectionEx/student.xml");
		Student st = (Student) context.getBean("stud");
//		System.out.println(st);
		System.out.println("name : "+st.getStud_name());
		System.out.println("subjects : "+st.getSubjects());
		System.out.println("phones : "+st.getPhones());
		System.out.println("courses : "+st.getCourses());

	}

}
