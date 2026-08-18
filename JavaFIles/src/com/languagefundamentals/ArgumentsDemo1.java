//Date:-17-08-2026
//Lab Program
//The program is With Return type
package com.languagefundamentals;

public class ArgumentsDemo1 {
	static int Addition(int a, int b) {
		int add;
		add = a + b;
		System.out.println("Addition of two numbers is: "+add);
		return add;
	}

	static int Subtraction(int a, int b) {
		int sub;
		sub = a - b;
		System.out.println("Subtraction of two numbers is: " + sub);
		return sub;
	}

	static int Multiplication(int a, int b) {
		int mul;
		mul=a*b;
		System.out.println("Multiplication of two numbers is: " + mul);
		return mul;
	}

	static int Division(int a,int b) {
		int div;
		div=a/b;
		System.out.println("Division of two numbers is: "+div);
		return div;
	}
	
	static int ModularDivision(int div,int b) {
		int mod;
		mod=div%b;
		System.out.println("Modular Division of two numbers is: "+mod);
		return mod;
	}
	public static void main(String[] args) {
		ArgumentsDemo1 a1=new ArgumentsDemo1();
		a1.Addition(5, 5);
		a1.Subtraction(5,4);
		a1.Multiplication(5, 5);
		a1.Division(10, 5);
		a1.ModularDivision(10, 6);
	}

}
