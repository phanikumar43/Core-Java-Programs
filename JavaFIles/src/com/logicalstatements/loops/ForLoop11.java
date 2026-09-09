//Date:-09-09-2026
//Class Program
//Wirte a Program to print Factorial of the given number using Recursion
//Recursion means calling a method in a same method is called recursion
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop11 {

 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		int fact=factorial(n);
		System.out.println("Factorial of Number is: "+fact);
		sc.close();
	}
static int factorial(int n) {
	if(n==1 || n==0) {
		return 1;
	}
	return n*factorial(n-1);
}

}
