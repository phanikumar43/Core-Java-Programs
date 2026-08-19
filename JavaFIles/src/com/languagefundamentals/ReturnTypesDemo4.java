//Date;-18-08-2026
//The program is no arguments+no return value
/*Calculate and Display Rectangle Area

Create calculateArea()
Store length and breadth.
Calculate the area.
Display it directly.
*/
package com.languagefundamentals;

public class ReturnTypesDemo4 {
	int length;
	int breadth;
	
	void calculateArea() {
		System.out.println("Total Length is: "+length);
		System.out.println("Total Breadth is: "+breadth);
		System.out.println("Length & Breadth of a rectangle is: "+(length*breadth));
	}
	public static void main(String[] args) {
		ReturnTypesDemo4 r4=new ReturnTypesDemo4();
		r4.length=50;
		r4.breadth=50;
		r4.calculateArea();
	}

}
