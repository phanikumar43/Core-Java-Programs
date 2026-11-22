package com.RevisionClasses;

import java.util.Scanner;

// No Return Type + With Parameters --> Scanner
// Read the elements from the console using scanner
// For any Java Class, If there are no constructors then 
// Java compiler will create a default constructor which we cannot see

// WAP to print Student Details..?
public class TypesOfMethodsDemo3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		int sid = sc.nextInt();

		System.out.println("Enter Student Name: ");
		sc.nextLine();
		String sname = sc.nextLine();

		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();

		System.out.println("Enter your gender info: ");
		char gender = sc.next().charAt(0); // Method Chaining

		// Methods Call by values
		getStudent_Id_Name_Info(sid, sname);
		getStudentAgeInfo(age);
		getGenderInfo(gender);

		System.out.println("Main Method Ended");
	}

	static void getGenderInfo(char gen) {
		System.out.println("Student Gender Details: " + gen);

	}

	static void getStudentAgeInfo(int age) {
		System.out.println("Student Age is: " + age);
	}

	static void getStudent_Id_Name_Info(int id, String name) {
		System.out.println("Student ID and Name Info !!");
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}
}