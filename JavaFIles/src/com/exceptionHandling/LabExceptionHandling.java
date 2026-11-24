//Date:-24-11-2026
//Lab Task
/*
Java Assignment

1.Write a Java program to handle the following situations using separate try-catch blocks:
->Calculate the average of students' marks when the total count is zero.
->Access a student record using an invalid array index.
->Access an invalid character position in a username.
->Access a student's name when the name is null.
->Enter a string instead of an integer for student marks.

Requirement:Handle all five situations in a single Java program.
 */
package com.exceptionHandling;

public class LabExceptionHandling {

	public static void main(String[] args) {
		//Calculate the average of students' marks when the total count is zero.
		//Arithmetic Exception
		try {
			int sum=0;
			int count=0;
			int total=sum/count;
			System.out.println("Total is: "+total);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Access a student record using an invalid array index.
		//ArrayIndexOutOfBondsException
		try {
			String arr[]= {"Nani","Phani","Kumar"};
			System.out.println(arr[5]);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//->Access an invalid character position in a username.
		//StringIndexOutOfBoundsException
		try {
			String s1="Phani";
			System.out.println(s1.charAt(10));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Access a student's name when the name is null
		//NullPointerException
		try {
			String s=null;
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//Enter a string instead of an integer for student marks.
		try {
			String num="one";
			System.out.println(Integer.parseInt(num));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
