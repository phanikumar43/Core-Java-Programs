package com.oops;

//Var-args: Variable Arguments
public class VariableArguments {

	void main(String[] args) {
		System.out.println("Main Method Started");
		addition();
		addition("A",10);
		addition("B",10, 20);
		addition("C",10, 20, 30);
		addition("D",10, 20, 30, 40);
		addition("E",10, 20, 30, 40, 50);
		System.out.println("Main Method Ended");
	}

	void addition() {
		System.out.println("Addition method called with no-args");
	}

	//Variable-Arguments
	//Error:-The variable argument type int of the method addition must be the last parameter
	//void addition(int... numbers, //int a) 
	void addition(String s,int... numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum = sum + n;
		}
		System.out.println("Addition method called with one-args: " + sum);// 10
	}

//	void addition(int i,int j) {
//		System.out.println("Addition method called with two-args: "+(i+j));//30
//	}
//	
//	void addition(int i,int j,int k) {
//		System.out.println("Addition method called with three-args: "+(i+j+k));//60
//	}
//	
//	void addition(int i,int j,int k,int l) {
//		System.out.println("Addition method called with four-args: "+(i+j+k+l));//100
//	}
//	
//	void addition(int i,int j,int k,int l,int m) {
//		System.out.println("Addition method called with four-args: "+(i+j+k+l+m));//150
//	}
}

/*
Note:- The Given Below Notes Are AI Generated Notes

Java OOPS – Variable Arguments (Varargs)
Core Java
 Method Overloading
 Interview Important


Your third experiment demonstrates Variable Arguments (Varargs) in Java.

The main purpose of this concept is to pass a variable number of arguments to a single method without creating multiple overloaded methods.

Let's understand it step by step, just like classroom notes.
1. What is this program?
Definition: Variable Arguments (Varargs) is a Java feature that allows a method to accept zero or more arguments of the same specified type using a special syntax (...).

In your program:
void addition(String s, int... numbers)


- String s accepts one String argument.
- int... numbers accepts zero or more integer arguments.
For example:
addition("A", 10);
addition("B", 10, 20);
addition("C", 10, 20, 30);


All these method calls use the same addition() method.

Without Varargs: We might need multiple overloaded methods.

With Varargs: We can handle different numbers of arguments using one method.
2. Components used in this program
Component	Explanation
package	Organizes Java classes.
class	Defines a class.
void main()	Main method in your experiment.
void	Method does not return a value.
addition()	Method that performs addition.
String s	Accepts a String argument.
int... numbers	Accepts a variable number of integers.
for-each	Iterates through the array elements.
sum = 0	Initializes the total.
sum = sum + n	Adds each number to the total.

What is int... numbers?
This is called Varargs syntax.

Example:
void addition(int... numbers)


It means the method can receive:
addition();
addition(10);
addition(10, 20);
addition(10, 20, 30);
addition(10, 20, 30, 40);


Internally, Java treats the Varargs parameter as an array.

For example:
addition(10, 20, 30);


Internally, the values are available as:
int[] numbers = {10, 20, 30};


How Varargs works internally
Method call

addition(10, 20, 30)

Java internally creates an array

int[] numbers
10
Index 0
20
Index 1
30
Index 2



for-each loop adds all elements
60
Final sum

3. How will this program execute?
Let's understand your main method line by line.
Step 1: Main method starts
System.out.println("Main Method Started");


Output:
Main Method Started


Step 2: Calling addition() without arguments
addition();


This calls your no-argument method:
void addition() {
    System.out.println("Addition method called with no-args");
}


Output:
Addition method called with no-args


Step 3: Calling addition("A", 10)
addition("A", 10);


The method receives:
- s = "A"
- numbers = {10}
Calculation:
\[
sum = 0+10=10
\]

Output:
Addition method called with one-args: 10


Step 4: Calling addition("B", 10, 20)
addition("B", 10, 20);


The method receives:
numbers = {10, 20};


Calculation:
\[
sum=0+10+20=30
\]

Output:
Addition method called with one-args: 30


Step 5: Calling addition("C", 10, 20, 30)
addition("C", 10, 20, 30);


The method receives:
numbers = {10, 20, 30};


Calculation:
\[
sum=10+20+30=60
\]

Output:
Addition method called with one-args: 60


Step 6: Calling addition("D", 10, 20, 30, 40)
addition("D", 10, 20, 30, 40);


Calculation:
\[
10+20+30+40=100
\]

Step 7: Calling addition("E", 10, 20, 30, 40, 50)
addition("E", 10, 20, 30, 40, 50);


Calculation:
\[
10+20+30+40+50=150
\]

Step 8: Main method ends
System.out.println("Main Method Ended");


Output:
Main Method Ended


Complete output
Main Method Started

Addition method called with no-args
Addition method called with one-args: 10
Addition method called with one-args: 30
Addition method called with one-args: 60
Addition method called with one-args: 100
Addition method called with one-args: 150

Main Method Ended


Small improvement: Your output message says one-args for every call. That is misleading because the method accepts a variable number of integers. A better message would be "Sum: " + sum.
4. Why is Varargs parameter always the last parameter?
Your commented code:
// void addition(int... numbers, int a)


This produces a compilation error.

Reason: Varargs must always be the last parameter in a method declaration.

Correct:
void addition(int a, int... numbers) {
}


Incorrect:
void addition(int... numbers, int a) {
}


Why?

Suppose you call:
addition(10, 20, 30);


Java cannot determine whether 10 belongs to numbers or a if the variable argument parameter comes first.

By keeping Varargs last, Java can clearly identify the fixed parameters first and collect the remaining arguments into the array.
5. Edge cases in Varargs
These are very important for interviews.
Case 1: Passing zero arguments
addition("A");


Here:
numbers = {};


The loop executes zero times.

Output:
Addition method called with one-args: 0


Case 2: Passing one argument
addition("A", 100);


Output:
Sum: 100


Case 3: Passing multiple arguments
addition("A", 10, 20, 30, 40);


Output:
Sum: 100


Case 4: Passing negative values
addition("A", -10, 20, -5);


Calculation:
\[
-10+20-5=5
\]

Output:
Sum: 5


Case 5: Passing zero
addition("A", 0, 0, 0);


Output:
Sum: 0


Case 6: Passing an integer array
int[] arr = {10, 20, 30};

addition("A", arr);


Output:
Sum: 60


You can pass an existing array directly to a Varargs method.
Case 7: Passing null
addition("A", (int[]) null);


This passes a null array, not an empty array.

Your enhanced for loop will throw:
NullPointerException


To handle this safely:
void addition(String s, int... numbers) {

    if (numbers == null) {
        System.out.println("Array is null");
        return;
    }

    int sum = 0;

    for (int n : numbers) {
        sum += n;
    }

    System.out.println("Sum: " + sum);
}


Case 8: Integer overflow
addition("A", Integer.MAX_VALUE, 1);


Java int cannot represent the mathematical result.

It wraps around to a negative value because of integer overflow.

To avoid this, use long for the sum:
long sum = 0;

for (int n : numbers) {
    sum += n;
}


6. Important Varargs rules
Remember these rules for your GUT exam and interviews.
1. Only one Varargs parameter is allowed in a method declaration.
2. Varargs must be the last parameter.
3. Varargs can accept zero or more arguments.
4. Internally, Varargs works using an array.
5. Varargs can be used with primitive and reference data types.
6. A method can have normal parameters before Varargs.
7. Varargs can be overloaded, but ambiguous calls are possible.
Example:
void display(int... a) {
}

void display(String... s) {
}


Both methods are valid overloads.
7. Interview questions expected from this program
5-star priority
Q1. What is Varargs in Java?

Answer: Varargs allows a method to accept a variable number of arguments of the same specified type.

Q2. What is the syntax of Varargs?
returnType methodName(dataType... variableName)


Q3. What is the internal implementation of Varargs?

Answer: Java internally represents Varargs as an array.

Q4. Can we pass zero arguments to Varargs?

Answer: Yes.

Q5. Can we declare multiple Varargs parameters in one method?

Answer: No. Only one Varargs parameter is allowed.

Q6. Why must Varargs be the last parameter?

Answer: To avoid ambiguity when identifying fixed arguments and variable arguments.

Q7. Can we overload Varargs methods?

Answer: Yes.

Q8. Can we pass an array to a Varargs method?

Answer: Yes. An existing array of the corresponding type can be passed directly.

Q9. What happens if we pass null to Varargs?

Answer: It depends on how null is passed. (int[]) null passes a null array, which can cause NullPointerException if the method iterates over it without checking.

Q10. What is the difference between an array and Varargs?
Array	Varargs
Fixed array object	Variable number of arguments
Must generally create/pass an array	Can pass individual values
Uses []	Uses ...
Can be passed to Varargs	Internally represented as an array

4-star priority
Q11. Can we use Varargs with String?

Yes.
void display(String... names) {
}


Q12. Can we use Varargs with double?

Yes.
void display(double... numbers) {
}


Q13. Can Varargs be used with static methods?

Yes.

Q14. Can Varargs be used with constructors?

Yes.

Q15. Which has higher priority: normal parameter or Varargs during method overloading?

Answer: Java generally prefers an applicable fixed-arity method over a variable-arity method.
8. Advantages and disadvantages
Advantages	Disadvantages
Reduces method overloading	Can create method ambiguity
Makes code shorter	Debugging can become difficult
Accepts different numbers of arguments	Requires careful parameter declaration
Improves code reusability	Array creation may introduce overhead
Easy to maintain	Null handling requires attention

9. Practical interview experiment
Try these five questions without looking at the notes.
Varargs mini test
5 questions

1. What does int... numbers represent internally?

LinkedList

Array

HashMap

String



2. Can Varargs be declared before a normal parameter?

Yes

No

Only in static methods

Only in constructors



3. What happens when zero integers are passed?

Compilation error

NullPointerException

Empty array is received

Sum becomes 1



4. How many Varargs parameters can a method have?

Unlimited

Two

One

Zero only



5. What is the output of addition("A", 10, 20, 30)?

10

20

30

60


Submit answers

10. Final revision notes
Write these points in your Java notebook:
- Varargs stands for Variable Arguments.
- Introduced in Java 5.
- Syntax: int... numbers.
- Internally works as an array.
- Can accept zero or more arguments.
- Only one Varargs parameter is allowed.
- Varargs must be the last parameter.
- Can be used with methods and constructors.
- Can be overloaded.
*/