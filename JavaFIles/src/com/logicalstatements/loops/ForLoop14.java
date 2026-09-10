//Date:-10-09-2026
//Class Experiment
//Write A Program to Print Fibonacci Series using for loop
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop14 {
	static void fibonacciSeries(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" "+n2);
		for(int i=0;i<=n;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Times You ant to print");
		int n=sc.nextInt();
		fibonacciSeries(n);
	}

}
