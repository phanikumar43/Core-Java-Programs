//Date:-11-08-2026
//Class Experiment
package com.languagefundamentals;

public class Literals1 {

	public static void main(String[] args) {
//		These are Decimal Literals
//	It base is 10 that is 0 to 0
		int a=10;
		int a1=123;
		int a2=678;
		int a3=0123;
		System.out.println(a);//10
		System.out.println(a1);//123
		System.out.println(a2);//678
		System.out.println(a3);//83
//		----------------------------------------
//		These are octal literals
//		its base is 8 that is 0 to 7
		int a4=04761;
		int a5=0657;
		int a6=0767;
		System.out.println(a4);//2545
		System.out.println(a5);//431
		System.out.println(a6);//503
//		-------------------------------------------
//		These are binary Literals
//		Its base is 2 that is 0 & 1
		int a7=0x123;
		int a8=0xabc;
		int a9=0x1a2b;
		System.out.println(a7);//291
		System.out.println(a8);//2748
		System.out.println(a9);//6699
	}
}

/*
Output:-
10
123
678
83
2545
431
503
291
2748
6699
*/