package com.pojo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.pojo.Money.money())")
	public void beforeAspect()
	{
		System.out.println("transaction started...\n");
	}

	@After("execution(* com.pojo.Money.money())")
	public void afterAspect()
	{
		System.out.println("\ntransaction ended...");
	}
}
