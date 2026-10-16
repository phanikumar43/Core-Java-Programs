package com.weeklyTests;

/*
public class Test26_09_2026 {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 22, 31, 40, 55 };
		int even = 0, odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Even Count = " + even);
		System.out.println("Odd Count = " + odd);
	}
}
*/

/*
public class Test26_09_2026{
	public static void main(String[] args) {
		int[] arr= {2,0,4,1,3};
		for(int i=0;i<arr.length;i++) {
			if(arr[arr[i]]>2) {
				System.out.println(arr[i]+" ");
			}
		}
	}
}
*/

/*
public class Test26_09_2026 {
	public static void main(String[] args) {
		int[] arr = { 25, 10, 45, 30, 15 };
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (m > arr[i]) {
				m = arr[i];
			}
		}
		System.out.println("Result = " + m);
	}
}
*/

/*
public class Test26_09_2026 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		arr[0] = arr[arr[0]];
		System.out.println(arr[0]);
	}
}
*/

/*
public class Test26_09_2026 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int temp = arr[arr[0]];
		arr[arr[0]] = arr[0];
		arr[0] = temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
*/