 // Date:-14-07-2026 

package com.javafiles;

public class TestDemo1 {
	
	static int a=10; 
	
	static {
		System.out.println("Static block 1");
	}

	public static void main(String[] args) {
		System.out.println("main method started" +a);
	}
	
	static {
		System.out.println("Static Block 2");
	}

}
