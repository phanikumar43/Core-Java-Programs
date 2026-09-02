//Date:-01-09-2026
//Lab Experiment
/*
 Find the maximum of 3 variables By using Ternary Operators
	int a=100;
	int b=200;
	int c=250;
 */
package com.operators;

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 250;
		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Max " + max + " Number");
	}
}