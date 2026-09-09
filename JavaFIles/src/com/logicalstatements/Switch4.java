//Date:-07-09-2026
//Class Experiment
//Write A Program to print the week information by using the switch statement
package com.logicalstatements;

import java.util.Scanner;

public class Switch4 {
	static String weekInfo(int n) {
		String week = switch (n) {
		case 1 -> {
			yield "Sunday";
		}
		case 2 -> {
			yield "Monday";
		}
		case 3 -> {
			yield "Tuesday";
		}
		case 4 -> {
			yield "Wednesday";
		}
		case 5 -> {
			yield "Thursday";
		}
		case 6 -> {
			yield "Friday";
		}
		case 7 -> {
			yield "Saturday";
		}
		default -> "Invalid";
		};
		return week;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String week = weekInfo(n);
		System.out.println("Enter The Week Info: " + week);
		sc.close();
	}
}