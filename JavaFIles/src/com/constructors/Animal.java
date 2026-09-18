package com.constructors;

public class Animal {

	public static void main(String[] args) {
		String name = "Dog";
		String colour = "Black";
	}
}

class Dog extends Animal {
	public static void main(String[] args) {
		String name = "Horse";
		String colour = "Brown";
		System.out.println("Main Method Started");
		Dog d = new Dog();
		
		System.out.println("Main Method Ended");
	}
}