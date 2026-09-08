//Date:-07-09-2026
//Case Study

/*
Create a Java program that simulates an Online Hospital Appointment Booking System
using methods, if-else, and nested if conditions.

Ask the patient to enter:

➤ Age

➤ Patient Type(1. Regular, 2. Emergency)

➤ Appointment Availability (1. Available, 2. Not Available)

Conditions:-

If age 0-Display "Invalid Age".

If age 18-Check the patient type.

If patient type is 1 (Regular)

Check appointment availability.

➤ If availability is 1 → "Regular Appointment Confirmed"

➤ If availability is 2 → "Please Select Another Slot"

➤ If patient type is 2 (Emergency)

Check appointment availability.

➤ If availability is 1 → "Emergency Appointment Confirmed"

➤ If availability is 2 → "Emergency Slot Not Available"

If patient type is neither 1 nor 2 → Display "Invalid Patient Type"
*/

package com.casestudy;

import java.util.Scanner;

public class OnlineHospitalManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age >= 0) {
            System.out.println("Eligible");
            System.out.println("Continue The Next Process");
            System.out.println("Enter Patient Type: ");
            System.out.println("1. Regular");
            System.out.println("2. Emergency");
            int patientType = sc.nextInt();
            if (patientType == 1) {
                System.out.println("Enter the Appointment Availability: ");
                System.out.println("1. Available");
                System.out.println("2. Not Available");
                int availability = sc.nextInt();
                if (availability == 1) {
                    System.out.println("Regular Appointment Confirmed");
                } else if (availability == 2) {
                    System.out.println("Please Select Another Slot");
                } else {
                    System.out.println("Invalid Appointment Availability");
                }
            } else if (patientType == 2) {
                System.out.println("Enter the Appointment Availability: ");
                System.out.println("1. Available");
                System.out.println("2. Not Available");
                int availability = sc.nextInt();
                if (availability == 1) {
                    System.out.println("Emergency Appointment Confirmed");
                } else if (availability == 2) {
                    System.out.println("Emergency Slot Not Available");
                } else {
                    System.out.println("Invalid Appointment Availability");
                }
            } else {
                System.out.println("Invalid Patient Type");
            }
        }
        sc.close();
    }
}