//Sate:-18-08-2026
/*Find Bigger Number
Method receives two numbers and displays the larger number.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class MethodsDemo9 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int a=sc.nextInt();
	
	System.out.println("Enter a Number: ");
	int b=sc.nextInt();
	
	if(a>b) {
		System.out.println("A is Big");
	}
	else {
		System.out.println("B is Big");
	}
	}

}
