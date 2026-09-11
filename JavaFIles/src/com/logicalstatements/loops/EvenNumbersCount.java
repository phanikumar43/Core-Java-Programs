//Date:-11-09-2026
//Lab Experiment
/*
 Write a Java Program to find the even numbers count in a given number 
Ex:- 123466
Output :- even count is 4 
 */
package com.logicalstatements.loops;

import java.util.Scanner;

public class EvenNumbersCount {
static void evenCount(int n) {
	int count=0;
	for(;n>0;n=n/10) {
		int digit=n%10;
		if(digit%2==0) {
			count++;
		}
	}
	System.out.println("Your Count is: "+count);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		evenCount(n);
		sc.close();
	}

}
