//Date:18-08-2026
/*Check Zero
Method receives a number and displays whether it is positive, negative, or zero.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class MethodsDemo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		if(number>0) {
			System.out.println("It is positive");
		}
		 if(number<0)
		{
			System.out.println("It is negative");
		}
		if(number==0) {
			System.out.println("It is zero");
		}
	}

}
