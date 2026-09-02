//Date:-01-09-2026
//Class Experiment
//This Program is solve by using if and else
/*
 1. One statement → curly braces are optional

You can write:
if (age >= 18)
    System.out.println("You are an adult");

This is perfectly valid.
It is equivalent to:

if (age >= 18) {
    System.out.println("You are an adult");
}

2. More than one statement → curly braces are required
❌ You cannot do this:

if (age >= 18)
    System.out.println("You are an adult");
    System.out.println("You can vote");

Java understands it as:
if (age >= 18)
    System.out.println("You are an adult");

System.out.println("You can vote");  // always executes

So if you want two or more statements to belong to the if, use { }:

if (age >= 18) {
    System.out.println("You are an adult");
    System.out.println("You can vote");
}
Easy rule to remember
Number of statements	{ } needed?
1 statement	❌ No
2 or more statements	✅ Yes

Think of { } as a box that tells Java: "All these statements belong to this if."

The above statement was for understanding if and else....
 */
package com.logicalstatements;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("You Are Eligible For Voting & Driving");
			System.out.println("Good Morning...Have a Nice Day");
		} else {
			System.out.println("You Are Not Eligible");
			System.out.println("Good Morning...Have a Nice Day");
		}
		scanner.close();
	}

}
