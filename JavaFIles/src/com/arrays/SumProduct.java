//Date:-22-09-2026
//Lab Experiment
//Declare an integer array and find the sum of total integers , product of all 
package com.arrays;

public class SumProduct {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int sum=0;
		int product=1;
		
		for(int a:arr) {
			//sum=sum+a;
			sum+=a;
			//product=product*a;			
			product*=a;
		}
		System.out.println("Sum of all Numbers is: "+sum);
		System.out.println("Product of a number is: "+product);
	}

}
