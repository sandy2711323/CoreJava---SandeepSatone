package com.core.java.breakstatement;

public class BreakInnerOuterLoop {

	public static void main(String[] args) {

		outer: for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.println(" i = " + i + " j = " + j);
				if (i == 3) {
					break outer;

				}

			}

		}
	}

}
