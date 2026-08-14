//date:-14-08-2026
//Lab Experiment
/*
Create a Java class named Employee to manage employee details in an organization. 
take these variables to provide unique information for employees :-employeeName, employeeId, designation, department, salary, remoteLocation 

take these variables common for all:-
companyName = "Suntech Solutions"
companyLocation = "Hi-Tech city"

Requirements:
 Create a static block to   display:
"Welcome to SunTech Solutions!
Employee HRMS Portal"

Methods:-
› displayEmployeeDetails() to display the details of a particular employee.
› promoteEmployee() to change the employee's designation.\
› updatesalary() to increase the employee's salary by 5000 whenever the method is called.
> updateEmpLoyeeLocation() to update the location for employee
*/
package com.languagefundamentals;

public class EmployeeDetails {
	static String companyName = "Suntech Solutions";
	static String companyLocation = "Hi-Tech city";
	static String display="Welcome to SunTech Solutions! Employee HRMS Portal";
	int employeeId;
	String employeeName;
	String designation;
	String department; 
	int salary;
	String remoteLocation;
	String promoteEmployee;
	int  updatesalary;
	String updateEmpLoyeeLocation;
	void displayEmployeeDetails() {
		System.out.println("Company Name is: "+companyName);
		System.out.println("Company Location is: "+companyLocation);
		System.out.println(display);
		System.out.println("Employee Id is: "+employeeId);
		System.out.println("Employee Name is: "+employeeName);
		System.out.println("Employee Designation is: "+designation);
		System.out.println("Employee Department is: "+department);
		System.out.println("Employee Salary is: "+salary);
		System.out.println("Employee Remote Location is: "+remoteLocation);
	}
	
	void promoteEmployee() {
		System.out.println("Congratulations. You are promoted to... "+promoteEmployee);
	}
	
	void updatesalary() {
		System.out.println("Your Updated Salary is: "+ updatesalary);
	}
	
	void updateEmpLoyeeLocation() {
		System.out.println("Your Updated Location is: "+updateEmpLoyeeLocation);
	}
	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();
			e1.employeeId=1;
			e1.employeeName="Phani";
			e1.designation="Developer";
			e1.department="CSE";
			e1.salary=50000;
			e1.remoteLocation="Hi-tech City";
			e1.displayEmployeeDetails();
			System.out.println("----------------------------------------------------------------");
			EmployeeDetails e2=new EmployeeDetails();
			e2.employeeId=2;
			e2.employeeName="Kumar";
			e2.designation="Testing";
			e2.department="CSE";
			e2.salary=45000;
			e2.remoteLocation="Hi-tech City";
			e2.updateEmpLoyeeLocation="Madhapur";
			e2.updatesalary=56000;
			e2.promoteEmployee="Developer";
			e2.displayEmployeeDetails();
			e2.promoteEmployee();
			e2.updatesalary();
			e2.updateEmpLoyeeLocation();
			System.out.println("----------------------------------------------------------------");
	}
}

/*
Output:-
Company Name is: Suntech Solutions
Company Location is: Hi-Tech city
Welcome to SunTech Solutions! Employee HRMS Portal
Employee Id is: 1
Employee Name is: Phani
Employee Designation is: Developer
Employee Department is: CSE
Employee Salary is: 50000
Employee Remote Location is: Hi-tech City
----------------------------------------------------------------
Company Name is: Suntech Solutions
Company Location is: Hi-Tech city
Welcome to SunTech Solutions! Employee HRMS Portal
Employee Id is: 2
Employee Name is: Kumar
Employee Designation is: Testing
Employee Department is: CSE
Employee Salary is: 45000
Employee Remote Location is: Hi-tech City
Congratulations. You are promoted to... Developer
Your Updated Salary is: 56000
Your Updated Location is: Madhapur
----------------------------------------------------------------
*/
