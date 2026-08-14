//Date:-23-07-2026
//Class program
//To understand circular references and when objects become eligible for Garbage Collection.
package com.javafiles;
class A {
	   B b;
	}

	class B {
	   A a;
	}
public class GCExample1 {

	public static void main(String[] args) {
		  A obj1 = new A();
	       B obj2 = new B();

	       obj1.b = obj2;
	       obj2.a = obj1;

	       obj1 = null;
	       obj2 = null;

	}

}
