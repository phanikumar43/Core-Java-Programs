//Date:-29-08-2026
//Class Experiment
//Wirte a Program to perform arithmetic operators
/*
 Arithmetic Operators are classified into
 	- Addition (+) also called as Sum
 	- Subtraction (-) also called as Difference
 	- Multiplication (*) also called as Product
 	- Division(/) also called as Quotient
 	- Modulus Division (%) also called as Remainder
 */
package com.operators;

import java.util.Scanner;

public class ArithmeticOperators {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method Started");

		System.out.println("Enter First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();

		int sum1 = addition(a, b);
		System.out.println("Addition (Sum) of two numbers is: " + sum1);
		System.out.println("-------------------------------------------------------");

		System.out.println("Enter First Number: ");
		double a1 = sc.nextDouble();

		System.out.println("Enter Second Number");
		float b1 = sc.nextFloat();

		double difference1 = subtraction(a1, b1);
		System.out.println("Subtraction (Difference) of two numbers is: " + difference1);
		System.out.println("-------------------------------------------------------");

		System.out.println("Enter First Number: ");
		int a2 = sc.nextInt();

		System.out.println("Enter Second Number");
		int b2 = sc.nextInt();

		int product1 = multiplication(a2, b2);
		System.out.println("Multiplication (Product) of two numbers is: " + product1);
		System.out.println("-------------------------------------------------------");

		System.out.println("Enter First Number: ");
		int a3 = sc.nextInt();

		System.out.println("Enter Second Number");
		int b3 = sc.nextInt();

		int division1 = division(a3, b3);
		System.out.println("Division (Quotient) of two numbers is: " + division1);
		System.out.println("-------------------------------------------------------");

		System.out.println("Enter First Number: ");
		int a4 = sc.nextInt();

		System.out.println("Enter Second Number");
		int b4 = sc.nextInt();

		int modulusdivision1 = modulusdivision(a4, b4);
		System.out.println("Modulus Division (Remainder) of two numbers is: " + modulusdivision1);
		System.out.println("-------------------------------------------------------");

		System.out.println("Main Method Ended");
	}

	int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}

	double subtraction(double a1, float b1) {
		double difference = a1 - b1;
		return difference;
	}

	int multiplication(int a, int b) {
		int product = a * b;
		return product;
	}

	int division(int a, int b) {
		int quotient = a / b;
		return quotient;
	}

	int modulusdivision(int a, int b) {
		int remainder = a % b;
		return remainder;
	}
}

/*
 * Output:-
 * 
 * Main Method Started Enter First Number: 5 Enter Second Number: 1 Addition
 * (Sum) of two numbers is: 6
 * ------------------------------------------------------- Enter First Number: 5
 * Enter Second Number 4 Subtraction (Difference) of two numbers is: 1.0
 * ------------------------------------------------------- Enter First Number:
 * 40 Enter Second Number 5 Multiplication (Product) of two numbers is: 200
 * ------------------------------------------------------- Enter First Number:
 * 40 Enter Second Number 5 Division (Quotient) of two numbers is: 8
 * ------------------------------------------------------- Enter First Number:
 * 40 Enter Second Number 4 Modulus Division (Remainder) of two numbers is: 0
 * ------------------------------------------------------- Main Method Ended
 */