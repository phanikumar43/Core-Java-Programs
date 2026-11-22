package com.exceptionHandling;

public class ClassNotFoundDemo {

    public static void main(String[] args){
    	try {
    		Class.forName("LabTask1");
    	}
    	catch(Exception e) {
//    		e.printStackTrace();
    		System.out.println(e);
    	}
    }
}