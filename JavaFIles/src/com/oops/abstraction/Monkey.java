package com.oops.abstraction;

public class Monkey implements Animal{

	@Override
	public void sound() {
		System.out.println("kchkchkchkchkchkch");
	}

	@Override
	public void eat() {
		System.out.println("Monkey can eat Bananas");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can walk and also Jumps");
	}

}
