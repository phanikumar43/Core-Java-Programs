package com.javafiles;

public class GC1 {
@Override
protected void finalize() throws Throwable {
	System.out.println("Finalize method 1");
}


	public static void main(String[] args) {
		GC1 gc=new GC1();
		System.gc();
		System.out.println(gc);
		
		GC1 gc1=new GC1();
		gc1=gc;
		System.gc();
		System.out.println(gc1);
		
		GC1 gc2=new GC1();
		gc1=gc;
		System.gc();
		System.out.println(gc2);
	}

}
