package com.learning.impprograms;

public class AverageOfArray {

	public static void main(String[] args) {

		int[] array = new int[] {1,2,3,4,5,6,7,8,9 ,0};
		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			// System.out.print(array[i]);
			sum = sum + array[i];
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average of array " + (double)(sum / array.length));

	}

}
