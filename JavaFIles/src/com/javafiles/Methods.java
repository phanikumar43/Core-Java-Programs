//Date:-20-07-2026
//Lab Experiment

package com.javafiles;

public class Methods {
	
	 static Methods m=new Methods();
	static void method1(){
		method2();
		System.out.println("Method 1 Called");
	}
	
	static void method2(){
//		Methods m=new Methods();
		m.method3();
		System.out.println("Method 2 Called");
	}
	
	void method3(){
		method4();
		System.out.println("Method 3 Called");
	}
	
	void method4(){
		System.out.println("Method 4 Called");
	}

	public static void main(String[] args) {
		System.out.println("Main Method started");
		method1();
		System.out.println("main Method Ended");
	}

}


/*
 Output:-
 Main Method started
Method 4 Called
Method 3 Called
Method 2 Called
Method 1 Called
main Method Ended
*/