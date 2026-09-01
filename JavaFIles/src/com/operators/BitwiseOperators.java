//01-09-2026
//Lab Experiment
//Find the given number is even or not using Bitwise Operator
package com.operators;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		if ((num & 1) == 0) {
			System.out.println("The Number " + num + " is even");
		} else {
			System.out.println("The Number " + num + " is odd");
		}
		sc.close();
	}

}
