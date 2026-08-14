//Date:-24-07-2026
//Lab Experiment
/*
Write a Java Program to complete below Requirements.
Create a class named ATM.

Static Variables
bankName field common for all users

Instance Variables accountNumber balance

Methods: -
deposit()
withdraw()
checkBalance()
I
Create 2 ATM account objects.
Assign appropriate values to the instance variables for each account.
Perform different deposit and withdrawal operations on both accounts using the given methods.
Display the balance of each account using the checkbalance) method.
 */
package com.javafiles;

public class AtmExample {
	// Static Variable
	static String bankName = "PhaniBank";

	// Instance Variable
	long accountNumber;
//	int currentBalance;
	int balance;
	int amount;

	void deposit() {
		balance = balance + 500;
		System.out.println("Deposit Amount is:500");
		System.out.println("Current Balance is: " + balance);
		System.out.println("---------------------------------------");
	}

	void withdraw() {
		balance = balance - 100;
		System.out.println("Withdraw Amount is:100");
		System.out.println("Current Balance is: " + balance);
		System.out.println("---------------------------------------");
	}

	void checkBalance() {
//		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Your Account Balance is: " + balance);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		AtmExample ae = new AtmExample();
		System.out.println("Bank Name is: " + bankName);
		ae.accountNumber = 256955636;
		ae.balance = 5000;
		ae.deposit();
		ae.withdraw();
		ae.checkBalance();

		System.out.println("Bank Name is: " + bankName);
		AtmExample ae1 = new AtmExample();
		ae1.balance = 6000;
		ae1.deposit();
		ae1.withdraw();
		ae1.checkBalance();
	}
}
