//Date:-16-07-2026

package com.javafiles;

public class Demo {
 // instance method
	void hello(){
		System.out.println("This is instance method");
	}
	
// static method
	static void use(){
		System.out.println("This is static main method");
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
//		calling static method
		use();
//		calling instance method
		Demo d=new Demo();
		d.hello();
	}

}