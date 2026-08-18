//Date:-18-08-2026
/*Student Pass/Fail
Method receives marks. If marks ≥ 40 → Pass, otherwise → Fail.
*/
package com.languagefundamentals;
import java.util.Scanner;
public class MethodsDemo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks=sc.nextInt();
		
		if(marks>=40) {
			System.out.println("You are Pass");
		}
		else {
			System.out.println("You are failed..Better luck next Time");
		}
	}

}

