//Date:-22-07-2026
//Lab Experiment
// Print the total number of objects created in a program.

package com.javafiles;

public class ShowObjects {
	static int n = 0;
	{
		n = n + 1;
		System.out.println("Total Objects: " + n);
	}

	public static void main(String[] args) {
		ShowObjects ob1 = new ShowObjects();
		ShowObjects ob2 = new ShowObjects();
		ShowObjects ob3= new ShowObjects();
		ShowObjects ob4= new ShowObjects();
		ShowObjects ob5= new ShowObjects();
	}

}


/*
 Output:-
Total Objects: 1
Total Objects: 2
Total Objects: 3
Total Objects: 4
Total Objects: 5
 */
