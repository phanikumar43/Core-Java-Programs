//Date:-05-08-2026
//Lab Experiment
/*Design a Java class named "Shoppingcart to manage the shopping cart details.
Create the following instance variables:
* items (int) - Stores the number of items added to the shopping cart.
* totalAmount (double) - stores the total cost of the items in the cart.
* orderplaced (String) - stores whether the order has been placed or not.
Create the following static variable:
* website (string) - stores the name of the shopping website. Initialize it with *"Pizzahut"*.
Instance Methods (No Parameters and No Return Type)
Implement the following methods:
* addItem) - Simulates adding items to the shopping cart.
* placeorder() - Marks the order as placed.
* displayCart) - Displays the website name, number of items, total amount, and order status.
Static Methods (No Parameters and No Return Type)
Implement the following methods:
* changeWebsite() - Changes the website name.
* displaywebsite() - Displays the website name.
In the main() method:
a) Create two
"ShoppingCart" objects.
b) Assign different values to the number of items and total amount for each shopping cart.
c) Display the details of both shopping carts.
d) Place the order for the first shopping cart.
e) Add items to the second shopping cart.
f) Change the website name using the static method.
g) Display the updated details of both shopping carts.
*/

package com.languagefundamentals;

public class ShoppingCart {
static String webSite="Pizzahut";

int quantity;
double totalAmount=10.0;
String orderPlaced;
String items="Pizza";
String item3="Chocolate";
String item4="Momos";
void additem() {
	System.out.println("The items is: "+items);
	System.out.println("The added item is: "+item3);
	}

void additem1() {
	System.out.println("The added item is: "+item4);
}

void placeorder() {
	System.out.println("The order item is: "+item3);
}

void displaycart() {
	System.out.println("Website Name is: "+webSite);
	System.out.println("The Quantity of items is: "+quantity);
	System.out.println("The order status is: "+orderPlaced);
}

void priceCalculation(){
	totalAmount=(quantity*totalAmount);
}

void totalamount() {
	System.out.println("The total Amount is: "+totalAmount);
}

	public static void main(String[] args) {
		ShoppingCart s=new ShoppingCart();
		s.additem();
		s.quantity=10;
		s.placeorder();
		s.orderPlaced="Confirm";
		s.displaycart();
		s.priceCalculation();
		s.totalamount();
		System.out.println("------------------------------");
		ShoppingCart s1=new ShoppingCart();
		s1.additem1();
		s1.placeorder();
		s1.quantity=15;
		s1.orderPlaced="Confirm";
		s1.webSite="Dominos";
		s1.displaycart();
		s1.priceCalculation();
		s1.totalamount();
		System.out.println("------------------------------");
}
}