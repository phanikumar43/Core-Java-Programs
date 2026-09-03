//Date:-03-09-2026
//Class Program
//Write a program for Calculating Two Numbers And Print Their Result by using Arithmetic Operators
//This program is done by using the switch statement
package com.logicalstatements;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter First Number: ");
			int a = sc.nextInt();

			System.out.println("Enter Second Number: ");
			int b = sc.nextInt();

			System.out.println("Enter an Operation: ");
			String operation = sc.next();

			int result;
			switch (operation) {
			case "A+" -> {
				result = a + b;
				System.out.println("Addition (Sum) Result is: " + result);
			}
			case "-" -> {
				result = a - b;
				System.out.println("Subtraction (Difference) Result is: " + result);
			}
			case "*" -> {
				result = a * b;
				System.out.println("Multiplication (Product) Result is: " + result);
			}
			case "/" -> {
				result = a / b;
				System.out.println("Division (Quotient) Result is: " + result);
			}
			case "%" -> {
				result = a * b;
				System.out.println("Modulus Division (Remainder) Result is: " + result);
			}
			default -> System.out.println("Please Enter Correct Operation");
			}
			System.out.println("Do You Want To Continue...Y if Yes && N if No: " + yn);
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));
		sc.close();
	}

}
