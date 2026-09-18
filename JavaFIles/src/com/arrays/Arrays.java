//Date:-18-09-226
//Class Program
//Write a Program to print the ages using arrays
package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		// Step-1:- Creation
		int[] ages;

		// Step-2:- Declaration
		ages = new int[3];

		// Step-3:- Initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;

		// Step-4:-Representation
		// We can represent arrays in 2 ways
		/*
		 1.By using for loop 
		 2.By using for each loop
		 */
		
		// 1.By Using For Loop
		System.out.println("By Using For Loop");
		System.out.println("------------------------------");
		for (int i = 0; i < ages.length; i++) {
			System.out.println("Ages is: " + ages[i]);
		}
		System.out.println("------------------------------");

		// 2.By Using For-Each Loop
		System.out.println("By Using For-Each Loop");
		System.out.println("------------------------------");
		for (int a : ages) {
			System.out.println("Ages is: " + a);
		}
		System.out.println("------------------------------");
	}
}
