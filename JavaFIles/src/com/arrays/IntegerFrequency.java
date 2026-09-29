//Date:-28-09-2026
//Lab Experiment
//Write a Java Program find the frequency of Integers in given array 
package com.arrays;

public class IntegerFrequency {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 10, 20, 30, 40, 50 };
		boolean arr1[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr1[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr1[j] = true;
				}
			}
			System.out.println(arr[i] + " count = " + count);
		}
	}
}