//Date;-18-08-2026
//The program is no arguments+no return value
/*Display Bank Account Details

Create displayAccountDetails()
Store account number, customer name and balance.
Display them.
*/
package com.languagefundamentals;

public class ReturnTypesDemo5 {
long accountNumber;
String customerName;
int balance;

void displayAccountDetails() {
	System.out.println("Account Number is: "+accountNumber);
	System.out.println("Customer Name is: "+customerName);
	System.out.println("Balance  is: "+balance);
}
	public static void main(String[] args) {
		ReturnTypesDemo5 r5=new ReturnTypesDemo5();
		r5.accountNumber=516165168;
		r5.customerName="Phani";
		r5.balance=100000;
		r5.displayAccountDetails();
	}

}
