//Date:-28-07-2026
/*
 A customer has ₹1000.
One T-shirt costs ₹249.

Find:

Number of T-shirts
Total amount spent
Remaining amount
 */
package com.languagefundamentals;

public class Experiment3 {
	static Experiment3 e3=new Experiment3();
	int amount=1000;
	int shirt=249;
	int quantity;
	int cost;
	int remaining;
	void quantity() {
		quantity=amount/shirt;
		System.out.println("Number of t-shirts are: "+quantity);
		System.out.println("--------------------------------------");
	}
	void cost() {
		cost=quantity*shirt;
		System.out.println("Total Amount of shirts are: "+cost);
		System.out.println("-------------------------------------");
	}
	void remaining() {
		remaining=amount-cost;
		System.out.println("Remaining Amount are: "+remaining);
		System.out.println("---------------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		e3.quantity();
		e3.cost();
		e3.remaining();
		System.out.println("Thank You");
		}

}
