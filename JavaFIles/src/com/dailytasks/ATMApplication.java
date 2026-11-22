//Date:-18-11-2026
//Lab Task
/*
Java :-

1.Create an ATM application using Swith case and If else statements and Arrays
Take Individual method for every Different operation 

a)deposit() using this method to add amount to customer 
b) withDraw() using this method to withdraw the amount from account 
c)checkBalance() For checking the balance information 
d) changePin() for change the atm pin 

Take an encapsulated class for Transaction take corresponding fields 

create multiple objects and add info for different users
 */

package com.dailytasks;

import java.util.Scanner;

// ================= TRANSACTION CLASS =================
class Transaction {

	private int accountNo;
	private String customerName;
	private int pin;
	private double balance;

	// Constructor
	public Transaction(int accountNo, String customerName, int pin, double balance) {
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.pin = pin;
		this.balance = balance;
	}

	// Getters
	public int getAccountNo() {
		return accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public int getPin() {
		return pin;
	}

	public double getBalance() {
		return balance;
	}

	// Setters
	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

// ================= ATM APPLICATION CLASS =================
public class ATMApplication {

	static Scanner sc = new Scanner(System.in);

	// Deposit method
	static void deposit(Transaction t) {

		System.out.print("Enter deposit amount: ");
		double amount = sc.nextDouble();

		if (amount > 0) {
			t.setBalance(t.getBalance() + amount);

			System.out.println("Deposit successful!");
			System.out.println("Deposited amount: Rs. " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	// Withdraw method
	static void withDraw(Transaction t) {

		System.out.print("Enter withdrawal amount: ");
		double amount = sc.nextDouble();

		if (amount > 0 && amount <= t.getBalance()) {

			t.setBalance(t.getBalance() - amount);

			System.out.println("Withdrawal successful!");
			System.out.println("Withdrawn amount: Rs. " + amount);

		} else if (amount <= 0) {

			System.out.println("Invalid withdrawal amount!");

		} else {

			System.out.println("Insufficient balance!");
		}
	}

	// Check balance method
	static void checkBalance(Transaction t) {

		System.out.println("\n===== ACCOUNT DETAILS =====");
		System.out.println("Account Holder : " + t.getCustomerName());
		System.out.println("Account Number : " + t.getAccountNo());
		System.out.println("Available Balance : Rs. " + t.getBalance());
	}

	// Change PIN method
	static void changePin(Transaction t) {

		System.out.print("Enter current PIN: ");
		int oldPin = sc.nextInt();

		if (oldPin == t.getPin()) {

			System.out.print("Enter new 4-digit PIN: ");
			int newPin = sc.nextInt();

			System.out.print("Confirm new PIN: ");
			int confirmPin = sc.nextInt();

			if (newPin >= 1000 && newPin <= 9999 && newPin == confirmPin && newPin != oldPin) {

				t.setPin(newPin);
				System.out.println("PIN changed successfully!");

			} else {

				System.out.println("Invalid PIN or PIN mismatch!");
			}

		} else {

			System.out.println("Incorrect current PIN!");
		}
	}

	// Main method
	public static void main(String[] args) {

		// Creating multiple customer objects using array
		Transaction[] customers = new Transaction[3];

		customers[0] = new Transaction(1001, "Phani", 1234, 5000);
		customers[1] = new Transaction(1002, "Ravi", 2345, 10000);
		customers[2] = new Transaction(1003, "Kiran", 3456, 7500);

		System.out.println("===== WELCOME TO ATM =====");

		// Login using account number
		System.out.print("Enter Account Number: ");
		int accNo = sc.nextInt();

		Transaction currentCustomer = null;

		// Searching customer in array
		for (int i = 0; i < customers.length; i++) {

			if (customers[i].getAccountNo() == accNo) {
				currentCustomer = customers[i];
				break;
			}
		}

		// Check account exists
		if (currentCustomer == null) {
			System.out.println("Account not found!");
			sc.close();
			return;
		}

		// PIN validation
		System.out.print("Enter ATM PIN: ");
		int enteredPin = sc.nextInt();

		if (enteredPin != currentCustomer.getPin()) {
			System.out.println("Incorrect PIN!");
			sc.close();
			return;
		}

		System.out.println("Login successful!");
		System.out.println("Welcome, " + currentCustomer.getCustomerName());

		int choice;

		// ATM menu
		do {

			System.out.println("\n===== ATM MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Change PIN");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				deposit(currentCustomer);
				break;

			case 2:
				withDraw(currentCustomer);
				break;

			case 3:
				checkBalance(currentCustomer);
				break;

			case 4:
				changePin(currentCustomer);
				break;

			case 5:
				System.out.println("Thank you for using ATM!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		sc.close();
	}
}
