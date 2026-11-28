package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestUncheckExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter A number: ");
			int a = sc.nextInt();

			System.out.println("Enter Another Number:");
			int b = sc.nextInt();

			try {
				System.out.println("In Try Block ");
				System.out.println(a / b);
			} catch (ArithmeticException | InputMismatchException e) {
				System.err.println("In Catch Block ");
				System.err.println("Please give Correct Input ");
				e.printStackTrace();
			}

			System.out.println("Have a Nice Day!! ");
			System.out.println("Have a Nice Day!! ");

			System.out.println("Main Method Ended");
			sc.close();

		} catch (Exception e) {
			System.err.println("Please Give Correct Input");
		}
	}

}
