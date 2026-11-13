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
	
	//Backward-Compatibility	
	default void sleep() {
		System.out.println("Animals can sleep...");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");

	}
}