//Date:-18-08-2026
/*Check Positive/Negative
Method receives a number and determines whether it is positive or negative.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class MethidsDemo7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int number=sc.nextInt();
			if(number>0) {
				System.out.println("It is positive");
			}
			else
			{
				System.out.println("It is negative");
			}
		}

}

/*
Output:-
Enter A Number: 
5
It is positive

Enter A Number: 
-9
It is negative

*/