//Date:-06-08-2026
//Lab Experiment
/*1. James works as an employee in a company and earns a monthly salary of 5,000.
Every month:
3% of his salary is deducted as GST.
2% of his salary is deducted
as Provident Fund (PF).

Create the following
Variables:
Employee Name, Monthly Salary, Monthly GST, Monthly PF, Net Monthly Salary 

Annual GST, Annual PF, Annual Net Salary.

for Every Individual Calculation take Separate Method as Below.
 > calculateMonthlyPF() --> 300000*2%/100
 > calculateMonthlyGST(), --> 30000*3%/100
  calculateNetMonthlysalary() -->salary-gst-pf > calculateAnnualGST() --> monthlygst*12
 > calculateAnnualPF() -->monthly*12 ,  > calculateAnnualnetsalary() -->
 > displayEmployeeDetails()

Task:
1. Write a Java program to:
Store the employee details.
› calculate the monthly GST deduction ,PF deduction.
› Calculate the net monthly salary after deductions.
› Calculate the total GST deducted in one year.
› calculate the total PF deducted in one year.
› calculate the annual net salary after deductions.
After the Above Calculations
Display all the employee and salary details.
*/
/*
Formulas for calculations
Example Values (Salary = ₹5000)
Monthly GST = 5000 × 3 / 100 = 150
Monthly PF = 5000 × 2 / 100 = 100
Net Monthly Salary = 5000 − 150 − 100 = 4750
Annual GST = 150 × 12 = 1800
Annual PF = 100 × 12 = 1200
Annual Net Salary = 4750 × 12 = 57000
*/
package com.languagefundamentals;

public class CompanyPf {
String employeeName="Nani";
int monthlySalary=5000;
int monthlyGst=3;
int monthlyPf=2;
int netMonthSalary;
int annualGst;
int annualPf;
int annualNetSalary;
int calculateMonthlyPF;
int calculateMonthlyGST;

void calculateMonthlyGST() {
	calculateMonthlyGST=monthlySalary*monthlyGst/100;
}

void calculateMonthlyPF() {
	calculateMonthlyPF=monthlySalary*monthlyPf/100;
}

void  calculateNetMonthlysalary() {
	netMonthSalary=monthlySalary-calculateMonthlyGST-calculateMonthlyPF;
}

void calculateAnnualGST() {
	annualGst=calculateMonthlyGST*12;
}

void calculateAnnualPF() {
	annualPf=calculateMonthlyPF*12;
}

void calculateAnnualnetsalary() {
	annualNetSalary=netMonthSalary*12;
}

void displayEmployeeDetails() {
	System.out.println("Employee Name is: "+employeeName);
	System.out.println("Monthly Salary is: "+monthlySalary);
	System.out.println("Monthly GST is: "+calculateMonthlyGST);
	System.out.println("Monthly PF is: "+calculateMonthlyPF);
	System.out.println("Net Month Salary is: "+netMonthSalary);
	System.out.println("Annual GST is: "+annualGst);
	System.out.println("Annual PF is: "+annualPf);
	System.out.println("Annual Net Salary is: "+annualNetSalary);
}
	public static void main(String[] args) {
		CompanyPf c=new CompanyPf();
		c.calculateMonthlyGST();
		c.calculateMonthlyPF();
		c.calculateNetMonthlysalary();
		c.calculateAnnualGST();
		c.calculateAnnualPF();
		c.calculateAnnualnetsalary();
		c.displayEmployeeDetails();
	}

}

/*
Output:-
Employee Name is: Nani
Monthly Salary is: 5000
Monthly GST is: 150
Monthly PF is: 100
Net Month Salary is: 4750
Annual GST is: 1800
Annual PF is: 1200
Annual Net Salary is: 57000
*/