//Date:-08-09-2026
//Class Experiment
//Write a Program to print Factors/Divisors of a Given Number
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		findFactors(n);
	}

	static void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
	}
}