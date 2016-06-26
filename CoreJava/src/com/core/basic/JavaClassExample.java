package com.core.basic;

public class JavaClassExample {
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		
		JavaClassExample obj = new JavaClassExample();
		obj.setName("sandeep");
		System.out.println("Hello "+obj.getName());

	}

}
