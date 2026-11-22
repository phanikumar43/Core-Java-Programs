package com.RevisionClasses;

// No Return Type + No Parameters : Instance & Static
public class TypesOfMethods {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TypesOfMethods t1 = new TypesOfMethods();
		welcome();

		t1.display();
		TypesOfMethods.welcome();
		t1.welcome();
	}

	// Instance method
	void display() {
		System.out.println("Display Your ID Card");
	}

	// Static method
	static void welcome() {
		System.out.println("Welcome to My World");
	}

}
