//Date:-03-09-2026
//Class Program
//Write a program for Finding the t-shirt size using switch statement
//This program is done by using the switch statement
/*
XXS (Extra Extra Small): Chest size around 30 to 32 inches. 
XS (Extra Small): Chest size around 32 to 34 inches.
S (Small): Chest size around 36 to 38 inches.
M (Medium): Chest size around 40 to 42 inches. 
L (Large): Chest size around 44 to 46 inches.
XL (Extra Large): Chest size around 48 to 50 inches.
2XL / XXL (Double Extra Large): Chest size around 52 to 54 inches. 
3XL / XXXL (Triple Extra Large): Chest size around 56 to 58 inches. 
 */
package com.logicalstatements;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter the T-Shirt Size: ");
			String size = sc.next();

			switch (size) {
			case "XXS" -> System.out.println("It is 30 to 32 Inches");
			case "XS" -> System.out.println("It is 32 to 34 Inches");
			case "S" -> System.out.println("It is Small");

			case "M" -> System.out.println("It is 40 to 42 Inches");

			case "L" -> System.out.println("It is 44 to 46 Inches");

			case "XL" -> System.out.println("It is 48 to 50 Inches");
			case "2XL", "XXL" -> System.out.println("It is 52 to 54 Inches");
			case "3XL", "XXXL" -> System.out.println("It is 56 to 58 Inches");
			default -> System.out.println("Enter The Correct Brand To Proceed....");
			}
			System.out.println("Do You Want to Enter Click Y for Yes & N for No : " + yn);
			yn = sc.next();
		} while (yn.equalsIgnoreCase("Y"));
		sc.close();
	}
}
