//Date:-18-08-2026
//This Program is no argument+no return value
/*Display Student Details

Create displayStudentDetails()
Store student ID, name, age and course.
Display all details.
*/
package com.languagefundamentals;
public class ReturnTypeDemo1 {
int studentId;
String name;
int age;
String course;

void displayStudentDetails() {
	System.out.println("Student Id is: "+studentId);
	System.out.println("Student Name is: "+name);
	System.out.println("Student Age is: "+age);
	System.out.println("Student Course is: "+course);
}
	public static void main(String[] args) {
		ReturnTypeDemo1 r1=new ReturnTypeDemo1();
		r1.studentId=1;
		r1.name="Phani";
		r1.age=21;
		r1.course="CSE";
		r1.displayStudentDetails();
	}
}
