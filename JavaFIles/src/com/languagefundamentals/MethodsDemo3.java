//Date:-17-08-2026
//Methods Program
/*Student pass/fail

Create a method:

checkResult(int marks)

Condition:

marks >= 40
      ↓
   PASS

marks < 40
      ↓
   FAIL

Call it from main() after taking the student's marks.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class MethodsDemo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks=sc.nextInt();
		if(marks>=40) {
			System.out.println("You are Passed");
		}
		else if(marks<40) {
			System.out.println("You are failed");
		}
	}
}

/*
Output:-
Enter the marks: 
40
You are Passed

Enter the marks: 
20
You are failed
*/