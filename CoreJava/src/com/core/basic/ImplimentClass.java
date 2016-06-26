package com.core.basic;

public class ImplimentClass implements InterfaceExample{

	@Override
	public void sayHello() {
		System.out.println("Say Hello... !!!!");
	}

	public static void main(String[]args){
		ImplimentClass obj = new ImplimentClass();
		obj.sayHello();
	}
}
