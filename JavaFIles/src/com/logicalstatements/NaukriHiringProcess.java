//Date:-02-09-2026
//Class Program
//Write a program for hiring process for employee
/*💼 Hiring Process Program Idea

Imagine a company receives a candidate's profile and checks the candidate step-by-step.

Step 1 — Candidate Details

Ask for:

Candidate name
Years of experience
Expected salary
Qualification
Step 2 — Basic Eligibility

Check whether:

Experience ≥ 1 year AND Expected Salary ≤ ₹8,00,000

If true → Continue to the next process.
If false → Profile is rejected.
Step 3 — Qualification

If the candidate passes the first condition, ask:

Are you a graduate?

true → Continue.
false → Profile is not eligible.
Step 4 — Technical Skills

Ask:

Do you have Java skills?

true → Continue.
false → Reject the profile.
Step 5 — Interview

Ask:

Did you clear the technical interview?

true → Continue to HR round.
false → Reject the candidate.
Step 6 — HR Round

Ask:

Did you clear the HR interview?

true → 🎉 Congratulations! You are selected.
false → Your profile was not selected.
*/
package com.logicalstatements;

import java.util.Scanner;

public class NaukriHiringProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step-1:- Candidate Details
		System.out.println("Please Enter Your Name: ");
		String name = sc.nextLine();

		System.out.println("Please Enter Your Years of Experience: ");
		int experience = sc.nextInt();

		System.out.println("Please Enter Your Expected Salary: ");
		int salary = sc.nextInt();

		if ((experience >= 0) && (salary <= 800000)) {
			System.out.println("Continue to The Next Process");
		}

		// Step-2:- Qualification
		System.out.println("Please Enter Your Qualification: ");
		String qualification = sc.next();

		if (qualification.equals("Graduate")) {
			System.out.println("Continue To The Next Step");
		} else {
			System.out.println("Your Profile is Rejected");
			System.out.println("Thank You For The Valuable Time");
			System.out.println(name);
		}

		// Step-4:-Technical Skills
		System.out.println("Do You Have Java Skills: ");
		boolean skills = sc.nextBoolean();

		if (skills) {
			System.out.println("Continue To The Next Process");
		} else {
			System.out.println("Your Profile is Rejected");
			System.out.println("Thank You For The Valuable Time");
			System.out.println(name);
		}

		// Step-5:-Interview
		System.out.println("Did You Clear The Technical Interview: ");
		boolean interview = sc.nextBoolean();

		if (interview) {
			System.out.println("Yes..Continue To The HR Round");
		} else {
			System.out.println("Your Profile is Rejected");
			System.out.println("Thank You For The Valuable Time");
			System.out.println(name);
		}

		// Step=6:-HR Round
		System.out.println("Did you clear the HR interview?: ");
		boolean HR = sc.nextBoolean();

		if (HR) {
			System.out.println("🎉 Congratulations! You are selected.");
		} else {
			System.out.println("Your Profile is Rejected");
			System.out.println("Thank You For The Valuable Time");
			System.out.println(name);
		}

	}

}
