package com.learning.impprograms;

public class Pyramid4 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}