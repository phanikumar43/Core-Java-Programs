//Date:-20-08-2026
//Class Program
//This Program is With Return Type + With Parameters
/*
 Write a program to print
 	- Area of Square     ---> Formula:-side*side
 	- Area of Rectangle  ---> Formula:-Length*Breadth
 	- Area of Triangle   ---> Formula:-0.5*Base*Height
 	- Area of Circle	 ---> Formula:-PI*r*r
 */
package com.languagefundamentals;

import java.util.Scanner;

public class WithReturnTypeWithParameters {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Method Started ");
		System.out.println("Enter Side: ");
		double side = sc.nextDouble();

		double arSq = findAreaOfSquare(side);
		System.out.println("Area of Square is: " + arSq);
		System.out.println("***************************************************");

		System.out.println("Enter Length: ");
		double length = sc.nextDouble();

		System.out.println("Enter Breadth: ");
		double breadth = sc.nextDouble();

		double arRec = findAreaOfRectangle(length, breadth);
		System.out.println("Area of Rectangle is: " + arRec);
		System.out.println("***************************************************");

		System.out.println("Enter Base: ");
		double base = sc.nextDouble();

		System.out.println("Enter Height: ");
		double height = sc.nextDouble();

		double arTri = findAreaOfTriangle(base, height);
		System.out.println("Area of Triangle is: " + arTri);
		System.out.println("***************************************************");

		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();

		double arCir = findAreaOfCircle(radius);
		System.out.println("Area Of Circle is: " + arCir);
		System.out.println("Main Method Ended ");
	}

	double findAreaOfCircle(double radius) {
		double arOfCir = Math.PI * radius * radius;
		return arOfCir;
	}

	double findAreaOfTriangle(double base, double height) {
		double arOfTri = 0.5 * base * height;
		return arOfTri;
	}

	double findAreaOfRectangle(double length, double breadth) {
		double arOfRec = length * breadth;
		return arOfRec;
	}

	double findAreaOfSquare(double side) {
		double arOfSq = side * side;
		return arOfSq;
	}
}