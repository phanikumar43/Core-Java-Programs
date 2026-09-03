//Date:-03-09-2026
//Class Program
//Write a program for cricketer info using switch statement
//This program is done by using the switch statement

package com.logicalstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter The Jersey Number: ");
			int jno = sc.nextInt();
			switch (jno) {
			case 1:
				System.out.println("KL Rahul");
				System.out.println("Indian Cricket Team");
				break;
				
			case 7:
				System.out.println("MS Dhoni");
				System.out.println("Indian Cricket Team");
				break;
				
			case 8:
				System.out.println("Ravindra Jadeja");
				System.out.println("Indian Cricket Team");
				break;
			case 10:
				System.out.println("Sachin Tendulkar");
				System.out.println("Indian Cricket Team");
				break;

			case 11:
				System.out.println("Mohammad Shami");
				System.out.println("Indian Cricket Team");
				break;

			case 17:
				System.out.println("Rishabh Pant");
				System.out.println("Indian Cricket Team");
				break;

			case 18:
				System.out.println("Virat Kohli");
				System.out.println("Indian Cricket Team");
				break;

			case 33:
				System.out.println("Hardhik Pandya");
				System.out.println("Indian Cricket Team");
				break;

			case 45:
				System.out.println("Rohit Sharma");
				System.out.println("Indian Cricket Team");
				break;

			case 77:
				System.out.println("Shubhman Gill");
				System.out.println("Indian Cricket Team");
				break;

			case 93:
				System.out.println("Jasprit Bumrah");
				System.out.println("Indian Cricket Team");
				break;

			default:
				System.out.println("These are the known Indian players. " + "Please enter the correct details...");
				break;
			}
			System.out.println("Do you Want to Continue? " + "If Yes click Y & If No Click N: ");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));
		sc.close();
	}
}