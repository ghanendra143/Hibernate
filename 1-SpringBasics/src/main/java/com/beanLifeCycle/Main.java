package com.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// this is for xml type 
//		AbstractApplicationContext context = new 
//			ClassPathXmlApplicationContext("com/beanLifeCycle/lifecycle.xml");
//		ByXML obj = (ByXML) context.getBean("cycle");
//		System.out.println(obj);
//		context.registerShutdownHook();
		
		// this is for interface type
//		AbstractApplicationContext context = new 
//				ClassPathXmlApplicationContext("com/beanLifeCycle/lifecycle.xml");
//			ByInterface obj = (ByInterface) context.getBean("inter");
//			System.out.println(obj);
//			context.registerShutdownHook();
		
		// this is for annotation type
		AbstractApplicationContext context = new 
				ClassPathXmlApplicationContext("com/beanLifeCycle/lifecycle.xml");
			ByAnnotations obj = (ByAnnotations) context.getBean("anno");
			System.out.println(obj);
			context.registerShutdownHook();

	}

}
