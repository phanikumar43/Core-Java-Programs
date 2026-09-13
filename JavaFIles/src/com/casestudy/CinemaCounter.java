//Date:-11-09-2026
//Case Study
/*
A cinema counter allows customers to choose a movie and seat type. The system should continue showing the options until the customer chooses Exit.
Use switch-case to handle the customer's choices and a do-while loop to repeat the menu
Display the menu repeatedly until user select Exit Option, if not repeatedly show until user selects 3
1. Select Movie
2. Select Seat Typ
3. Exit

If user select 1" option show the options as below
Movie:
1)Avengers Endgam
2) Inception
3)Interstellar

After selecting movie show the options below
Seat Type:
1) Regular
2) Premium
3) Recliner

When the user selects 3 options completely, display:

Thank you for booking!
 */
package com.casestudy;

import java.util.Scanner;

public class CinemaCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myn = "";
		String selectedOption = "";
		do {
			System.out.println("Welcome to Cinema Counter..");
			System.out.println("Enter a option");
			System.out.println("----------------------------");
			System.out.println("1.Select Movie");
			System.out.println("2.Select Seat Type");
			System.out.println("3.Exit");
			System.out.println("-----------------------------");
			int option = sc.nextInt();
			switch (option) {
			case 1 -> {
				String syn = "";
				do {
					System.out.println("Please Enter an Option: ");
					System.out.println("------------------------");
					System.out.println("1.Avengers Endgame");
					System.out.println("2.Inception");
					System.out.println("3.Interstealler");
					System.out.println("------------------------");
					int select = sc.nextInt();
					switch (select) {
					case 1 -> {
						System.out.println("You Are Booked For");
						System.out.println("Avengers Endgame");
						selectedOption = selectedOption + "Avengers Endgame\n";
					}
					case 2 -> {
						System.out.println("You Are Booked For");
						System.out.println("Inception");
						selectedOption = selectedOption + "Inception\n";
					}
					case 3 -> {
						System.out.println("You Are Booked For");
						System.out.println("Interstealler");
						selectedOption = selectedOption + "Interstealler\n";
					}
					default -> {
						System.out.println("Please Enter a Correct Option");
					}
					}
					System.out.println("You Are Selected For: " + selectedOption);
					System.out.println("Do You Want To Continue..If Yes Click 'Y' (or) If No Click 'N' ");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("Y"));
			}
			case 2 -> {
				String syn = "";
				String selectedItems = "";
				do {
					System.out.println("Please Select an Seat Type Option: ");
					System.out.println("------------------------");
					System.out.println("1.Regular");
					System.out.println("2.Premium");
					System.out.println("3.Recliner");
					System.out.println("------------------------");
					int click = sc.nextInt();
					switch (click) {
					case 1 -> {
						System.out.println("You Are Selected For");
						System.out.println("Recliner");
						selectedItems = selectedItems + "Regular\n";
					}
					case 2 -> {
						System.out.println("You Are Selected For");
						System.out.println("Premium");
						selectedItems = selectedItems + "Premium\n";
					}
					case 3 -> {
						System.out.println("You Are Selected For");
						System.out.println("Reciner");
						selectedItems = selectedItems + "Recliner\n";
					}
					default -> {
						System.out.println("Please Choose a Correct Option");
					}
					}
					System.out.println("You are selected for " + selectedItems);
					System.out.println("Do You Want to Continue..if Yes click 'Y' (or) If No Click 'N' ");
					syn = sc.next();
				} while (syn.equalsIgnoreCase("Y"));
			}
			}
			System.out.println("Do You Want to Continue..if Yes click 'Y' (or) If No Click 'N' ");
			myn = sc.next();
		} while (myn.equalsIgnoreCase("Y"));
		System.out.println("Thank You For Your Time");
		System.out.println("Please Visit Again");
	}
}
