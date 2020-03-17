package com.test;

public class FirstBean {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		
		System.out.println("Welcome to Spring+Maven :"+name);
	}
	

}
