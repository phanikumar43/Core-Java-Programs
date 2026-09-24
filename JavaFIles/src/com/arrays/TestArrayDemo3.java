//Date:-24-09-2026
//Class Program
//Write a Program to find the minimum and maximum number of an array
package com.arrays;

public class TestArrayDemo3 {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 15, 9, 7 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum Number is: " + min);
		System.out.println("Maximum Number is: " + max);
	}

}
