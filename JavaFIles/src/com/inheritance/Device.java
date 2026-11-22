//Date:-09-11-2026
/*
1. Create a parent class Device with private fields brand and price. Implement getters, setters, and a displaydetails() method.
a). Create two child classes Laptop and Mobile extending Device

class Laptop:-
- Fields: ram, processor
- Methods: CunIDE(), compilecode()
- Override displayDetails().
⁠
class Mobile:
- Fields: camera, battery
- Methods: makeCall), takephoto()
- override displayDetails().

Main Class - Vcube:
1. Create objects for Laptop and Mobile.

2.Initialize properties using setter methods.
1. Demonstrate inheritance and runtime polymorphism.
4.Call class-specific methods using child class objects.
 */
package com.inheritance;

public class Device {
	private String brand;
	private int price;

	static void displayDetails(String brand, int price) {
		System.out.println("This Brand is: " + brand);
		System.out.println("This Price is: " + price);
	}

	public static void main(String[] args) {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}