//Date:-01-09-2026
//Class Experiment
//Write a program to find the age of a person
//We can solve this program by using if,else,else-if
package com.logicalstatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("Welcome to Find the Person by the Age");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age: ");
		int age = sc.nextInt();
		if (age >= 35 && age <= 60) {
			System.out.println("You Are a Middle Age People");
		} else if (age >= 20 && age <= 35) {
			System.out.println("You Are Young Age People");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You Are A Teen");
		} else if (age >= 5 && age <= 12) {
			System.out.println("You Are A Child");
		} else if (age >= 0 && age <= 5) {
			System.out.println("You are a child");
		} else {
			System.out.println("You Are Old Age People");
		}
		sc.close();
	}
}