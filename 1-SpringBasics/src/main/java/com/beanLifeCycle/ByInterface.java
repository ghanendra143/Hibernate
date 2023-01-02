package com.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ByInterface implements InitializingBean,DisposableBean{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ByInterface [name=" + name + "]";
	}

	public ByInterface() {
		super();
	}

	public ByInterface(String name) {
		super();
		this.name = name;
	}

	public void destroy() throws Exception {
		System.out.println("this is destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("this is init method");		
	}
	
}
