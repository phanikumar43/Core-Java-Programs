//Date:-18-08-2026
/*Check Age
Method receives age and displays whether the person is eligible to vote.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class MethodsDemo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligible for vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
	}

}
