//Date:-25-08-2026
//This Program is With Return Type + With Parameters
/*Simple Interest Calculator

Calculate Simple Interest using P, R, and T.
Calculate the final amount.
Use methods with parameters and return types.

Simple Interest Calculator:-

Simple Interest
SI = (P × R × T) / 100

Where:
P = Principal
R = Rate of Interest
T = Time

Final Amount
Amount = P + SI
*/
package com.languagefundamentals;
import java.util.Scanner;
public class WithReturnTypeWithParametersDemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		WithReturnTypeWithParametersDemo1 w=new WithReturnTypeWithParametersDemo1();
		System.out.println("Main Method Started");
		System.out.println("Enter Principal: ");
		float principal=sc.nextFloat();
		
		System.out.println("Enter Rate Of Interest: ");
		float rateofinterest=sc.nextFloat();
		
		System.out.println("Enter Time: ");
		float time=sc.nextFloat();
		
		float si=w.SimpleInterestCalculator(principal,rateofinterest,time);
		System.out.println("Simple Interest Is: "+si);
		float amount=w.amount(principal,si);
		System.out.println("Final Amount is: "+amount);
	}
	
	float amount(float principal,float si) {
		float am=principal+si;
		return am;
	}
	
	 float SimpleInterestCalculator(float principal,float ratefofinterest,float time) {
		float si=principal*ratefofinterest*time/100;
		return si;
	}
}