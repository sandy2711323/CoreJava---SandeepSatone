package com.core.basic;
//Not working need to check the logic
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Please enter number to reverse");
		Scanner scan = new Scanner(System.in);
		long number = (long)Math.ceil(Double.parseDouble(scan.nextLine()));
		long reversenumber = 0;
		long temp = 0;
       while(number>0){
    	   temp = temp%10;
    	   reversenumber=reversenumber*10+temp;
    	   number=number/10;
       }
       System.out.println("Reverse of number is "+reversenumber);
       scan.close();
	}

}
