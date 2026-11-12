package com.oops;

import java.util.Arrays;

public class ArrayRotation {
	
	//This method requires a body instead of a semicolon
	//void hello();
	
	public static void main(String[] args) {
		
		Object arr[] = { 10, new Object[] { 10, 20, 30 }, 20, new Object[] { 40, 50, 60 }, 70 };
		// Step 1: Reverse the outer array
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			Object temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		// Step 2: Reverse each nested array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Object[]) {
				Object[] arr1 = (Object[]) arr[i];
				int l = 0;
				int r = arr1.length - 1;
				while (l < r) {
					Object temp1 = arr1[l];
					arr1[l] = arr1[r];
					arr1[r] = temp1;
					l++;
					r--;
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
