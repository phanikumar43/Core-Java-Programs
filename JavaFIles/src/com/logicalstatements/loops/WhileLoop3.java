//Date:-15-09-2026
//Class Experiment
//Write a Program to print sum of its digits using while loop
package com.logicalstatements.loops;

import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int sum=digitsSum(n);
		System.out.println("Sum of its digits are: "+sum);
		int count=digitsCount(n);
		System.out.println("Count of its digits are: "+count);
		sc.close();
	}
	static int digitsSum(int n) {
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}
	static int digitsCount(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}
}