//Date:-22-07-2026
//Lab Experiment
/*
 * Java :- Write a Java Program to Complete Below requirements 
a) take 4 methods 4instance methods do not create any object in main and also in class level not in any method but when we execute the class all the data should print automatically 
 */
package com.javafiles;

public class Demo4 {
	void method1() {
		System.out.println("Method 1 called");
		method2();
	}
	
	void method2() {
		System.out.println("Method 2 called");
		method3();
	}
	
	void method3() {
		System.out.println("Method 3 called");
		method4();
	}
	
	void method4() {
		System.out.println("Method 4 called");
	}
	
	static {
		Demo4 d=new Demo4();
		d.method1();
	}
	
	public static void main(String[] args) {

	}

}

/*
 * 
 Output:-
 Method 1 called
Method 2 called
Method 3 called
Method 4 called
 */