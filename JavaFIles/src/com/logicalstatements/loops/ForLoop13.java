//Date:-10-09-2026
//Lab Experiment
//2.write a Java program to find the given number is prime number or not .
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop13 {
	static void primeCalculation(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("It is a Prime Number");
			}
			else {
				System.out.println("It is Not a Prime Number");
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to print: ");
		int n=sc.nextInt();
		primeCalculation(n);
		sc.close();
	}

}
