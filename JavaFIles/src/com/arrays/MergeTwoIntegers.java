//Date:-29-09-2026
//Lab Experiment
/*
2. Write a Java Program to Merge the two integer Arrays Using Third Array establish the dynamic behaviour. input :- int[] A={1,2,3,4};
int[] B=(5,6,7);
output: - [1,2,3,4,5,6,7]
 */
package com.arrays;

public class MergeTwoIntegers {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4};
		int b1[]= {5,6,7};
		int c1[]= {a1.length+b1.length};
		
		for(int i=0;i<a1.length;i++) {
			c1[i]=a1[i];
		}
		for(int j=0;j<b1.length;j++) {
			c1[a1.length+j]=b1[j];
		}
	}
}
