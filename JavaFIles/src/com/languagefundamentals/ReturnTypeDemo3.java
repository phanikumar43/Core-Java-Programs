//Date;-18-08-2026
//The program is no arguments+no return value
/*Calculate and Display Simple Interest

Create calculateInterest()
Store principal, rate and time.
Calculate simple interest.
Directly display the result.
*/
package com.languagefundamentals;

public class ReturnTypeDemo3 {
int principal;
int rate;
int time;


void calculateInterest() {
	System.out.println("Principal is: "+principal);
	System.out.println("Rate is: "+rate);
	System.out.println("Time is: "+time);
	System.out.println("Total Interest is: "+(principal*rate*time)/100);
}
public static void main(String[] args) {
	ReturnTypeDemo3 r3=new ReturnTypeDemo3();
	r3.principal=1000;
	r3.rate=50;
	r3.time=5;
	r3.calculateInterest();
	}

}
