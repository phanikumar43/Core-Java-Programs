package com.exceptionHandling;

public class TestUnChDemo2 {

	public static void main(String[] args) {
		System.out.println("Main Method Ended");

		try {
			System.out.println("In Try Block");
			System.out.println(10 / 0);
			System.out.println("Good Day");
			//No exception of type Object can be thrown;
			//an exception type must be a subclass of Throwable
		} catch (Throwable e) {
			System.err.println("In Catch Block");
		}

		System.out.println("Main Method Ended");
	}

}
