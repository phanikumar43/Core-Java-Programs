//Date:-02-09-2026
//Lab Experiment
/*
 Create a Java program to Assign the Grade Based on the Student marks as Mentioned below
100 to 91 -> S Grade
90 to 81 -> A Grade
80 to 71 -> B Grade 
51 to 70 -> C Grade
41 to 50 -> D Grade
35 to 40 -> E Grade
0 to 34 -> Failed

Less than 0 or Greater Than 100 -> Invalid Marks
Using Ternary Operator
 */
package com.operators;

import java.util.Scanner;

public class TernaryOperators1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Marks: ");
		int marks=sc.nextInt();
		String marks1=(marks < 0 || marks > 100) ? "Invalid marks" :
            (marks >= 91) ? "S Grade" :
            (marks >= 81) ? "A Grade" :
            (marks >= 71) ? "B Grade" :
            (marks >= 51) ? "C Grade" :
            (marks >= 41) ? "D Grade" :
            (marks >= 35) ? "E Grade" : "Failed";
		System.out.println("Student Result is: "+marks1);
		sc.close();
	}
}
