//Date:-02-09-2026
//Class Program
//Write a Program yo print matrimonial site
//This Program can be printed by using nested-if and Scanner class
package com.logicalstatements;

import java.util.Scanner;

public class MatrimonialSite {

	public static void main(String[] args) {

		System.out.println("Welcome to Matrimonial Site.....");

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your name: ");
		String name = sc.nextLine();

		System.out.println("Please Enter your Assets: ");
		double assets = sc.nextDouble();

		System.out.println("Please Enter your Salary: ");
		double salary = sc.nextDouble();

		if ((assets > 50000.00) && (salary > 30000)) {

			System.out.println("Welcome Mr. " + name);
			System.out.println("Your Assets and Salary are Matched for this Profile");
			System.out.println("We can continue the next Process");

			System.out.println("Enter Your Age: ");
			int age = sc.nextInt();

			if ((age >= 25) && (age <= 35)) {

				System.out.println("Your Age is Matched for this Profile");
				System.out.println("We can continue the next Process");

			}

			System.out.println("Do You Have Any Siblings: ");
			boolean siblings = sc.nextBoolean();
			if (siblings) {
				System.out.println("Sorry Thanks For Your Valuable Time");
			} else {
				System.out.println("You are Matched for the profile");
			}

		} else {

			System.out.println("Your Profile Was not matched.");
			System.out.println("Thank You For Spending Time With Us...");
		}

		sc.close();
	}
}