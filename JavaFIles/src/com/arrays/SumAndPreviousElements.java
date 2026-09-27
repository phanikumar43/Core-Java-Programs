//Date:-24-09-2026
//Lab Experiment
//write a Java program to print the sum of next and previous elements into current index using temporary array and handle the edge cases
package com.arrays;

public class SumAndPreviousElements {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int arr1[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr1[i] = arr[i];
			} else if (i == arr.length - 1) {
				arr1[i] = arr[i];
			} else {
				arr1[i] = arr[i - 1] + arr[i + 1];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}
	}
}