//Date:-31-08-2026
//Lab Program
/*
 Create a Java program to implement an Employee Login Access System.
Create a class Employee with the following fields: employeeName, salary, doorpower, blocked

Initialize all the values using a parameterized constructor.
Create a method checkAccess() that performs the following checks:
› check whether the door has power or not using a logical/relational expression.
› Check whether the employee is blocked or not.
›The employee should get access only when the door has power and the employee is not blocked. 
 > Display the employee name, salary, door power status, blocked status, and the final access status.
 */
package com.operators;

public class Employee {
	String employeeName;
	int salary;
	boolean doorpower;
	boolean blocked;

	Employee(String employeeName, int salary, boolean doorpower, boolean blocked) {
		this.employeeName = employeeName;
		this.salary = salary;
		this.doorpower = doorpower;
		this.blocked = blocked;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Nani", 50000, true, false);
		e.checkAccess();
	}
	void checkAccess() {
		System.out.println("Employee Name is: " + employeeName);
		System.out.println("Salary of the Employee is: " + salary);
		System.out.println("Door Power for the Company is: " + doorpower);
		System.out.println("Employee Profile is: " + blocked);
	}
}