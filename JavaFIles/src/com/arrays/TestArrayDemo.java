//Date:-22-09-2026
//Class Experiment
//Write a Program to find total & Average Marks of a student
package com.arrays;

public class TestArrayDemo {

	public static void main(String[] args) {
		int[] arr= {99,98,97,96,95};
		int total=0;
		int avg=0;
		//We have 2 methods		
		//1)For Loop
		/*for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		*/
//		2)For-Each Loop
		for(int a:arr) {
			//total+=a;
			total=total+a;
		}
		avg=total/arr.length;
		System.out.println("Total Marks is: "+total);
		System.out.println("Avergage Marks is: "+avg);
	}

}
