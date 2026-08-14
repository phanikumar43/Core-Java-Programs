//Date:-04-08-2026
/*3. Bank Account System

Create a class BankAccount.
Instance Variables:
accountNumber (int)
customerName (String)
balance (double)

Static Variables:
bankName (String)
branchName (String)

Instance Methods:
deposit()
withdraw()
displayAccountDetails()

Static Methods:
displayBankDetails()
changeBranch()

Task:
Create two BankAccount objects.
Deposit money.
Withdraw money.
Display updated account details.
*/
package com.languagefundamentals;

public class BankExample {
//	static method
	static String bankName="Nani Bank";
	static String branchName="KBHP";
	
	int accountNumber=120569548;
	String customerName;
	int balance;
	int money;
	int deposit;
	int withdraw;
	
	void deposit() {
		deposit=money+balance;
		System.out.println("Current Amount is: "+deposit);
	}
	
	void withdraw(){
		withdraw=deposit-balance;
		System.out.println("Withdrawal Amount is: "+withdraw);
	}
//	Account Number Initialization
//	Doubt-1
	{
		accountNumber=accountNumber+4;
	}
	void displayAccountDetails() {
		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Customer Name is: "+customerName);
		System.out.println("Account Balance is: "+balance);
	}
	
	void displayBankDetails() {
		System.out.println("Bank Name is: "+bankName);
		System.out.println("Branch Name is: "+branchName);
	}
	
//	Doubt-2
//	void changeBranch(){
//		branchName="kukatpally";
//		System.out.println("Branch Name is: "+branchName);
//	}
	public static void main(String[] args) {
		BankExample be=new BankExample();
		be.balance=5000;
		be.money=500;
		be.withdraw=400;
		be.customerName="Phani";
		be.displayBankDetails();
		be.deposit();
		be.withdraw();
		be.displayAccountDetails();
		System.out.println("-------------------------------");
		
		BankExample be1=new BankExample();
		be1.accountNumber=15056956;
		be1.balance=4000;
		be1.money=500;
		be1.customerName="Kumar";
		be1.withdraw=600;
//		branchName="Kukatpally";
		be1.displayBankDetails();
		be1.deposit();
		be1.withdraw();
		be1.displayAccountDetails();
	}

}
