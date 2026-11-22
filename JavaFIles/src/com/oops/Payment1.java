package com.oops;

import java.util.Scanner;

public class Payment1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Payment p = null;

		System.out.println("===== PAYMENT SYSTEM =====");
		System.out.println("1. UPI Payment");
		System.out.println("2. Credit Card Payment");
		System.out.println("3. Net Banking Payment");

		System.out.print("Enter Your Choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			sc.nextLine();
			System.out.print("Enter UPI ID: ");
			String upiId = sc.nextLine();
			System.out.print("Enter Amount: ");
			double upiAmount = sc.nextDouble();
			p = new UPIPayment(upiId, upiAmount);
			break;

		case 2:
			sc.nextLine();
			System.out.print("Enter Card Holder Name: ");
			String cardHolder = sc.nextLine();
			System.out.print("Enter Amount: ");
			double cardAmount = sc.nextDouble();
			p = new CreditCardPayment(cardHolder, cardAmount);
			break;

		case 3:

			sc.nextLine();
			System.out.print("Enter Bank Name: ");
			String bankName = sc.nextLine();
			System.out.print("Enter Amount: ");
			double bankAmount = sc.nextDouble();
			p = new NetBankingPayment(bankName, bankAmount);
			break;

		default:
			System.out.println("Invalid Payment Choice!");
			sc.close();
			return;
		}

		// Runtime Polymorphism
		p.displaymessage();
		p.makePayment();
		System.out.println("------------------------------");
		System.out.println("Thank You For Using Our Service!");
		sc.close();
	}
}
