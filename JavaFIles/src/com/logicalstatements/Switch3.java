//Date:-03-09-2026
//Class Program
//Write a program for Calculating Two Numbers And Print Their Result by using Arithmetic Operators
//This program is done by using the switch statement
package com.logicalstatements;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn="";
		do {
		System.out.println("Enter a Week Day");
		String day=sc.next();
		
		switch(day) {
		case "MON","mon" -> System.out.println("Monday is Lazy Day");
		case "TUE","WED","THU","tue","wed","thu" -> System.out.println("These are the middle week days");
		case "FRI","SAT","fri","sat" -> System.out.println("These are the upcoming week days");
		case "SUN","sun" -> System.out.println("This is the best day in a week");
		}
		System.out.println("Do you want to continue...If Yes click Y (or) If No Click N "+yn);
		yn=sc.next();
		}while(yn.equalsIgnoreCase("Y"));
		sc.close();
		System.out.println("Exit ");
	}

}
