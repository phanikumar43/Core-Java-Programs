package com.RevisionClasses;

import java.util.Scanner;

public class BankAccount {

	double balance = 5000.00;

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		
		BankAccount ba = new BankAccount();

		System.out.println("Enter Amout to Deposit:");
		double amount = sc.nextDouble();

		System.out.println("Enter Amount to Withdraw:");
		double wAmount = sc.nextDouble();

		ba.deposit(amount);
		ba.withdraw(wAmount);
		ba.checkBalance();

		System.out.println("Main Method Ended");
		sc.close();
	}

	void withdraw(double wAmount) {
		if (wAmount <= balance) {
			balance = balance - wAmount;
			checkBalance();
		} else {
			System.out.println("Insufficient Balance in Your Account ");
			checkBalance();
		}
	}

	void checkBalance() {
		System.out.println("The current balance is:" + balance);
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			checkBalance();
		} else {
			System.out.println("Invalid Amount to Deposit:");
			checkBalance();
		}
	}
}