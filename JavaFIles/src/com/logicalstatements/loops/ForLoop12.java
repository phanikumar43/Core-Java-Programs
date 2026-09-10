//Date:-10-09-2026
//Lab Experiment
//1. Write a Java program to display the multiplication table of given number 
package com.logicalstatements.loops;

import java.util.Scanner;

public class ForLoop12 {
		static void findMultiplication(int n,int n1) {
			for(int i=1;i<=n1;i++) {
				System.out.println(n+" * "+i+ " = "+(n*i));
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Multiplication Number: ");
		int n=sc.nextInt();
		
		System.out.println("Enter How Many Steps you want to print: ");
		int n1=sc.nextInt();
		
		findMultiplication(n,n1);
		sc.close();
	}

}
