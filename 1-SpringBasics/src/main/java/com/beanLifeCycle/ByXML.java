package com.beanLifeCycle;

public class ByXML {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ByXML(int num) {
		super();
		this.num = num;
	}

	public ByXML() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ByXML [num=" + num + "]";
	}
	
	public void start()
	{
		System.out.println("init method called");
	}
	
	public void end()
	{
		System.out.println("destroy method called");
	}
}
