//Date:-02-09-2026
//Lab Experiment
/*1. Write a Java Program that takes a Integer as input
→› if the Integer is only Divisible By 3 Print "Fizz"
-› if the Integer is only Divisible By 5 Print "Buzz"
- is the Integer is Divisible by Both 3, 5 then print "Fizz Buzz" using conditional statements ex: - input : - 15
output :- Fizz Buzz
*/
package com.operators;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		if((number%3==0)&&(number%5==0)) {
			System.out.println("Fizz Buzz");
		}
		else if(number%3==0) {
			System.out.println("Fizz");
		}
		else if(number%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println("Please Enter Correct Number");
		}
		sc.close();
	}
}