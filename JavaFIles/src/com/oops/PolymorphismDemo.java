//Date:-09-11-2026
//Class Experiment
package com.oops;

public class PolymorphismDemo {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		hello("Java");
		// String By-Default Value is Null
		//The method hello(Object) is ambiguous for the type PolymorphismDemo
		//hello(null);
		System.out.println("Main Method Ended");
	}

	static void hello(Object o) {
		System.out.println("Hello Method with Object");
	}

	static void hello(Integer s) {
		System.out.println("Hello Method With Integer");
	}

	static void hello(String s) {
		System.out.println("Hello Method With String");
	}
}

/*
Note:-The Below Notes Are Complete AI Generated Notes:-


Java OOPS – Polymorphism Demo (Method Overloading)
Core Java
 OOPS Concept
 Interview Important

Your program demonstrates Compile-Time Polymorphism using Method Overloading.

Let's understand it step by step with simple examples.
1. What is this program?
This program demonstrates Method Overloading in Java.
Definition: 
Method overloading is a concept in which a class contains multiple methods with the same name but different parameter types, numbers, or order of parameters.

In your program, we have three methods with the same name hello():
static void hello(Object o) {
    System.out.println("Hello Method with Object");
}

static void hello(Integer s) {
    System.out.println("Hello Method With Integer");
}

static void hello(String s) {
    System.out.println("Hello Method With String");
}

Although all three methods have the same name, their parameter types are different.

Java identifies which method to execute based on the arguments passed during the method call.

Example:
hello("Java");

Output:
Hello Method With String

Why?

Because "Java" is a String, so Java selects the hello(String s) method.

2. Components used in this program:-

Let's understand each component.
Component								Explanation

1)package com.oops						Defines the package name.
2)public class							Declares a class accessible from other packages.
3)static								Allows calling a method without creating an object.
4)void									Indicates that the method does not return a value.
5)main()								Starting point of Java program execution.
6)String[] args							Stores command-line arguments.
7)System.out.println()					Prints output on the console.
8)Object								Parent class of all Java reference types.
9)Integer								Wrapper class for primitive int.
10)String								Represents a sequence of characters.
11)hello()								Overloaded method name.

Important: All three hello() methods are static. Therefore, you can call them directly from the static main() method without creating an object.

3. How will this program execute?:-
Let's understand the execution flow.

Step 1: JVM calls the main method:-
public static void main(String[] args)
Execution starts from the main method.

Step 2: First print statement:-
System.out.println("Main Method Started");

Output:-
Main Method Started

Step 3: Method call:-
hello("Java");
Now Java checks the available overloaded methods.
Available method			Parameter type		Match?
hello(Object o)				Object				Yes, through widening
hello(Integer s)			Integer				No
hello(String s)				String				Exact match

Java selects the String method because it is the most specific applicable method for this argument.

Step 4: Execute selected method:-
static void hello(String s) {
    System.out.println("Hello Method With String");
}

Output:
Hello Method With String

Step 5: Main method continues
System.out.println("Main Method Ended");

Output:
Main Method Ended

Complete execution flow
main() method starts

Print: Main Method Started

Call: hello("Java")

Selected
hello(String s)

Print: Hello Method With String

Print: Main Method Ended

Final output
Main Method Started
Hello Method With String
Main Method Ended

4. Edge cases in this program:-

This is the most important section because interviewers frequently ask questions based on these scenarios.
Case 1: Passing a String:-
hello("Java");

Output:
Hello Method With String

Reason: Exact String parameter match.:-
Case 2: Passing an Integer
hello(100);

Output:
Hello Method With Integer


Reason: 100 is an int literal. Java can box it into an Integer, and that overload is more specific than Object.
Case 3: Passing an Object
hello(new Object());


Output:
Hello Method with Object


Reason: The argument is an Object, and the Object method is applicable.
Case 4: Passing null
hello(null);


Compilation Error
Reason: Java cannot decide between these two methods:
hello(Integer s);
hello(String s);


Both accept null because both are reference types.

Neither Integer nor String is a subtype of the other.

Therefore, Java reports:
The method hello(Object) is ambiguous


Correction to understand: The exact compiler message may differ, but the problem is ambiguity between hello(Integer) and hello(String), not between hello(Object) and another method.
Case 5: Passing null with typecasting
We can solve the ambiguity using explicit typecasting.
hello((String) null);


Output:
Hello Method With String


Another example:
hello((Integer) null);


Output:
Hello Method With Integer


And:
hello((Object) null);


Output:
Hello Method with Object


Case 6: Passing a double value
hello(10.5);


Output:
Hello Method with Object


Why?
- 10.5 is a double literal.
- It cannot be converted to Integer through boxing.
- Java boxes it into Double.
- Double extends Number, which extends Object.
- Therefore, hello(Object) is selected.
Case 7: Passing a character
hello('A');


Output:
Hello Method With Integer


Why?

Java can widen char to int and then box it into Integer in a method invocation.

However, this is not the only possible method if other overloads are added. In your current program, hello(Integer) is the most specific applicable method.
5. Interview questions expected from this program
These are important interview questions to practise.
5-star priority
Q1. What is polymorphism in Java?

Answer: Polymorphism means one thing having multiple forms. In Java, it allows the same method name or reference to behave differently depending on the situation.

Q2. What is method overloading?

Answer: Defining multiple methods with the same name but different parameter lists within the same class is called method overloading.

Q3. What type of polymorphism is method overloading?

Answer: Compile-time polymorphism or static polymorphism.

Q4. Can we overload a method by changing only its return type?

Answer: No. Changing only the return type is not sufficient for method overloading.

Example:
int add(int a, int b) {
    return a + b;
}

// Compilation error
double add(int a, int b) {
    return a + b;
}


Q5. Can we overload static methods?

Answer: Yes. Static methods can be overloaded.

Q6. Can we overload the main method?

Answer: Yes. But JVM starts execution from the standard public static void main(String[] args) entry point.

Q7. Why does hello(null) produce a compilation error?

Answer: Because both hello(String) and hello(Integer) can accept null, and neither is more specific than the other.

Q8. Which method gets the highest priority: Object, Integer, or String?

Answer: It depends on the argument. Java chooses the most specific applicable overload, not simply the method with the smallest-looking type.

Q9. What is the difference between method overloading and method overriding?
Method Overloading	Method Overriding
Same method name	Same method signature
Different parameters	Same parameters
Usually within the same class	Requires inheritance
Compile-time polymorphism	Runtime polymorphism
Return type alone cannot distinguish overloads	Compatible return type required

Q10. Is method overloading possible with different parameter orders?

Answer: Yes.
void display(int a, String b) {}

void display(String b, int a) {}


These are valid overloaded methods.
4-star priority
Q11. What is the difference between primitive int and Integer?
- int is a primitive data type.
- Integer is a wrapper class.
- Integer supports methods and can store null.
- Autoboxing converts int into Integer.
Q12. What is autoboxing?

Converting a primitive value into its corresponding wrapper object automatically.
Integer a = 100;


Q13. What is widening in Java?

Converting a smaller primitive data type into a larger compatible primitive type.
int a = 10;
double b = a;


Q14. What happens if two overloaded methods have unrelated reference types and we pass null?

Answer: Compilation error due to ambiguity.

Q15. Does method overloading depend on the return type?

Answer: No. It depends on the method name and parameter list.
6. Advantages and disadvantages of method overloading
Advantages
1. Code reusability: We can use the same method name for different inputs.
2. Readability: Makes code easier to understand.
3. Flexibility: Supports different parameter types and numbers.
4. Maintainability: Easier to maintain related operations under one method name.
5. Compile-time checking: The compiler identifies the appropriate overloaded method.
Disadvantages
1. Ambiguity: Some method calls, such as hello(null), produce compilation errors.
2. Complexity: Too many overloaded methods can confuse developers.
3. Debugging: Understanding which overloaded method is selected can sometimes be difficult.
4. Maintenance issues: Adding new overloads can change which method gets selected for existing calls.
5. Limited flexibility: The method selection is based on compile-time types, not the actual runtime object type.
7. Practical interview experiment – Test your knowledge
Try answering these questions without looking at the notes.
Java OOPS mini test
5 questions

1. What is the output of hello("Python")?

Object method

Integer method

String method

Compilation error

Correct

A String argument matches hello(String) exactly.



2. What happens when hello(null) is executed?

Object method executes

String method executes

Integer method executes

Compilation error

Incorrect – Compilation error

String and Integer are unrelated reference types, so neither overload is more specific.



3. What is the output of hello(500)?

Object method

Integer method

String method

Compilation error

Correct

The int literal is boxed into Integer, selecting hello(Integer).



4. Can we overload methods by changing only the return type?

Yes

No

Only static methods

Only private methods

Incorrect – No

The parameter list must differ; return type alone cannot distinguish overloads.



5. Method overloading represents which polymorphism?

Runtime polymorphism

Compile-time polymorphism

Dynamic binding only

Inheritance

Correct

The compiler resolves the overloaded method at compile time.


3 / 5
Try again

8. Important points to remember for interviews
Keep these five points in your revision notes:
1. Method overloading is compile-time polymorphism.
2. Overloaded methods must have different parameter lists.
3. Return type alone cannot achieve method overloading.
4. Java selects the most specific applicable method.
5. Passing null to unrelated reference-type overloads can cause ambiguity.
*/