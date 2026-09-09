//Date:-08-09-2026
//Class Experiment
//Find The Maximum Factor of a given number
//Write a Program to find the given number is perfect or not
//Find the second maximum perfect number
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop4 {
	static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		if (isPerfect(n)) {
			System.out.println("Your Given Number is Perfect");
		} else {
			System.out.println("Your Given Number is Not Perfect");
		}
		sc.close();
	}
}
