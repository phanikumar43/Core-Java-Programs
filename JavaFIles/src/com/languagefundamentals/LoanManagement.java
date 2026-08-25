//Date:-19-08-2026
//Lab Experiment
/*Java: -
Create a Class Named as LoanManagement with following variables and methods :-
customerName, LoanAmount, interestRate, Loantenure - in years

Methods :-
calculateInterest():-
Accept loanAmount and interestRate as arguments.
Calculate and return the simple interest.

calculateTotalAmount ()
Accept the calculated
interest as an argument.
Return the total amount payable.

calculateMonthlyEMI():-
Accept the total payable amount and loan tenure as arguments.
Return the monthly EMI.

displayLoanSummary():-
Accept the interest,
total amount, and EMI as arguments.

Display the complete loan details.
create atleast 2 different objects and different type of data and with every object call the method print the total in main with proper readability

Customer Name
Loan Amount
Interest Rate
Loan Tenure
Interest
Total Amount
Monthly EMI
*/
package com.languagefundamentals;

public class LoanManagement {
String customerName;
int loanAmount;
int interestRate;
int loanTenure;
double si;
double totalAmount;
double monthlyEMI;

double calculateInterest(double loanAmount,double interestRate) {
	si=(loanAmount*interestRate*loanTenure)/100;
//	System.out.println("Interest is: "+si);
	return interestRate;
}
 
double calculateTotalAmount(double si) {
	totalAmount=loanAmount+si;
	System.out.println("Loan Amount is: "+totalAmount);
	return si;
}

double calculateMonthlyEMI(double totalAmount) {
	monthlyEMI=totalAmount*(loanTenure*12);
	System.out.println("Monthly EMI is: "+monthlyEMI);
	return monthlyEMI;
}

void displayLoanSummary() {
	System.out.println("Customer Name is: "+customerName);
	System.out.println("Loan Amount is: "+loanAmount);
	System.out.println("Interest Rate is: "+interestRate);
	System.out.println("Loan Tenure is: "+loanTenure);
	System.out.println("Interest is: "+si);
	System.out.println("Total Amount is: "+totalAmount);
	System.out.println("Monthly EMI is: "+monthlyEMI);
}
	public static void main(String[] args) {
		LoanManagement l=new LoanManagement();
		l.loanAmount=10000;
		l.interestRate=10;
		l.loanTenure=5;
		l.customerName="Nani";
		
	}

}
