package com.RevisionClasses;

// No Return Type + With Parameters
//WAP to calculating values based on your input..?
//Arithmetic Operators
// + (Addition) --> Sum
// - (Difference) --> Product
// * (Multiplication) --> Product
// / (Division) --> Quotient
// % (Modulus Division) --> Remainder

// 98/5 --> 19 (Q)
// 98%5 --> 3 (R)
// 1/10 --> 1 --> 0
public class TypesOfMethodsDemo2 {
	static void addition(int a, int b) { // a,b are parameters
		// String + anything is String
		// BODMAS -->
		System.out.println("Addition of two Numbers: " + (a + b));
	}

	static void subtraction(int a, int b) {
		System.out.println("Subtraction of two Numbers:" + (a - b));
	}

	static void modulus(int a, int b) {
		System.out.println("Remainder of two Numbers:" + (a % b));
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		// Call By Value
		addition(10, 10); // 10,10 --> arguments

		// Call by Value
		subtraction(10, 5);
		
		// Call by Value
		modulus(10, 6);
		System.out.println("Main Method Ended");
	}

}