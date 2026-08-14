//Date:-28-07-2026
/*Question
A student has ₹500.
One pen costs ₹35.

Find:

Number of pens
Total cost
Remaining amount*/
package com.languagefundamentals;

public class Experiment2 {
	static Experiment2 e2=new Experiment2();
	int amount=500;
	int pen=35;
	int quantity;
	int cost;
	int remaining;
	void Quantity() {
		quantity=amount/pen;
		System.out.println("Numnber of pens: "+quantity);
		System.out.println("------------------------------");
	}
	void cost() {
		cost=quantity*pen;
		System.out.println("Total cost is: "+cost);
		System.out.println("--------------------------------");
	}
	void remaining() {
		remaining=amount-cost;
		System.out.println("Remaining Amount is: "+remaining);
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		e2.Quantity();
		e2.cost();
		e2.remaining();
		System.out.println("Thank you");
	}

}
