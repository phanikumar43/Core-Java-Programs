//Date:-10-08-2026
//Lab Experiment
/*Java :-
Write a Java Program to complete below requirements 

a) Take variables as studentId, studentName, gender, branchName,collegeName 
with corresponding data types 
b) Take a Method To display the student Details 
c) Try to add atleast two student data 

Note :-  Dont Take Primitive Data Types
*/
package com.languagefundamentals;

public class Student {
static String collegeName="nani";
int studentId;
String studentName;
String gender;
String branchName;

void display() {
	System.out.println("Student Id is: "+studentId);
	System.out.println("Student Name is: "+studentName);
	System.out.println("Gender is: "+gender);
	System.out.println("Student Branch Name is: "+branchName);
}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentId=1;
		s.studentName="Phani";
		s.gender="Male";
		s.branchName="CSE";
		s.display();
		System.out.println("------------------------------------");
		Student s1=new Student();
		s1.studentId=2;
		s1.studentName="Subbu";
		s1.gender="Female";
		s1.branchName="ECE";
		s1.display();
		System.out.println("------------------------------------");
	}

}


/*
Output:-
Student Id is: 1
Student Name is: Phani
Gender is: Male
Student Branch Name is: CSE
------------------------------------
Student Id is: 2
Student Name is: Subbu
Gender is: Female
Student Branch Name is: ECE
------------------------------------
*/