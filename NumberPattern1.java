//Program to print given pattern
/*
    1
    12    
    123
    1234
    12345
*/
package com.patternexample;

public class NumberPattern1 {

	public static void main(String[] args) {
		int i, j;// Declaring variable
		for (i = 1; i <= 5; i++) {// For row
			for (j = 1; j <= i; j++) {// For column
				System.out.print(j + "");
			} // Internal loop
			System.out.println();// New line for next row
		} // External loop

	}

}
