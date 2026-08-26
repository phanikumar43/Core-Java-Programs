//Date:-26-08-2026
//Class Program
package com.constructors;

public class Bike {
	String name;
	String model;
	String colour;
	double price;
	int year;
	Bike(){
		System.out.println("No Arguments Are Called");
	}
	
	Bike(String name){
		System.out.println("One Argument Called");
		this.name=name;
	}
	
	Bike(String name,String model){
		System.out.println("Two Argument Called");
		this.name=name;
		this.model=model;
	}
	
	Bike(String name,String model,String colour){
		System.out.println("Three Argument Called");
		this.name=name;
		this.model=model;
		this.colour=colour;
	}
	
	Bike(String name,String model,String colour,double price){
		System.out.println("Four Argument Called");
		this.name=name;
		this.model=model;
		this.colour=colour;
		this.price=price;
	}
	
	Bike(String name,String model,String colour,double price,int year){
		System.out.println("Five Argument Called");
		this.name=name;
		this.model=model;
		this.colour=colour;
		this.price=price;
		this.year=year;
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.bikeInfo();
		
		Bike b1=new Bike("Honda");
		b1.bikeInfo();
		
		Bike b2=new Bike("Honda","Unicorn");
		b2.bikeInfo();
		
		Bike b3=new Bike("Honda","Unicorn","Black");
		b3.bikeInfo();
		
		Bike b4=new Bike("Honda","Unicorn","Black",80000.00);
		b4.bikeInfo();
		
		Bike b5=new Bike("Honda","Unicorn","Black",80000.00,2025);
		b5.bikeInfo();
	}
	void bikeInfo(){
		System.out.println("Bike Name is : "+name);
		System.out.println("Model Name is : "+model);
		System.out.println("Colour Name is : "+colour);
		System.out.println("Price of The Bike is : "+price);
		System.out.println("Year of the bike is : "+year);
		System.out.println("----------------------------------------------------");
	}
}

/*
Output:-
No Arguments Are Called
Bike Name is : null
Model Name is : null
Colour Name is : null
Price of The Bike is : 0.0
Year of the bike is : 0
----------------------------------------------------
One Argument Called
Bike Name is : Honda
Model Name is : null
Colour Name is : null
Price of The Bike is : 0.0
Year of the bike is : 0
----------------------------------------------------
Two Argument Called
Bike Name is : Honda
Model Name is : Unicorn
Colour Name is : null
Price of The Bike is : 0.0
Year of the bike is : 0
----------------------------------------------------
Three Argument Called
Bike Name is : Honda
Model Name is : Unicorn
Colour Name is : Black
Price of The Bike is : 0.0
Year of the bike is : 0
----------------------------------------------------
Four Argument Called
Bike Name is : Honda
Model Name is : Unicorn
Colour Name is : Black
Price of The Bike is : 80000.0
Year of the bike is : 0
----------------------------------------------------
Five Argument Called
Bike Name is : Honda
Model Name is : Unicorn
Colour Name is : Black
Price of The Bike is : 80000.0
Year of the bike is : 2025
----------------------------------------------------
*/
