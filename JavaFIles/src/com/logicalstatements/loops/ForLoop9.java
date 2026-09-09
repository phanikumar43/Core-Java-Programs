//Date:-09-09-2026
//Class Program
//Write a program to print Math Table using for loop
//We can print a math table on a main method and we can print on a function call
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop9 {
	static void findMath(int n1, int n2) {
		for (int i = 1; i <= n2; i++) {
			System.out.println(n1 + " * " + i + " = " + (n1 * i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n1 = sc.nextInt();

		System.out.println("Enter Upto Which Steps You Want to Proceed");
		int n2 = sc.nextInt();

		findMath(n1, n2);
		/*
		 * for(int i=1;i<=n2;i++) {
		 *  System.out.println(n1+ " * "+i+" = "+(n1*i)); 
		 *  }
		 */
		sc.close();

	}
}
