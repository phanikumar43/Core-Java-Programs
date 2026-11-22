package com.exceptionHandling;

// Arithmetic Exception
import java.util.Scanner;

public class LabTask1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter b Number: ");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		sc.close();
	}

}
