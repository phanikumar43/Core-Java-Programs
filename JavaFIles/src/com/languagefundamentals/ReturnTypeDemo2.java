//Date;-18-08-2026
//The program is no arguments+no return value
/*Display Employee Details

Create displayEmployeeDetails()
Store employee ID, name, department and salary.
Display the details.
*/
package com.languagefundamentals;

public class ReturnTypeDemo2 {
int employeeId;
String name;
String department;
Double salary;

void displayEmployeeDetails() {
	System.out.println("Employee Id is: "+employeeId);
	System.out.println("Employee Name is: "+name);
	System.out.println("Employee Department is: "+department);
	System.out.println("Employee Salary is: "+salary);
}
	public static void main(String[] args) {
		ReturnTypeDemo2 r2=new ReturnTypeDemo2();
		r2.employeeId=1;
		r2.name="Phani";
		r2.department="CSE";
		r2.salary=500000.0;
		r2.displayEmployeeDetails();
	}

}
