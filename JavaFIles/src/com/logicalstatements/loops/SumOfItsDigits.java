//Date:-11-09-2026
//Class Experiment
//Write a Program to Print Sum Of Its Digits in a Program
package com.logicalstatements.loops;

public class SumOfItsDigits {
	static void sumOfDigits() {
		int sum=0;
		int n=123;
		int count=0;
		for(int i=0;i<n;n=n/10) {
			int r=n%10;
			sum=sum+r;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);	
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		sumOfDigits();
	}

}
