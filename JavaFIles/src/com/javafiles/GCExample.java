//Date:-22-07-2026
/*Create 5 objects instead of 3.
✅ Make only one object null. Does finalize() run once?
✅ Remove System.gc(). What happens?
✅ Make all objects null. Observe the output.
✅ Keep one object referenced and make the others null. Which objects become eligible for garbage collection?*/
package com.javafiles;

public class GCExample {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method started");
	}

	public static void main(String[] args) {

		// Object 1
		GCExample gc = new GCExample();
		System.out.println(gc);

		// Object 2
		GCExample gc1 = new GCExample();
		System.out.println(gc1);

		// Object 3
		GCExample gc2 = new GCExample();
		System.out.println(gc2);

		// Object 4
		GCExample gc3 = new GCExample();
		System.out.println(gc3);

		// Object 5
		GCExample gc4 = new GCExample();
		System.out.println(gc4);

		// make object 1 gc as null
		gc = null;
		//gc1 = null;
		gc2 = null;
		gc3 = null;
		gc4 = null;

		System.out.println(gc);
		System.gc();
	}

}
