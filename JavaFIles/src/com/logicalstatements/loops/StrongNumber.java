//Date:-11-09-2026
//Lab Experiment
//1.Write a Java Program To Find the Given Number is Strong Number or Not ???
package com.logicalstatements.loops;

import java.util.Scanner;

public class StrongNumber {

    static void strongProgram(int n) {

        int original = n;
        int digit;
        int sum = 0;
        for (; n > 0; n = n / 10) {
            digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
        }
        if (sum == original) {
            System.out.println("It is a Strong Number: "+sum);
        } else {
            System.out.println("It is Not a Strong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Proceed...");
        int n = sc.nextInt();
        strongProgram(n);
        sc.close();
    }
}