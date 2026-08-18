//Date:-18-08-2026
//With return type+no parameters
package com.languagefundamentals;
import java.util.Scanner;
public class ReturnTypeDemo {
	static Double balance=5000.0;
	public static void main(String[] args) {
		System.out.println("main method Started ");

	ReturnTypeDemo ba = new ReturnTypeDemo();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Amount to Deposite : ");
	double amount = sc.nextDouble();
	ba.deposite(amount);

	System.out.println("Enter Amount to Withdraw :");
	double wAmount = sc.nextDouble();
	ba.withdraw(wAmount);

	System.out.println("main method Started ");

}

void withdraw(double wAmount) {
	if (wAmount <= balance) {
		balance = balance - wAmount;
		checkBalance();
	} else {
		System.out.println("Insufficient Balance in your Account ");
		checkBalance();
	}

}

void checkBalance() {
	System.out.println("The Current balance is : " + balance);
}

void deposite(double amount) {
	if (amount > 0) {
		balance = balance + amount;
		checkBalance();
	} else {
		System.out.println("Invalid amount to Deposite : ");
		checkBalance();
	}}
}
