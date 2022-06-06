//Write a program to print given pattern
/*
   54321
   5432
   543
   54
   5
*/
package com.patternexample;

public class NumberPattern2 {

	public static void main(String[] args) {
		int i, j;// Declaring variable
		for (i = 1; i <= 5; i++) {// For row
			for (j = 5; j >= i; j--) {// For column
				System.out.print(j + "");
			} // Internal loop
			System.out.println();// New line for next row
		} // External loop

	}

}
