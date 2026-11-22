
package com.oops;

import java.util.Scanner;

// Parent Interface
public interface Payment {

	// Abstract Method
	void makePayment();

	// Concrete Method
	default void displaymessage() {
		System.out.println("\n Welcome To My Banking");
		System.out.println("------------------------------");
	}
}

// Child Class 1
class UPIPayment implements Payment {

	String upiId;
	double amount;

	UPIPayment(String upiId, double amount) {
		this.upiId = upiId;
		this.amount = amount;
	}

	@Override
	public void makePayment() {
		System.out.println("UPI ID: " + upiId);
		System.out.println("Amount: " + amount);
		System.out.println("Your Payment is done through UPI.");
	}
}

// Child Class 2
class CreditCardPayment implements Payment {

	String cardHolder;
	double amount;

	CreditCardPayment(String cardHolder, double amount) {
		this.cardHolder = cardHolder;
		this.amount = amount;
	}

	@Override
	public void makePayment() {
		System.out.println("Card Holder: " + cardHolder);
		System.out.println("Amount: " + amount);
		System.out.println("Your Payment is done through Credit Card.");
	}
}

// Child Class 3
class NetBankingPayment implements Payment {

	String bankName;
	double amount;

	NetBankingPayment(String bankName, double amount) {
		this.bankName = bankName;
		this.amount = amount;
	}

	@Override
	public void makePayment() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Amount: " + amount);
		System.out.println("Your Payment is done through Net Banking.");
	}
}
