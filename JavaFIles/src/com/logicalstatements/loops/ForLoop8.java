//Date:-09-08-2026
//Lab Experiment
//2 . Write a java Program to Print the 1 to 100 numbers without using any Loops
package com.logicalstatements.loops;

public class ForLoop8 {
	static void PrintNumber(int n) {
		if (n <= 100) {
			System.out.println("Number is: " + n);
			PrintNumber(n + 1);
		}
	}
	public static void main(String[] args) {
		PrintNumber(1);
	}

}
