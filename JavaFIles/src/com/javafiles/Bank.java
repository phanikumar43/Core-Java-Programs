//Date:-23-07-2026
//Lab Experiment
/*
 Create a class StateBank with the following fields:
* AccountHolderName
* AccountNumber
* BankBalance

Requirements:
Initialize only the first account number to 62310100120.
For each new account, automatically generate the next account number without manually assigning it.
Display the details of three account holders.(Take Manual Name's For Each AccountHolder)
*/
package com.javafiles;

public class Bank {

//	static variables
	static String IFSC="NAN54866";
	static String branchName="PhaniIndia Branch";
	static int accountNumber=12012520;

//instance variables
	String accountHolderName;
	int balance;
	
	{
		accountNumber=accountNumber+1;
	}
	
void show() {
	System.out.println("Account Branch Name: "+branchName);
	System.out.println("Account Number: "+accountNumber);
	System.out.println("IFSC Code: "+IFSC);
	System.out.println("Account Holder Name: "+accountHolderName);
}
	public static void main(String[] args) {
		Bank b=new Bank();
		b.accountHolderName="a";
		b.balance=50495;
		b.show();
		System.out.println("------------------------------");
		Bank b1=new Bank();
		b1.accountHolderName="b";
		b.balance=50495;
		b1.show();
		System.out.println("------------------------------");
		Bank b2=new Bank();
		b2.accountHolderName="c";
		b2.balance=504565;
		b2.show();
	}

}
/*
 Output:-
 Account Branch Name: PhaniIndia Branch
Account Number: 12012521
IFSC Code: NAN54866
Account Holder Name: a
------------------------------
Account Branch Name: PhaniIndia Branch
Account Number: 12012522
IFSC Code: NAN54866
Account Holder Name: b
------------------------------
Account Branch Name: PhaniIndia Branch
Account Number: 12012523
IFSC Code: NAN54866
Account Holder Name: c
 */