//Date:-28-07-2026
//Lab Experiment
/*Java:-
1. Write a Java Program to complete Below Requirements 
A user have 100 rupees and he is about to buy pencil costs 7 rupees
a) find how many pencils he buy with the money he have and find the amount left after shopping 
*/
/*

Today’s Assignment:- 

Java:-

1. Write a Java Program to complete Below Requirements 

A user have 100 rupees and he is about to buy pencil costs 7 rupees

a) find how many pencils he buy with the money he have and find the amount left after shopping 
*/
package com.languagefundamentals;
	
public class Test1 {
	static Test1 t1=new Test1();
	int pencil=7;
	int money=100;
	int quantity;
	int cost;
	int remaining;
	void pencil() {
		quantity=money/pencil;
		System.out.println("Total Pencils is: "+quantity);
		cost=quantity*pencil;
		System.out.println("Cost is: "+cost);
		remaining=money-(pencil*quantity);
		System.out.println("Remaining amount is: "+remaining);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to my shop");
		t1.pencil();
		System.out.println("Thank you for buying");
		System.out.println("please come again");
	}

}
