//Date:-09-09-2026
//Class Program
//Wirte a Program to print Factorial of the given number using for loops
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop10 {
	static int Findfact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int factorial=Findfact(n);
		System.out.println("Factorial Of a Number is: "+factorial);
		sc.close();
	}
}
