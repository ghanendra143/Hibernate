package com.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ByAnnotations {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ByAnnotaions [name=" + name + "]";
	}

	public ByAnnotations(String name) {
		super();
		this.name = name;
	}

	public ByAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("init method called");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("destroy method called");
	}

}
