package com.core.basic;

import java.util.Arrays;
import java.util.Scanner;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int length =(int)Math.rint(Double.parseDouble(scan.nextLine()));
		System.out.println("length of array is :"+length);
		int [] array = new int[length];
		for (int j = 0; j < array.length; j++) {
			System.out.println("please enter the value for array["+j+"]");
			array[j]=(int)Math.rint(Double.parseDouble(scan.nextLine()));
			
		}
		System.out.println("Your array is sorting ");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		Arrays.sort(array);
		System.out.println("\nYour Sorted Array is :");
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t"+array[i]);
		}
		System.out.println("\nSmallest in the array is :"+array[0]);
		System.out.println("\nlargest in the array is :"+array[length-1]);
		scan.close();
		

	}

}
