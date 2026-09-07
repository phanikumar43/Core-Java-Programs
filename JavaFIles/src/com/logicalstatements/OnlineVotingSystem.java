//Date:-07-09-2026

//Lab Experiment

/*
 * Write a Java Program to complete below requirements
 * Create a Class with name Online Voting System
 *
 * Program should ask user age, gender, voterIdNo
 *
 * Conditions:
 * If age is less than 18 display "Not Eligible"
 *
 * If eligible then only ask about gender
 *
 * If gender is not M or F display "Not Eligible"
 *
 * If eligible then ask VoterId No
 *
 * Display 4 candidate options
 *
 * If user chooses any option display vote captured message
 *
 * If user chooses different option, display NOTA
 */

package com.logicalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to Online Voting System....");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        // Age checking
        if (age >= 18) {

            System.out.println("You Are Eligible");
            System.out.println("Continue to the next Process...");

            // Gender input
            System.out.println("Enter Your Gender (M/F): ");
            char gender = sc.next().charAt(0);

            // Gender checking
            if (gender == 'm' || gender == 'f') {

                System.out.println("Your Gender is: " + gender);
                System.out.println("Gender is Eligible");

                // Voter ID
                System.out.println("Enter Your Voter Id Number: ");
                int voterIdNumber = sc.nextInt();

                // Candidate selection
                switch (voterIdNumber) {

                case 1 -> {
                    System.out.println("Vote is Captured for Nani");
                }

                case 2 -> {
                    System.out.println("Vote is Captured for Phani");
                }

                case 3 -> {
                    System.out.println("Vote is Captured for Kumar");
                }

                case 4 -> {
                    System.out.println("Vote is Captured for Sharma");
                }

                default -> {
                    System.out.println("Thanks for Voting To NOTA");
                }
                }

                System.out.println("Thank You For Voting In Online Voting System...");

            } else {

                System.out.println("You Are Not Eligible");
                System.out.println("Invalid Gender. Please Enter M or F.");

            }

        } else {

            System.out.println("You Are Not Eligible");
            System.out.println("Age Must Be 18 Or Above.");

        }

        sc.close();
    }
}