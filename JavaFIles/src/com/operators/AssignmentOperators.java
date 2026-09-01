//Date:-29-08-2026
//Class Program
/*This Program is for Assignment Operators. Assignment Operators can be categorized into
	- Assignment operator (=) --> Assigns a Value 
	- Addition Assignment (+=) --> Add and Assign
	- Subtraction Assignment (-=) --> Subtract and Assign
	- Multiplication Assignment (*=) --> Multiply and Assign
	- Division Assignment (/=) --> Divide and Assign
	- Modulus Assignment (%=) --> Remainder and Assign
*/
package com.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		double a = 10; //Assignment Operator
				
		// Addition Assignment (+=)
		System.out.println("A is: " + a);
		a += 4.5; // a=a+4.5
		System.out.println("Addition (Sum) Result is: " + a);
		System.out.println("---------------------------------------------------");

		// Subtraction Assignment (-=)
		System.out.println("A is: " + a);
		a -= 7.4; // a=a-7.4
		System.out.println("Subtraction (Difference) Result is: " + a);
		System.out.println("---------------------------------------------------");

		// Multiplication Assignment (*=)
		System.out.println("A is: " + a);
		a *= 5.4; // a=a*5.4
		System.out.println("Multiplication (Product) Result is: " + a);
		System.out.println("---------------------------------------------------");

		// Division Assignment (/=)
		System.out.println("A is: " + a);
		a /= 2.4; // a=a/2.4
		System.out.println("Division (Quotient) Result is: " + a);
		System.out.println("---------------------------------------------------");

		// Modulus Assignment (%=)
		System.out.println("A is: " + a);
		a %= 3.4; // a=a%3.4
		System.out.println("Modulus Division (Remainder) Result is: " + a);
		System.out.println("---------------------------------------------------");
	}
}

/*
Output:-
A is: 10.0
Addition (Sum) Result is: 14.5
---------------------------------------------------
A is: 14.5
Subtraction (Difference) Result is: 7.1
---------------------------------------------------
A is: 7.1
Multiplication (Product) Result is: 38.34
---------------------------------------------------
A is: 38.34
Division (Quotient) Result is: 15.975000000000001
---------------------------------------------------
A is: 15.975000000000001
Modulus Division (Remainder) Result is: 2.3750000000000018
---------------------------------------------------
*/