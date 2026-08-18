//Date:-17-08-2026
package com.languagefundamentals;
import java.util.Scanner;
public class MethodsDemo1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student id: ");
	int sid=sc.nextInt();
	
	System.out.println("Enter Student Name: ");
	String name=sc.next();
	
	System.out.println("Enter Age: ");
	int age=sc.nextInt();
	
	studentinfo(sid,name,age);
	}
	static void studentinfo(int sid,String name,int age) {
		System.out.println("Welcome to Student Details ");
		System.out.println("Roll Number is: "+sid);
		System.out.println("Student Name is: "+name);
		System.out.println("Age is :"+age);
		

	}

}
/*
Output:-
Enter Student id: 
1
Enter Student Name: 
phani
Enter Age: 
21
Welcome to Student Details 
Roll Number is: 1
Student Name is: phani
Age is :21
*/