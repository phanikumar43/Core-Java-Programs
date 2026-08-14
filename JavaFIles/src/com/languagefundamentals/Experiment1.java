//Date:-28-07-2026
/*Question
A person has ₹250.
One notebook costs ₹18.

Find:

Number of notebooks he can buy.
Total amount spent.
Remaining amount.
*/
package com.languagefundamentals;

public class Experiment1 {
	static Experiment1 e=new Experiment1();
	int money=250;
	int notebook=18;
	int quantity;
	int spent;
	int remaining;
	void quantity() {
		quantity=money/notebook;
		System.out.println("Total Notebooks are: "+quantity);
	}
	void spent() {
		spent=quantity*notebook;
		System.out.println("Total Spented Amount is: "+spent);
	}
	void remaining() {
		remaining=money-spent;
		System.out.println("Remaining amount is: "+remaining);
	}
	public static void main(String[] args) {
	System.out.println("Welcome");
	e.quantity();
	e.spent();
	e.remaining();
	System.out.println("Thank You");
	}

}
