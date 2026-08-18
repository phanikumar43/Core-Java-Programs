//Date:-17-08-2026
/*
Student age category

Create:

checkAge(int age)

Think about these conditions:

age < 13       → Child
13–19          → Teenager
20–59          → Adult
60 or above    → Senior Citizen

This is good practice for if, else if, and else.
*/
package com.languagefundamentals;

import java.util.Scanner;

public class MethodsDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		if (age < 13) {
			System.out.println("You are a child");
		} 
		else if (age <=19) {
			System.out.println("You are a Teenager");
		}
		else if(age<=59) {
			System.out.println("You are a Adult");
		}
		else {
			System.out.println("You are a senior citizen");
		}
	}
}

/*
Output:-
Enter the age: 
8
You are a child

Enter the age: 
13
You are a Teenager

Enter the age: 
20
You are a Adult

Enter the age: 
70
You are a senior citizen
*/