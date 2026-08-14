//Date:-27-07-2026
/*Java :-Write a Java Program to mention how many ways to call garbage collector and nullify the object
 There are 5 types to call garbage collection in java
 1)Nullify the object
 2)Re-Assigning the object
 3)Out of scope
 4)Anonymous object
 5)Island of Isolation
*/
package com.javafiles;
//Creating 2 classes for island of isolation method
class A2{
	B b;
}
class B2{
	A a;
}
public class GcLabProgram {
	void display()
	{
		GcLabProgram gc1=new GcLabProgram();
		GcLabProgram gc2=new GcLabProgram();
		System.out.println("Inside Display()");
		}
	public static void main(String[] args) {
		// method 1:-Nullify the object
		// we can nullify an object by calling with our object reference variable=null;
		GcLabProgram g = new GcLabProgram();
		System.out.println(g);
		g = null;

		// Method 2:re-assigning the object
		// we can re-assigning an object by mentioning our new class name=our previous
		// old class name
		GcLabProgram g1 = new GcLabProgram();
		g1 = g;
		System.out.println(g1);

		// Method 3:-Out of scope
		//Out of scope is a situation where a local reference variable is destroyed after the method ends, making its object eligible for garbage collection.
		GcLabProgram g3=new GcLabProgram();
		g3.display();
		System.out.println(g3);
		
		//Method 4:-Anonymous Object
		//Anonymous object means we can create an object without any object reference is known as anonymous object
		new GcLabProgram();
		
		//Method 5:-Island Of Isolation
		//Assigning objects for the top classes		
		A2 a1=new A2();
		B2 b1=new B2();

//		a1.b=b1;
//		b1.a=a1;
		
		a1=null;
		b1=null;
		
	}

}
