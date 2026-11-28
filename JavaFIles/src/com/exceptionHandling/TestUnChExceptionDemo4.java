package com.exceptionHandling;

public class TestUnChExceptionDemo4 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");

		int[] arr = new int[4];

		try {
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}

		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println("Main Method Ended");
	}
}