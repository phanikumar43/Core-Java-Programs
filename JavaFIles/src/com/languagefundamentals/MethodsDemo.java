//Date:-16-08-2026
//Methods Program
package com.languagefundamentals;

public class MethodsDemo {

	//Addition
	 void addition(int a,int b)
	{
		 //Formula:-A+B
		System.out.println("Addition of two numbers is: "+(a+b));
	}
	
	 //Subtraction
	void subtraction(int a,int b)
	{
		//Formula:-A-B		
		System.out.println("Subtraction of two numbers is: "+(a-b));
	}
	
	//Multiplication
	void multiplication(int a,int b)
	{
		//A*B
		System.out.println("Multiplication of two numbers is: "+(a*b));
	}
	
	//Calculate Square
		void calculateSquare(int a)
		{
			//Formula:-A*A
			System.out.println("Square of a numbers is: "+(a*a));
		}
		
	//Calculate rectangle area
		void rectanglearea(int a,int b)
		{
			//Formula:-area = length × breadth
			int area;
			area=a*b;
			System.out.println("Rectangle Area is: "+area);
		}
		
	//Division
		void division(int a,int b) {
			//Formula:-A/B
			System.out.println("Division of Two Numbers is: "+(a/b));
		}
		
	//Remainder
		void remainder(int a,int b) {
			//Formula:-A%B
			System.out.println("Remainder of two numbers is: "+(a%b));
		}
		
	//Cube
		void cube(int a)
		{
			//Formula:-A*A*A
			System.out.println("Cube of a number is: "+a*a*a);
		}
		
	//Circle Area
		void circlearea(int a)
		{
			// Formula:-π × radius × radius Take π as 3.14
			double b=3.14;
			System.out.println("Circle Area of two numbers is: "+(b*a*a));
		}
		
	 //Triangle Area
		void trianglearea(int a, int b)
		{
			//Formula:-(base × height) / 2			
			System.out.println("Triangle Area for given is: "+(a*b)/2);
		}
		
	//Simple Interest
		void simpleinterest(int a,int b,int c)
		{
			//Formula:-(principal × rate × time) / 100
			System.out.println("Simple Interest is: "+(a*b*c)/100);
		}
	public static void main(String[] args) {
		MethodsDemo m=new MethodsDemo();
		m.addition(10, 10);
		m.subtraction(50, 30);
		m.multiplication(5, 3);
		m.calculateSquare(5);
		m.rectanglearea(50, 60);
		m.division(20, 5);
		m.remainder(17, 5);
		m.cube(4);
		m.circlearea(5);
		m.trianglearea(5, 7);
		m.simpleinterest(50, 100, 150);
	}
}

/*
output:-
Addition of two numbers is: 20
Subtraction of two numbers is: 20
Multiplication of two numbers is: 15
Square of a numbers is: 25
Rectangle Area is: 3000
Division of Two Numbers is: 4
Remainder of two numbers is: 2
Cube of a number is: 64
Circle Area of two numbers is: 78.5
Triangle Area for given is: 17
Simple Interest is: 7500
*/