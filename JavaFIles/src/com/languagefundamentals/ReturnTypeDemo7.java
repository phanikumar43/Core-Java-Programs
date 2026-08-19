//Date;-18-08-2026
//The program is no arguments+no return value
/*Withdraw Money

Create withdraw()
Keep balance and withdrawal amount as variables.
Use if-else to check whether sufficient balance exists.
Display the updated balance.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class ReturnTypeDemo7 {
static int balance;
static int withdraw;

	public static void main(String[] args) {
		ReturnTypeDemo7 r7=new ReturnTypeDemo7();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Balance: ");
		if(balance>5000) {
			System.out.println("You have Sufficient balance to withdraw");
		}
		else {
			System.out.println("You does not have any sufficient funds in your account");
		}
	}
	static void withdraw() {
		System.out.println("Your Balance is: "+balance);
		System.out.println("");
	}

}
