//Date:-18-08-2026
//Lab Program
/*Create a Java class named shoppingcart to represent a customer's shopping cart

Variables:
storeName:-common for all bills 
customerName
 productName
 price 
 quantity

Methods:
addproduct(string pname , double pr, int qty):-store the product details in the instance variables. for every method call print product added successfully message

calculateTotal(double discount):-
calculate the total price based on quantity and price, then apply the given discount.

void displaycart():-
Display the store name, customer name, product details, and final amount.

Requirement:
Create two Shoppingcart objects for two different customers. Add different products to each cart, apply different discounts, and display their cart details.
*/
package com.languagefundamentals;

public class ShoppingCartDemo {
	static String storeName = "Nani Store";
	String customerName;
	String productName;
	double price;
	int quantity;
	double finalAmount;
	void addproduct(String productName, double pr, int qty) {
		System.out.println("Enter the Product Name: " + productName);
		System.out.println("The Quantity of the products is: " + qty);
		System.out.println("The price of the product is: " + (qty * pr));
	}

	void calculateTotal(double discount) {
		System.out.println("Congratulations..Your final discount amount is: " + discount);
		finalAmount = discount-price;
		System.out.println("Your Total Amount is: "+finalAmount);
	}

	void displaycart() {
		System.out.println("Our Store Name is: " + storeName);
		System.out.println("Customer Name is: " + customerName);
	}

	public static void main(String[] args) {
		ShoppingCartDemo s = new ShoppingCartDemo();
		s.customerName="Kumar";
		s.displaycart();
		s.addproduct("Horliks", 2, 10);
		s.calculateTotal(10);
		System.out.println("--------------------------------------------");
		ShoppingCartDemo s1 = new ShoppingCartDemo();
		s1.customerName="Phani";
		s1.displaycart();
		s1.addproduct("Boost", 9, 10);
		s1.calculateTotal(20);
		System.out.println("--------------------------------------------");
	}
}