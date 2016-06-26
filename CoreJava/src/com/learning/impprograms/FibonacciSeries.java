package com.learning.impprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Please enter the length of series");
		Scanner scan = new Scanner(System.in);
        int length = (int)Math.rint(Double.parseDouble(scan.nextLine()));
        	System.out.println("Please number between 1 to 10");
        	if(length > 20){
        		System.out.println("Number Greater than 20 are u sure to continue ");
        		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		System.out.println("Your Series is below");
        	}
			long[] series = new long[length];
			series[0] = 0;
			series[1] = 1;

			for (int i = 2; i < series.length; i++) {
				series[i] = series[i - 1] + series[i - 2];
			}

			for (int i = 0; i < series.length; i++) {
				System.out.print(series[i]);
				System.out.print("\n");
			scan.close();
			
		}
		
		
	}

}
