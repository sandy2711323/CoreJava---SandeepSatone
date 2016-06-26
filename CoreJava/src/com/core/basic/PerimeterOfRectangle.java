package com.core.basic;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of the Rectangle :");
		double length = scan.nextDouble();
		System.out.println("Please enter the breadth of the Rectangle :");
		double breadth = scan.nextDouble();
		System.out.println("Perimeter of Rectangle is :" + ((2*length)+ (2*breadth)));
		System.out.println("( Approximate )Perimeter of Rectangle is :" + Math.floor(((2*length)+ (2*breadth))));
		scan.close();
	}

}
