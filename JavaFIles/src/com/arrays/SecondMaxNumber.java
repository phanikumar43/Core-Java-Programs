//Date:-23-09-2026
//Lab Experiment
//1. Write a Java Program to find the Second max of given array 
package com.arrays;

public class SecondMaxNumber {

	public static void main(String[] args) {
		int[] arr = { 15, 16, 17, 10, 9, 7 };
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
			second_max = max;
			max = arr[i];
		}
		}
		System.out.println("Maximum Number is: " + max);
		System.out.println("Second Maximum Number is: " + second_max);
	}

}