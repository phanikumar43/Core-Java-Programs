
package com.exceptionHandling;

import java.util.Scanner;

public class TestUnChExceptionDemo5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a Number: ");
			int a = sc.nextInt();

			System.out.println("Enter b Number: ");
			int b = sc.nextInt();

//          System.out.println("Welcome");
			int c = a / b;

			System.out.println("Welcome");

			System.out.println("Enter a Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println(name.charAt(c));

		} catch (Exception se) {
			System.err.println("In E");
		}
//      catch(Exception | ArithmeticException | StringIndexOutOfBoundsException | InputMismatchException ar) {
		//// System.out.println(); / }
		// When you keep Exception Catch on the top, we will get below CE
		// Unreachable catch block for ArithmeticException.
		// It is already handled by the catch block for Exception
//      }catch(ArithmeticException ar) {
//          System.err.println("In AE Block");
//      } catch(StringIndexOutOfBoundsException se) {
//          System.err.println("In SIE Block");
//      }
		System.out.println("Main Method Ended");
	}
}
