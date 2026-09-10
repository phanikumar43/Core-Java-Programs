//Date:-10-09-2026
//Class Experiment
//Wirte a Program to Swap 2 numbers  using XOR Operator
package com.logicalstatements.loops;

public class ForLoop17 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("A Value is: " + a);
		System.out.println("B Value is: " + b);
	}

}
