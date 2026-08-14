package com.javafiles;

class A1 {
	B b;
}

class B1  {
	A a;
}

public class GC2 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
		A1 obj1 = new A1();
		B1 obj2 = new B1();

		obj1=null;
		obj2=null;
		
		System.gc();
		
	}

}
