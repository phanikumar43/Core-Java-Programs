package com.RevisionClasses;

import java.util.Scanner;

// With Return Type + With Parameters
// WAP to print
//		- Area Of Square		--> side * side
//		- Area of Rectangle		--> length * breadth
//		- Area of Triangle		--> 0.5 * base * height
//		- Area of Circle		--> PI *r *r
public class TypesOfMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side: ");
		float side = sc.nextFloat();

		float arofSQ = findAreaOfSquare(side);
		System.out.println("Area of Square is: " + arofSQ);

		System.out.println("--------------------------------");

		System.out.println("Enter Length: ");
		double length = sc.nextDouble();

		System.out.println("Enter Breadth: ");
		double breadth = sc.nextDouble();

		double arofRec = findAreaOfRectangle(length, breadth);
		System.out.println("Area Of Rectangle is: " + arofRec);

		System.out.println("--------------------------------");

		System.out.println("Enter Base: ");
		double base = sc.nextDouble();

		System.out.println("Enter Height: ");
		double height = sc.nextDouble();

		double arofTri = findAreaOfTriangle(base, height);
		System.out.println("Area of Triangle is: " + arofTri);

		System.out.println("-------------------------------------");

		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();

		double arofCir = findAreaOfCircle(radius);
		System.out.println("Area Of Circle is: " + arofCir);

		System.out.println("-------------------------------------");

		System.out.println("Main Method Ended");
	}

	static double findAreaOfCircle(double r) {
		double arCir = Math.PI * r * r;
		return arCir;
	}

	static double findAreaOfTriangle(double base, double height) {
		double arTri = 0.5 * base * height;
		return arTri;
	}

	static double findAreaOfRectangle(double length, double breadth) {
		double arRec = length * breadth;
		return arRec;
	}

	static float findAreaOfSquare(float side) {
		float arSq = side * side;
		return arSq;
	}
}