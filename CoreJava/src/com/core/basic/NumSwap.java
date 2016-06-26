package com.core.basic;

//This is without using 3rd variable Practise this too
public class NumSwap {

	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		System.out.println("Before a " + a + " b " + b);
		a = a + b;// 4
		b = a - b;// 4-1=3
		a = a - b;// 4-3=1
		System.out.println("After a " + a + " b " + b);
	}

}
