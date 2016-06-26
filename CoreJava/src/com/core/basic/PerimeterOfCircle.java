package com.core.basic;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle :");
		double radius = scan.nextDouble();
		System.out.println("Perimeter of circle is :"+(Math.PI*radius*2));
		System.out.println("( Approximate )Perimeter of circle is :"+Math.floor(Math.PI*radius*2));
		scan.close();
	}

}
