package com.exceptionHandling;

public class TestUncheckExceptionDemo3 {

	public static void main(String[] args) {
		try {
			String s1 = "Java";
			System.out.println(s1.length());

			String s4 = null;
			// null . any operation is NPE
			System.out.println(s4.length());// NullPointerException
		} catch (Exception e) {
			System.err.println("In Catch !!");
//			e.printStackTrace(); // Name + Description + Location
//			System.err.println(e.getMessage()); // Description
//			System.out.println(e.toString()); // Name + Description
			System.out.println(e); // Name + Description
		}

		String s2 = "Nani";
		System.out.println(s2.charAt(2));

		String s3 = "null";
		System.out.println(s3.length());

	}
}
