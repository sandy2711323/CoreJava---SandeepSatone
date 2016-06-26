package com.core.basic;
//This is difficult practise this one Understand logic not working the logic in program
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Please enter the number u want to find factorial for : ");
		Scanner scan = new Scanner(System.in);
		int number = (int)Math.rint(Double.parseDouble(scan.nextLine()));
		System.out.println("Your Number is "+number);
		 int factorial = number;
         
         for(int i =(number - 1); i > 1; i--)
         {
                 factorial = factorial * i;
         }
		System.out.println("Factorial for your number is "+factorial);
		scan.close();

	}

}
