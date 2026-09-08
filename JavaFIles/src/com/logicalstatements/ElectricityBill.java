//Date:-08-09-2026
//Lab Experiment
/*
Write a Java program to calculate the electricity bill based on the connection type and the number of units consumed.

Requirements:
 > Ask the user to enter   connection type
a) → Domestic
b) → Commercial
› Using switch case to determine the selected connection type.
› Ask the user to enter the number of units consumed.

a) Domestic Connection:
› If units are 100 or less, charge 2 per unit.
If units are greater than 300 charge 3 change a per unit 

b) Commercial Connection:
› If units are 100 or less, charge 4 per unit.
› If units are greater than 100 and up to 300, charge 6 per unit.
› If units are greater than 300, charge 8 per unit. Atlast, display the following details:
Connection Type
Units Consumed
Rate Per Unit
Total Electricity Bill
 */
package com.logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Connection Type: ");
		int n = sc.nextInt();
		switch (n) {
		case 1 -> {
			System.out.println("Domestic");
			System.out.println("Please Enter Number of Units: ");
			int units=sc.nextInt();
			int rate=0;
			int charge=0;
			if(units>0) {
				rate=2;
				charge=units*rate;
			}
			if(units>=300) {
				rate=3;
				charge=units*rate;
			}
			System.out.println("Connection Type is: Domestic");
			System.out.println("Your Consumed Units are: "+units);
			System.out.println("Rate Per Unit is: "+rate);
			System.out.println("Total Electricity Bill is: "+charge);
		}
		case 2 -> {
			System.out.println("Commercial");
			System.out.println("Please Enter Number Of Units: ");
			int units=sc.nextInt();
			int charge=0;
			int rate=0;
			if(units>0 && units<=100){
				rate=4;
				charge=units*rate;
			}
			else if(units>=100 && units<=300) {
				rate=6;
				charge=units*rate;
			}
			else if(units>=300) {
				rate=8;
				charge=units*rate;
			}
			System.out.println("Connection Type is: Commercial");
			System.out.println("Your Consumed Units are: "+units);
			System.out.println("Rate Per Unit is: "+rate);
			System.out.println("Total Electricity Bill is: "+charge);
		}
		default -> {
			System.out.println("Please Enter The Correct Connection Type");
		}
	}
		sc.close();
	}
}