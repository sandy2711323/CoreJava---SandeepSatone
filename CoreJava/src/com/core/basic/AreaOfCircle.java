package com.core.basic;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle :");
		double radius = scan.nextDouble();
		System.out.println("Area of circle is :"+(Math.PI*radius*radius));
		System.out.println("( Approximate )Area of circle is :"+Math.floor(Math.PI*radius*radius));
		scan.close();
		
	}

}
