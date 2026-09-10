//Date:-10-09-2026
//Class Experiment
//Wirte a Program to Swap 2 numbers using temporary variable
package com.logicalstatements.loops;

public class ForLoop15 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("A Value is: " + a);
		System.out.println("B Value is: " + b);
	}

}
