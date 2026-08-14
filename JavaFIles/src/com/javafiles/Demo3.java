//Date:-21-07-2026
//Lab Experiment
/*1. Write a Java Program To Complete Below Requirements 

a) take 4 methods 2 static and 2 instance 

For every method perform different arithmetic operation 
Ex :- if method name is addition add two numbers inside the method and print 

b) call only one method in main but all the statements from each method should automatically display in output 
*/
/*
 * 
 */
package com.javafiles;

public class Demo3 {
	
	//static Demo3 d=new Demo3();
	//	static block
	static void Addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition is: "+c);
		subtraction();
	}

	//	static block	
	static void subtraction(){
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("Subtraction is: "+c);
		d.multiplication();
	}
	
	
	static Demo3 d=new Demo3();
//Instance block	
	void multiplication(){
		int a=10;
		int b=20;
		int c=a*b;
		Demo3 d=new Demo3();
		System.out.println("Multiplication is: "+c);
		d.division();
	}
	
	void division(){
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println("Division is: "+c);
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Addition();
	}

}


/*
output:-
Main Method Started
Addition is: 30
Subtraction is: -10
Multiplication is: 200
Division is: 0
*/