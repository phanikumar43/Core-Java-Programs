//Date:-19-08-2026
/*Program Idea: Electricity Bill Calculator ⚡

Create a class named ElectricityBill.

Variables:
customerName — String
units — int
billAmount — double

Method:
Create:
calculateBill(int units)
The method should accept units as a parameter and not return anything.

Conditions
Calculate the electricity bill based on units:

If units are 0–100 → ₹5 per unit
If units are 101–200 → ₹7 per unit
If units are 201–300 → ₹10 per unit
If units are above 300 → ₹12 per unit

The method should calculate and display the bill amount.
Note---->This Program is No Return type+With Parameters
*/
package com.languagefundamentals;

public class ElectricityBillCalculator {
String customerName;
int unit;
int units;
double billAmount;

void calculateBill(int units) {
	System.out.println("Customer Name is: "+customerName);
	System.out.println("Your consumpted units are: "+units);
	if(units<100) {
		unit=units*5;
		System.out.println("The Amount for this month is: "+unit);
	}
	else if(units<=200) {
		unit=units*7;
		System.out.println("The Amount for this month is: "+unit);
	}
	else if(units<=300) {
		unit=units*10;
		System.out.println("The Amount for this month is: "+unit);
	}
	else {
		unit=units*12;
		System.out.println("The Amount for this month is: "+unit);
	}
	System.out.println("Your Bill Amount is: "+unit);
}
	public static void main(String[] args) {
		ElectricityBillCalculator e=new ElectricityBillCalculator();
			e.customerName="Nani";
			e.calculateBill(350);
	}

}
