/*
 Java:-

Create a class named student and variables with respective data types to store and manage student information.

Instance Variables:-studentId, studentName,
englishmarks telugumarks hindimarks totalMarks percentage

Static Variable:-
collegeName

Methods: -
calculateTotal() - Calculates the total marks of the student. 
calculatepercentage()- Calculates the percentage of the student.
displaystudent- Displays all the student details, including marks, total, and percentage.
Create Two student Data and display the details.
 */
package com.languagefundamentals;

public class Test2 {
	//Static variable	
	static String collegeName="My College";
//	Instance Variable
	int studentId;
	String studentName;
	
	int englishMarks;
	int teluguMarks;
	int hindiMarks;
	int totalMarks;
	int maxMarks=300;
	int percentage;
	void calculateTotal() {
		totalMarks=englishMarks+teluguMarks+hindiMarks;
//		System.out.println("Total Subject Marks is: "+totalMarks);
//		System.out.println("----------------------");
	}
	void calculatePercentage() {
		percentage=(totalMarks*100)/maxMarks;
//		System.out.println("Percentage of Subject: "+percentage);
//		System.out.println("----------------------");
		
	}
	void displayStudent() {
		System.out.println("College Name is: "+collegeName);
		System.out.println("Student id is: "+studentId);
		System.out.println("Student Name is: "+studentName);
		System.out.println("English Marks is: "+englishMarks);
		System.out.println("Telugu Marks is: "+teluguMarks);
		System.out.println("Hindi Marks is: "+hindiMarks);
		System.out.println("Total Marks is: "+totalMarks);
		System.out.println("Percentage is: "+percentage);
		System.out.println("-----------------------------------------");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
			t.studentId=1;
			t.studentName="Nani";
			t.englishMarks=96;
			t.teluguMarks=95;
			t.hindiMarks=94;
			t.calculateTotal();
			t.calculatePercentage();
			t.displayStudent();
		Test2 t1=new Test2();	
			t1.studentId=2;
			t1.studentName="Phani";
			t1.englishMarks=90;
			t1.teluguMarks=91;
			t1.hindiMarks=92;
			t1.calculateTotal();
			t1.calculatePercentage();
			t1.displayStudent();
	}

}

/*
Output:-
College Name is: My College
Student id is: 1
Student Name is: Nani
English Marks is: 96
Telugu Marks is: 95
Hindi Marks is: 94
Total Marks is: 285
Percentage is: 95
-----------------------------------------
College Name is: My College
Student id is: 2
Student Name is: Phani
English Marks is: 90
Telugu Marks is: 91
Hindi Marks is: 92
Total Marks is: 273
Percentage is: 91
-----------------------------------------
*/