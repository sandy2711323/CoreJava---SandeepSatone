package com.core.java.breakstatement;

public class BreakProgram {

	public static void main(String[] args) {

		int j = 0;
		for (int i = 0; i < 10; i++) {
			j++;
			System.out.println("i = "+i+" j = "+j);
			if(i==5){
				System.out.println("j==i");
				break;//When i==5 it comes out of loop
			}
			
		}
	}

}
