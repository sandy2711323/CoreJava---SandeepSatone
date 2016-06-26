package com.core.basic;

import java.util.Scanner;

public class EvenOddChecker {

	public static void main(String[] args) {

		System.out.println("Please enter a number to check if it is odd or even :");
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		int num = (int) Math.rint(Double.parseDouble(number));
		// System.out.println(num);
		if (num % 2 == 0)
			System.out.println("Number " + num + " is even");
		else
			System.out.println("Number " + num + " is odd");
		scan.close();
	}

}
