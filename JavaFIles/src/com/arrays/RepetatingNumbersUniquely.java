//Date:-24-09-2026
//Lab Experiment
//1. Write a Java Program to display the repeating numbers uniquely numbers from an array 
package com.arrays;

public class RepetatingNumbersUniquely {

	public static void main(String[] args) {
		int arr[] = { 25, 20, 45, 20, 45, 30, 29 };
		boolean b[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(b[i]) {
				continue;
			}
			boolean check=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					b[j]=true;
					check=true;
				}
			}
			if(check) {
				System.out.println(arr[i]);
			}
		}
	}
}
