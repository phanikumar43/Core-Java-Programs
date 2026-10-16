package com.starpatterns;

/*
******
*****
****
***
**
*
 */
public class PatternsDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Main Method Ended");
	}
}