//Date:-03-09-2026
//Lab Experiment
/*Create a Java program to calculate a customer's pizza bill based on pizza size, quantity, and delivery distance.

*Requirements*:
S → 70
M → 100
L→150

Create the following methods:

*double getpizzaPrice(char size)* → Return the pizza price based on the selected size.

*doublecalculatepizzacost(double price, int quantity)* → Return the total pizza cost based on price and quantity. 

*doublecalculateDeliverycharge(double distance)*
 > Return delivery charge: 0-10 km = 70rs, "11-20 km = 100, >20 km = 150.

*doublecalculateFinalBill(double pizzacost, double deliverycharge)* → Return the final bill by adding pizza cost and delivery charge.

Ask the user for:
Pizza size ('S/M/L),
Quantity,
Delivery distance.

*output*: -
Display a bill summary containing pizza size, price, quantity, pizza cost, delivery charge, and final bill.

*Note*: Invalid size, quantity "‹= 0", and negative distance.
**/
package com.logicalstatements;

import java.util.Scanner;

public class PizzaStore {
	double getpizzaPrice(char size) {
		double price = 0;
		if (size == 'S' || size == 's') {
			price = 70;
		} else if (size == 'M' || size == 'm') {
			price = 100;
		} else if (size == 'L' || size == 'l') {
			price = 150;
		}
		return price;
	}

	double calculatepizzacost(double price, int quantity) {
		double pizzacost = quantity * price;
		return pizzacost;
	}

	double calculateDeliverycharge(double distance) {
		double deliveryCharge = 0;
		if (distance <= 10) {
			deliveryCharge = 70;
		}
		if (distance <= 20) {
			deliveryCharge = 100;
		}
		if (distance >= 20) {
			deliveryCharge = 150;
		}
		return deliveryCharge;
	}

	double calculateFinalBill(double pizzacost, double deliverycharge) {
		double FinalBill = pizzacost + deliverycharge;
		return FinalBill;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PizzaStore p = new PizzaStore();

		System.out.println("------Pizza Bill-----------");

		System.out.println("Enter The Pizza Size (S/M/L): ");
		char size = sc.next().charAt(0);

		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();

		System.out.println("Enter Delivery Distance (km): ");
		double distance = sc.nextDouble();

		double price = p.getpizzaPrice(size);

		double deliveryCharge = p.calculateDeliverycharge(distance);

		double pizzaCost = p.calculatepizzacost(price, quantity);

		double finalBill = p.calculateFinalBill(pizzaCost, deliveryCharge);
		
		System.out.println("Final Bill is: "+finalBill);
		
		sc.close();

	}

}
