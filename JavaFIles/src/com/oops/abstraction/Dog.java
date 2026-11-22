package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog Sounds like Bow Bow !!");
	}

	// Default methods are allowed only in interfaces.
	@Override
	public void sleep() {
		System.out.println("Dog can sleep at mornings and helping at night");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats mostly Non-Veg !!");
	}

//	@Override
	//The method breath() of type Dog must override or implement a supertype method
	//static method should call by using interface name only
	public static void breath() {
		System.out.println("Animals must breath !!");
	}
	
	private void hello() {
		
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk mostly run like anything !!");
	}

}
