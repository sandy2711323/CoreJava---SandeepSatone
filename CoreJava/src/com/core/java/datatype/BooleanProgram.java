/*
        Java boolean Example
        This Java Example shows how to declare and use Java primitive boolean variable
        inside a java class.
*/
package com.core.java.datatype;

import java.util.Scanner;

public class BooleanProgram {

	public static void main(String[] args) {
		System.out.println("Please enter value to compare with 10");
		Scanner scan = new Scanner(System.in);
		int num = (int) Math.rint(Double.parseDouble(scan.nextLine()));
		boolean a = true;
		boolean b = false;
		boolean c = (num > 2) ? true : false;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		scan.close();
	}

}
