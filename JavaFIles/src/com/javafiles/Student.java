// Date:-14-07-2026

package com.javafiles;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException {
System.out.println("main method started !!");
		
		System.out.println(Class.forName("com.javafiles.HelloWorld"));
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));
		
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

	}

}

/* 
 output:-
 main method started !!
class com.javafiles.HelloWorld
class java.lang.String
class java.lang.System
class com.mysql.cj.jdbc.Driver
 */
