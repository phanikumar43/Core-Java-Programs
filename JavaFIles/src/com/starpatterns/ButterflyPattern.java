package com.starpatterns;

/*
*        *
**      **
***    *** 
****  ****
**********
****  ****
***    ***
**      ** 
*        *
 */
public class ButterflyPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 12 - (2 * i); k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		}
	}

