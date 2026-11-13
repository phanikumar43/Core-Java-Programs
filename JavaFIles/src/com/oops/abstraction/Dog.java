package com.oops.abstraction;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog Sounds like Bow Bow !!");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog can sleep at mornings and helping at night");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats mostly Non-Veg !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk mostly run like anything !!");
	}

}
