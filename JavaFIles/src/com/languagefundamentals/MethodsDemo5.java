//Date:-18-08-2026
/*Idea 4 — Calculator method

Create separate methods:
addition(int a, int b)
subtraction(int a, int b)
multiplication(int a, int b)
division(int a, int b)

Then in main():

Take two numbers
      ↓
Call each method
      ↓
Display results
*/
package com.languagefundamentals;

public class MethodsDemo5 {
	void addition(int a, int b) {
		System.out.println("Addition of two Numbers is: "+(a+b));
	}
	
	void subtraction(int a,int b) {
		System.out.println("Subtraction of two numbers is: "+(a+b));
	}
	
	void Multiplication(int a,int b) {
		System.out.println("Multiplication of two numbers is: "+(a*b));
	}
	
	void division(int a,int b) {
		System.out.println("Division of two numbers is: "+(a/b));
	}
	public static void main(String[] args) {
		MethodsDemo5 m5=new MethodsDemo5();
		m5.addition(5, 2);
		m5.subtraction(10, 5);
		m5.Multiplication(5, 5);
		m5.division(10, 6);
	}
}

/*
Output:-
Addition of two Numbers is: 7
Subtraction of two numbers is: 15
Multiplication of two numbers is: 25
Division of two numbers is: 1
*/
