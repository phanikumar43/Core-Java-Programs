//Date:-09-11-2026
//Class Experiment
package com.oops;

//Find Areas..?
//findArea() Using PolyMorphism
//Area of Triangle --> 0.5 * base * height
//Area of Square --> side * side
//Area of Rectangle --> length * breadth
//Area of Circle --> PI.r * r
public class PolymorphismFindAreas {

	void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Area Of Triangle: " + findArea(10, 6));
		System.out.println("Area Of Square: " + findArea(10));
		System.out.println("Area Of Rectangle: " + findArea(5, 6.5f));
		System.out.println("Area of Circle: " + findArea(10));
	}

	double findArea(double base, double height) {
		System.out.println("Triangle Info: ");
		return 0.5 * base * height;
	}

	double findArea(double side) {
		System.out.println("Square Info: ");
		return side * side;
	}

	double findArea(double l, float b) {
		System.out.println("Rectangle Info: ");
		return l * b;
	}

	double findArea(float r) {
		System.out.println("Circle Info: ");
		return Math.PI * r * r;
	}
}

/*
 * Note:- The Given Below Notes Are AI Generated Notes
 * 
 * Java OOPS – Polymorphism Find Areas (Method Overloading) Core Java OOPS
 * Concept Interview Important
 * 
 * 
 * Your second experiment demonstrates Compile-Time Polymorphism using Method
 * Overloading.
 * 
 * The main objective is to calculate the areas of four different shapes using
 * the same method name: findArea().
 * 
 * There are some important mistakes and interview points in your code. Let's
 * understand them step by step. 1. What is this program? Definition: This
 * program demonstrates method overloading by defining multiple findArea()
 * methods with different parameter types and numbers of parameters to calculate
 * the areas of different geometric shapes.
 * 
 * Your program calculates: 1. Area of Triangle 2. Area of Square 3. Area of
 * Rectangle 4. Area of Circle Instead of creating four different method names,
 * we use the same method name findArea().
 * 
 * Why?
 * 
 * Because all four methods perform a similar operation: calculating area. 2.
 * Components used in this program Component Explanation package com.oops
 * Defines the package. class Defines the class. void main() Main method without
 * a return value. double Stores decimal numbers with double precision. float
 * Stores decimal numbers with single precision. return Returns the calculated
 * area. findArea() Overloaded method name. Math.PI Provides the value of π
 * (approximately 3.14159). System.out.println() Displays output.
 * 
 * Important mathematical formulas
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 1. Triangle \(A=\frac{1}{2}\times b\times h\)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 2. Square \(A=s\times s\)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 3. Rectangle \(A=l\times b\)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 4. Circle \(A=\pi r^2\)
 * 
 * 
 * 3. How will this program execute? First, let's understand your four
 * overloaded methods. Method 1: Area of Triangle double findArea(double base,
 * double height) { return 0.5 * base * height; }
 * 
 * 
 * - Takes two double parameters. - Calculates triangle area. - Returns a double
 * value. Example: findArea(10, 6);
 * 
 * 
 * Calculation: \[ 0.5 \times 10 \times 6 = 30 \]
 * 
 * 
 * 
 * 
 * 
 * \(A=\frac{1}{2}(\text{10.0})(\text{6.0})=\text{30.00}\)
 * 
 * \(b\)
 * 
 * 
 * 
 * 
 * \(h\)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * b = 10.0h = 6.0
 * 
 * 
 * 
 * 
 * Give feedback
 * 
 * Method 2: Area of Square double findArea(double side) { return side * side; }
 * 
 * 
 * - Takes one double parameter. - Multiplies side by itself. - Returns the
 * area. Example: findArea(10);
 * 
 * 
 * Calculation: \[ 10 \times 10 = 100 \]
 * 
 * Method 3: Area of Rectangle double findArea(double l, float b) { return l *
 * b; }
 * 
 * 
 * - Takes two parameters. - First parameter is double. - Second parameter is
 * float. - Multiplies length and breadth. Example: findArea(5, 6);
 * 
 * 
 * Important problem in your program: This method is not selected by findArea(5,
 * 6).
 * 
 * Why? Both 5 and 6 are integer literals. Java can widen both to double,
 * selecting the triangle method findArea(double, double).
 * 
 * To call the rectangle method, you must explicitly provide a float argument:
 * findArea(5, 6.0f);
 * 
 * 
 * Then Java selects findArea(double, float). Method 4: Area of Circle double
 * findArea(float r) { return Math.PI * r * r; }
 * 
 * 
 * - Takes one float parameter. - Uses Math.PI. - Calculates the circle area.
 * Example: findArea(10.0f);
 * 
 * 
 * Calculation: \[ 3.14159 \times 10 \times 10 \]
 * 
 * \[ =314.159... \]
 * 
 * 
 * 
 * \(A = \pi r^2\)
 * 
 * \(A=\pi r^2=\pi(\text{10.00})^2=\text{314.16}\) r = 10.00 is center to edge.
 * Double r gives 4× area.
 * 
 * \(r\)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * r = 10.00
 * 
 * 
 * 
 * Give feedback
 * 
 * 4. Important mistake in your main method Your code contains: void
 * main(String[] args)
 * 
 * 
 * This is not the conventional Java entry point.
 * 
 * For maximum compatibility, especially in interviews and traditional Java
 * projects, use: public static void main(String[] args)
 * 
 * 
 * Your original instance main method is not the traditional JVM entry point.
 * Newer Java versions have introduced flexible main-method support, but you
 * should use the standard signature while learning.
 * 
 * There is another important issue: your square and circle calls both use one
 * argument. findArea(10); findArea(10);
 * 
 * 
 * Java selects the same overload for both calls. Since 10 is an integer
 * literal, Java can widen it to double or convert it to float through widening
 * and boxing rules. The applicable double overload is preferred over the float
 * overload.
 * 
 * Therefore, both calls select the square method, not the circle method.
 * 
 * This is the most important logical error in your experiment. 5. Corrected
 * program Here is a corrected version of your experiment. I've used different
 * argument types to make the method selection unambiguous.
 * 
 * package com.oops;
 * 
 * public class PolymorphismFindAreas {
 * 
 * public static void main(String[] args) {
 * 
 * System.out.println("Main Method Started");
 * 
 * PolymorphismFindAreas obj = new PolymorphismFindAreas();
 * 
 * System.out.println("Area Of Triangle: " + obj.findArea(10.0, 6.0));
 * 
 * System.out.println("Area Of Square: " + obj.findArea(10.0));
 * 
 * System.out.println("Area Of Rectangle: " + obj.findArea(5.0, 6.0f));
 * 
 * System.out.println("Area Of Circle: " + obj.findArea(10.0f));
 * 
 * System.out.println("Main Method Ended"); }
 * 
 * double findArea(double base, double height) { return 0.5 * base * height; }
 * 
 * double findArea(double side) { return side * side; }
 * 
 * double findArea(double l, float b) { return l * b; }
 * 
 * double findArea(float r) { return Math.PI * r * r; } }
 * 
 * 
 * 
 * Expected output Main Method Started Area Of Triangle: 30.0 Area Of Square:
 * 100.0 Area Of Rectangle: 30.0 Area Of Circle: 314.1592653589793 Main Method
 * Ended
 * 
 * 
 * 6. Edge cases in this program These are the important scenarios you should
 * practise. Method call Selected method Reason findArea(10.0, 6.0) Triangle
 * Exact double, double findArea(10.0) Square Exact double findArea(5.0, 6.0f)
 * Rectangle Exact double, float findArea(10.0f) Circle Exact float findArea(5,
 * 6) Triangle Both int values widen to double findArea(10) Square int widens to
 * double findArea(10.0f) Circle Exact float match
 * 
 * Additional edge cases Case 1: Negative values findArea(-10.0);
 * 
 * 
 * The square calculation returns 100.0, even though a negative side length is
 * invalid geometrically.
 * 
 * Your current program does not validate inputs.
 * 
 * Case 2: Zero values findArea(0.0);
 * 
 * 
 * Returns zero.
 * 
 * Case 3: Integer arguments for rectangle findArea(5, 6);
 * 
 * 
 * Selects the triangle method, not rectangle.
 * 
 * Case 4: Float and double overload priority findArea(10);
 * 
 * 
 * Selects findArea(double), because primitive widening from int to double is
 * preferred over widening followed by boxing to Float.
 * 
 * Case 5: Very large values
 * 
 * Very large inputs may produce Infinity due to double overflow.
 * 
 * Case 6: Invalid floating-point values
 * 
 * NaN and infinity can also be passed as arguments. Your program does not
 * reject them. 7. Interview questions expected from this program 5-star
 * priority Question Short answer 1. What is method overloading? Same method
 * name with different parameter lists. 2. What type of polymorphism is this?
 * Compile-time polymorphism. 3. Can we overload methods using different data
 * types? Yes. 4. Can we overload methods by changing only return type? No. 5.
 * Can static methods be overloaded? Yes. 6. Can we overload main method? Yes.
 * 7. What is method signature? Method name and parameter types/order. 8. What
 * is Math.PI? A constant representing π. 9. Why do we use double? To represent
 * decimal values with greater precision than float. 10. Why does findArea(5,6)
 * call triangle? Both integer arguments widen to double.
 * 
 * 4-star priority Q11. What is the difference between float and double? -
 * Float: 32-bit floating-point type. - Double: 64-bit floating-point type. -
 * Double provides greater precision. Q12. What is method signature?
 * 
 * Example: findArea(double, double) findArea(double) findArea(double, float)
 * findArea(float)
 * 
 * 
 * Each has a different parameter list.
 * 
 * Q13. What is method resolution?
 * 
 * The process by which the Java compiler determines which overloaded method
 * should be invoked.
 * 
 * Q14. Can we create an object to call non-static methods?
 * 
 * Yes. PolymorphismFindAreas obj = new PolymorphismFindAreas();
 * 
 * obj.findArea(10.0);
 * 
 * 
 * Q15. Why is method overloading called compile-time polymorphism?
 * 
 * Because the compiler determines which overloaded method to invoke at compile
 * time. 8. Advantages and disadvantages Advantages Disadvantages Same method
 * name for related operations Can create ambiguity Improves readability Too
 * many overloads create confusion Supports different input types Debugging
 * method selection can be difficult Improves code organization Adding overloads
 * may affect existing calls Compile-time method resolution Requires careful
 * parameter selection
 * 
 * 9. Test your understanding Try these questions. Predict the method that Java
 * selects. Quick Java quiz 5 questions
 * 
 * 1. findArea(10, 6) selects which method?
 * 
 * Triangle
 * 
 * Rectangle
 * 
 * Square
 * 
 * Circle
 * 
 * 
 * 
 * 
 * 2. findArea(10.0f) selects which method?
 * 
 * Square
 * 
 * Circle
 * 
 * Triangle
 * 
 * Compilation error
 * 
 * 
 * 
 * 
 * 3. findArea(5.0, 6.0f) selects which method?
 * 
 * Triangle
 * 
 * Rectangle
 * 
 * Square
 * 
 * Circle
 * 
 * 
 * 
 * 
 * 4. What happens with findArea(-5.0)?
 * 
 * Compilation error
 * 
 * Returns 25.0
 * 
 * Returns -25.0
 * 
 * Returns 0
 * 
 * 
 * 
 * 
 * 5. Can return type alone overload a method?
 * 
 * Yes
 * 
 * No
 * 
 * Only with double
 * 
 * Only with static
 * 
 * 
 * 
 * Submit answers
 * 
 * 10. Final revision notes Remember these six points for your V Cube Java GUT
 * exam and interviews: 1. This program demonstrates method overloading. 2.
 * Method overloading is compile-time polymorphism. 3. Method signatures must
 * differ. 4. Java selects methods based on the arguments and overload
 * resolution rules. 5. 5 and 6 are integer literals, not float or double
 * literals. 6. Always use the correct argument types to invoke the intended
 * overloaded method.
 */