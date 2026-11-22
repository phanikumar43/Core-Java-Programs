package com.RevisionClasses;

public class StudentBasicInfo {

	void main(String[] args) {
		System.out.println("Main Method Started");
		
		String fname = getFirstName();
		String lname = getFirstName();
		
		System.out.println("Full Name is: " + lname + " " + fname);
		
		System.out.println("Main Method Ended");
	}

	String getFirstName() {
		return "Kohli";
	}

	String getLastName() {
		return "Virat";
	}
}
