package com.oops.abstraction;

//1)Interfaces cannot have constructors
//	Ex:-
//	 Animal(){
//		 
//	 }

//2) By Default interface is abstract whether we give or not

//3) Cannot instantiate the type Animal
//	  Example:-
//		Animal a=new Animal();	

//4) Interface tells us what to do, but not how to do

//5) Abstract methods do not specify a body
//Example:-
//	void eat() {
//	
//}
//if you put static in before void eat(){} it treats like static

// 6)By Default interface methods are public and abstract
// Example:-
// 	  void sound();

// 7) In Class The method requires a body instead of semicoloun
// Example:-
//		Void hello()
public abstract interface Animal {

	public abstract void sound();

	public abstract void eat();

	public abstract void walk();

	// default methods can helpful to avoid backward compatibility Problems
	// Q)Can we over-ride default methods..? Yes
	// Backward-Compatibility
	public default void sleep() {
		System.out.println("Animals can sleep...");
		hello();
	}

	public default void run() {
		System.out.println("Animals can run..");
		hello();
	}

	// static methods are helpful to provide constant utility behaviour for all the
	// classes
	// static methods we cannot override.
	public static void breath() {
		System.out.println("Animals must breath !!");
	}

	// private methods introduced from 1.9 to avoid duplicate code in default
	// methods.
	// Because ,private methods we cannot override.
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
	}
}