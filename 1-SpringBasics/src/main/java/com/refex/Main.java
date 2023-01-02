package com.refex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/refex/ref.xml");
		Question ques = (Question) context.getBean("Question");
		System.out.println(ques);

	}

}
