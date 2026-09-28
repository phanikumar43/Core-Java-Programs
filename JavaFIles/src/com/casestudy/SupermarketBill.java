//Date:-27-09-2026
//Case Study
/*
A Supermarket wants to calculate the total bill for a customer.
The following data is given:

String[] products = { "BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES" };
int[] quantity {2, 1, 5, 3, 2 }; 
double[] price {60.5, 150.0, 25.0, 40.0, 85.0 };

Write a Java program using arrays to perform the following operations:
> Calculate the total bill amount for all products.
> Find the average item price.
> Identify and display the product with the highest total purchase amount (quantity price).
> Identify and display the product with the lowest total purchase amount.
 */
package com.casestudy;

public class SupermarketBill {

	public static void main(String[] args) {

		String[] products = { "BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES" };

		int[] quantity = { 2, 1, 5, 3, 2 };

		double[] price = { 60.5, 150.0, 25.0, 40.0, 85.0 };

		double totalBill = 0;
		double priceSum = 0;

		double highestAmount = 0;
		double lowestAmount = Double.MAX_VALUE;

		String highestProduct = "";
		String lowestProduct = "";

		for (int i = 0; i < products.length; i++) {

			double purchaseAmount = quantity[i] * price[i];

			System.out.println(products[i] + " = " + purchaseAmount);

			totalBill = totalBill + purchaseAmount;

			priceSum = priceSum + price[i];

			if (purchaseAmount > highestAmount) {
				highestAmount = purchaseAmount;
				highestProduct = products[i];
			}

			if (purchaseAmount < lowestAmount) {
				lowestAmount = purchaseAmount;
				lowestProduct = products[i];
			}
		}

		double averagePrice = priceSum / price.length;

		System.out.println("\n----- SUPERMARKET BILL -----");

		System.out.println("Total Bill = " + totalBill);

		System.out.println("Average Item Price = " + averagePrice);

		System.out.println("Highest Purchase = " + highestProduct + " : " + highestAmount);

		System.out.println("Lowest Purchase = " + lowestProduct + " : " + lowestAmount);
	}
}
