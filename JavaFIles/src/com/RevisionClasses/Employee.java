//Date:-13-08-2026
//Class-27 :- Language Fundamentals 
//			  Types Of Variables-01
package com.RevisionClasses;

//Types Of Variables:-
//1)Static Variables:-
//	- The class level variables creating static keyword will consider as static
//	- Whenever the data is same for all the objects then will keep such data as static
//	- Static data we can access without object creation like
//		- Within the ckass directly we can access, 
//		- outside of the classes, we can access by using class name and
//		- we access through objecr reference variable also

//2)Instance Variables:-
//	- The class level variable creating without static will consider as instance
//	- Whenever the data is changing from object to object then will keep such data as instance.
//	- Instance data, we can access only through object reference variable but not with the class name

//3)Local Variables:-
//	- The block or method level variables will consider as local
//	- Whenever we want to maintain temporary data within the vlock or method will use local variables
//	- Local variables we can access directly
//	- Q) For local variables can we keep static ..? No It gives compile time error : illegal modifer
//		- The only applicable modifier for local variables are final

//		Example:-
//			static int org_Id=2;
//		Error Message:-
//			Illegal modifier for parameter org_Id; only final is permitted

public class Employee {

	// Primitive + instance
	int emp_id;
	// Object + instance
	String emp_name;

	// Primitive + static
	static int org_Id = 101;
	// Object + static
	static String org_Name = "Nani";

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int org_Id=2;
		String org_Name="Kumar";
		
		System.out.println(org_Id);
		System.out.println(org_Name);
		
		Employee e1 = new Employee();

		// Initialization
		e1.emp_id = 101;
		e1.emp_name = "Phani";
		// Local Variables

		// Primitive + local
		int age;
		// Object + local
		String city;

		// Accessing Local Variables
		// The local variable age may not have been initialized
		// We cannot access local variables without initialization
		// System.out.println(age);
		age = 22;
		System.out.println(age);
		city = "Hyderabad";
		System.out.println(city);
		System.out.println("---------------------------------------");

		System.out.println("1. Accessing static data directly: ");
		// Accessing static data directly is possible within the class only
		System.out.println(org_Id);
		System.out.println(org_Name);

		// Whenever we want to access static data outside of the classes then we choose
		// class name.
		System.out.println("2. Accessing static data by using class name: ");
		System.out.println(Employee.org_Id);
		System.out.println(Employee.org_Name);

		// When we access static data using object reference
		// we will get warning from the compiler:
		// The static field Employee.org_Id should be accessed in a static way
		System.out.println("Accessing static data by using Object Reference Variable: ");
		System.out.println(e1.org_Id);
		System.out.println(e1.org_Name);

		// But Instance Data we can access only through object reference variable
		// Accessing instance data by using object Reference variables
		System.out.println(e1.emp_id);
		System.out.println(e1.emp_name);

		// Even though e2 is null, static data is loading
		// so there is no impact to call static data by using object reference variable
		// The recommended approach to access static data is by using class name only
		Employee e2 = null;
		System.out.println(e2.org_Id);
		System.out.println(e2.org_Name);

		// Exception in thread "main" java.lang.NullPointerException:
//		Cannot read field "emp_id" because "e2" is null at com.RevisionClasses.Employee.main(Employee.java:59)

//		System.out.println(e2.emp_id);// NPE
//		System.out.println(e2.emp_name);// NPE

		System.out.println("Main Method Started");
	}
}