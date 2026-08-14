//Date:-22-07-2026
//Class topic
//Garbage Collection Program

package com.javafiles;

public class GarbageCollection {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

	public static void main(String[] args) {
		GarbageCollection gc=new GarbageCollection();
		// O/P:-com.javafiles.GarbageCollection@1dbd16a6
		System.out.println(gc);
//		System.out.println(gc.hashCode());
		
		GarbageCollection gc1=new GarbageCollection();
		System.out.println(gc1);
		
		GarbageCollection gc2=new GarbageCollection();
		System.out.println(gc2);
		
		gc=null;
		gc1=null;
		
		System.gc();
	}
	
//	{
//	int a=0x1dbd16a6;
//	System.out.println(a);
//	}
}
