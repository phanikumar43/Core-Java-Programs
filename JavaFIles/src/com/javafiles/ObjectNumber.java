//Date:-22-07-2026
//Object count own program
package com.javafiles;

public class ObjectNumber {
	static int n=0;
	{
		n=n+1;
		System.out.println("Object " +n+" Created");
	}
	public static void main(String[] args) {
		ObjectNumber on=new ObjectNumber();
		ObjectNumber on1=new ObjectNumber();
		ObjectNumber on2=new ObjectNumber();
		ObjectNumber on3=new ObjectNumber();
		ObjectNumber on4=new ObjectNumber();
	}

}

/*
 Output:-
 Object 1 Created
Object 2 Created
Object 3 Created
Object 4 Created
Object 5 Created
 */