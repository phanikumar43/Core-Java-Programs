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
public class MethodsDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Maths Marks: ");
		int m=sc.nextInt();
		
		System.out.println("Enter Science Marks: ");
		int s=sc.nextInt();
		
		System.out.println("Enter English Marks: ");
		int e=sc.nextInt();
		
		studentMarks(m,s,e);
	}
		static void studentMarks(int m, int s, int e) {
			System.out.println("Marks are given below: ");
			System.out.println("Maths Marks are: "+m);
			System.out.println("Science Marks are: "+s);
			System.out.println("English Marks are: "+m);
			System.out.println("Average of all 3 subjects are: "+(m+s+e)/3);
		}	
}

/*
Output:-
Enter Maths Marks: 
90
Enter Science Marks: 
95
Enter English Marks: 
97
Marks are given below: 
Maths Marks are: 90
Science Marks are: 95
English Marks are: 90
Average of all 3 subjects are: 94
*/