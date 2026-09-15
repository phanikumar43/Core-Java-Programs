//Date:-15-09-2026
//Lab Experiment
/*
1. Mini-Game Project :-
create a java class that complete below requirements ,
>  using Random class from java.util Generate a Random number between range 1 to 10
› user able to give the input from console for atleast three times and campare the generated number with user input
› if both are equal in first chance display the message "YOU WON!"
› if not continue the process upto three times, 
if user not able to guess the number in 3rd time display the message "BETTER LCK NEXT TIME" 
 */
package com.logicalstatements.loops;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int randomNumber = random.nextInt(10) + 1;
		boolean won = false;
		System.out.println("Guess the number between 1 and 10");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Chance " + i + ": Enter your guess:");
			int userNumber = sc.nextInt();
			if (randomNumber == userNumber) {
				System.out.println("YOU WON!");
				won = true;
				break;
			} else {
				System.out.println("Wrong Guess!");
			}
		}
		if (won == false) {
			System.out.println("BETTER LUCK NEXT TIME");
		}
		sc.close();
	}
}