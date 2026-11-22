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

public class Application1 {
	class Transaction {

		private int accountNo;
		private String accountName;
		private int pin;
		private int balance;
		
		Transaction(int accountNo,String accountName,int pin,int balance){
			this.accountNo=accountNo;
			this.accountName=accountName;
			this.pin=pin;
			this.balance=balance;
		}
		
		public int getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}

		public String getAccountName() {
			return accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public int getPin() {
			return pin;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
	}
	
}
