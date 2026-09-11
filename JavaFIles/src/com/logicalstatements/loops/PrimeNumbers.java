//Date:-11-09-2026
//Class Experiment
//Write a Program to print Prime Numbers Program
package com.logicalstatements.loops;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean primeNumber(int n) {
		boolean status = true;
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many numbers You Want to proceed...");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(primeNumber(i)) {
				System.out.println(i);
			}
		}
	}
}
