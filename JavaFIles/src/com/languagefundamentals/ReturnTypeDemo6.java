//Date;-18-08-2026
//The program is no arguments+no return value
/*Create deposit()
Keep balance and depositAmount as variables.
Add the deposit amount to balance.
Display the updated balance.
*/
package com.languagefundamentals;

public class ReturnTypeDemo6 {
int balance=5000;
int depositAmount;
int totalBalance;
void Createdeposit() {
	totalBalance=balance+depositAmount;
	System.out.println("Your Deposited amount is: "+depositAmount);
	System.out.println("Your Total Balance is: "+totalBalance);
}
	public static void main(String[] args) {
		ReturnTypeDemo6 r6=new ReturnTypeDemo6();
		r6.depositAmount=5000;
		r6.Createdeposit();
	}

}
