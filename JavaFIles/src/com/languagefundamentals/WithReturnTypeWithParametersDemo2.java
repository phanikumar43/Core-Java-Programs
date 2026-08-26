//Date:-25-08-2026
//This Program is With Return Type + With Parameters
/*
 Temperature Converter

Convert Celsius to Fahrenheit.
Convert Fahrenheit to Celsius.
Each conversion should be performed using a separate method that accepts a parameter and returns the result.

 Temperature Converter
 
Celsius → Fahrenheit
F = (C × 9/5) + 32

Fahrenheit → Celsius
C = (F - 32) × 5/9
 */
package com.languagefundamentals;

import java.util.Scanner;

public class WithReturnTypeWithParametersDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WithReturnTypeWithParametersDemo2 w2 = new WithReturnTypeWithParametersDemo2();
		System.out.println("Enter Celsius: ");
		float celsius = sc.nextFloat();

		System.out.println("Enter Fahrenheit: ");
		float fahrenheit = sc.nextFloat();

		float tempcon = w2.celsiusFarenheit(celsius);
		System.out.println("Temperature from celsius to fahrenheit is: " + tempcon);

		float tempcon2 = w2.farenhitCelsius(fahrenheit);
		System.out.println("Temperature from fahrenhit to celsius is: " + tempcon2);
	}

	float celsiusFarenheit(float celsius) {
		float tc=(celsius*9/5)+32;
		return tc;
	}
		
	float farenhitCelsius(float fahrenhit) {
		float tc1=(fahrenhit-32)*5/9;
		return tc1;
	}
	
}