package com.RevisionClasses;

import java.util.Scanner;

// With Return Type + No Parameters
public class EmployeeSalinfo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");

		EmployeeSalinfo es = new EmployeeSalinfo();

		double sal = es.employeeSalary();
		double bonus = es.employeeBonus();

		System.out.println("Total Salary is: " + (sal + bonus));

		System.out.println("Main Method Ended !!");
	}

	double employeeSalary() {
		System.out.println("Employee Salary is: ");
		double sal = sc.nextDouble();
		return sal;
	}

	double employeeBonus() {
		System.out.println("Enter Bonus: ");
		double bonus = sc.nextDouble();
		return bonus;
	}
}