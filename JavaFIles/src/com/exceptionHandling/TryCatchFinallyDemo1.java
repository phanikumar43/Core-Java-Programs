package com.exceptionHandling;

public class TryCatchFinallyDemo1 {

	public static void main(String[] args) {
		try {
			System.out.println("In Try Block");
//			System.out.println(10/0);
//			System.out.println(10.0/0.0); //Infinity
//			System.out.println(0.0/0.0); //Nan 
//			System.out.println(0/0.0); // Nan
			System.out.println(10/0.0); //Infinity
		}catch(Exception e){
			System.out.println("In Catch Block");
			System.out.println(e);
			System.out.println(e.getMessage());
		}finally {
			System.out.println("In Finally Block");
		}
	}

}
