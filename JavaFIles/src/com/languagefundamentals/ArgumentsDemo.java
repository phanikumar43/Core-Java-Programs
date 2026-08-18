//Date:-17-08-2026
//Lab Program
/*
1. Write a Java Program to Complete below Requirements:-

 > Take 4 instance methods as addition,substraction , multiplication, division with two parameters in each method 

 > call the only one method in main and pass two arguments that match method signature and perform arithmetic operation with arguments and print the result 

 > result value  of each method should be first argument of next method we call 

 > at last execute the program and display the results 

note :- we only pass two values for one method we initially call ,for remaining methods we only pass single value by ourselves, next argument will the result of previous method 
*/

//The program is Without Return Type
package com.languagefundamentals;

public class ArgumentsDemo {
	void Addition(int a, int b) {
		int add;
		add = a + b;
		System.out.println("Addition Of Two Numbers is: " + add);
		Subtraction(add, 4);
	}

	void Subtraction(int add, int b) {
		int sub;
		sub = add - b;
		System.out.println("Subtraction of two numbers is: " + sub);
		Multiplication(sub, 5);
	}

	void Multiplication(int sub, int b) {
		int mul;
		mul = sub * b;
		System.out.println("Multiplication of two numbers is: " + mul);
		Division(mul,5);
	}

	void Division(int mul,int b) {
		int div;
		div=mul/b;
		System.out.println("Division of two numbers is: "+div);
		ModularDivision(mul,3);
	}
	
	void ModularDivision(int div,int b) {
		int mod;
		mod=div%b;
		System.out.println("Modular Division of two numbers is: "+mod);
	}
	public static void main(String[] args) {
		ArgumentsDemo a = new ArgumentsDemo();
		a.Addition(5, 5);
	}
}

/*
Output:-
Addition Of Two Numbers is: 10
Subtraction of two numbers is: 6
Multiplication of two numbers is: 30
Division of two numbers is: 6
Modular Division of two numbers is: 0
*/