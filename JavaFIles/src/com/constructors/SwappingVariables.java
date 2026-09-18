//Date:-01-09-2026
//Lab Experiment
/*
Java :- 

1. Write a Java Program to Swap two variables data using Arithmetic operators and using Temporary Variable
Ex:- a=10,
     b= 20

Output :- 
a=20,
b= 10

2. Write a Java Program to Swap the two Variables values Using BitWise Operators
*/
package com.constructors;

public class SwappingVariables {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before Swapping: ");
		System.out.println("A is: " + a);
		System.out.println("B is: " + b);

		// Swapping can done by using Arithmetic Operators
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Swapping By Arithmetic Operators");
		System.out.println("After Swapping: ");
		System.out.println("A is: " + a);
		System.out.println("B is: " + b);

		/*
		 * //Swapping Can be Done by Bitwise Operators int temp=a; a=b; b=temp;
		 * 
		 * System.out.println("Swapping By Temporary Operators");
		 * System.out.println("After Swapping: "); System.out.println("A is: "+a);
		 * System.out.println("B is: "+b);
		 */
		
		System.out.println("Before Swapping: ");
		System.out.println("A is: " + a);
		System.out.println("B is: " + b);

		// Swapping can done by using XOR Operators
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("Swapping By Arithmetic Operators");
		System.out.println("After Swapping: ");
		System.out.println("A is: " + a);
		System.out.println("B is: " + b);
	}
	
}
