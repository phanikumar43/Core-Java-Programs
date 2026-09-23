//Date:-23-09-2026
//Lab Experiment
/*
2. Write a Java program 
To complete below requirement:-
int arr[] = {36,45,78,66,99}
Output:- 40 40 80 70 100
 */
package com.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr[] = {36,45,78,66,99};
		for(int i=0;i<arr.length;i++) {
			int a=arr[i]%10;
			if(a<=5) {
				arr[i]=arr[i]-a;
			}else {
				arr[i]=arr[i]+(10-a);
			}
			System.out.println(arr[i]);
		}
	}

}
