package com.core.basic;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the Rectangle :");
		double length = scan.nextDouble();
		System.out.println("Please enter the breadth of the Rectangle :");
		double breadth = scan.nextDouble();
		System.out.println("Area of Rectangle is :"+(length*breadth));
		System.out.println("( Approximate )Area of Rectangle is :"+Math.floor(length*breadth));
		scan.close();
	}

}
