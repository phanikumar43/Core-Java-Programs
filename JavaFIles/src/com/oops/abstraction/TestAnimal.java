package com.oops.abstraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class TestAnimal {
	
	//By default interface variables are public final static
	// Final variables which will do not change the value.
	public  final static int a=10;
	public static final String orgName="Nani";

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to Animal Walk !!"+TestAnimal.orgName);

//		List<Integer>list = new ArrayList<>();
//		list.add(10);

		// A connection (session) with a specific database.
//		getConnection:-Attempts to establish a connection to the given database URL
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch76", "root", "root");
//
//		Statement stmt=con.createStatement(); 
//		
//		ResultSet rs=stmt.executeQuery("select * from student");
//		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//		}

		System.out.println("Cat Information: ");
//		Cat c=new Cat();
//		Up-casting is the process of abstraction
		Animal c = new Cat();
		c.eat();
		c.sound();
		c.walk();
		c.sleep();
		c.run();
		//interface static methods we cannot call by using object reference variable
		//we can call by using interface name only
		
		//This static method of interface Animal can only be accessed as Animal.breath
//		c.breath();
		System.out.println("-------------------------------------------");
		System.out.println("Dog Information: ");
		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		d.sleep();
		d.run();
		System.out.println("-------------------------------------------");
		System.out.println("Monkey Information: ");
		Animal m=new Monkey();
		m.eat();
		m.sound();
		m.walk();
		m.sleep();
		m.run();
		System.out.println("-------------------------------------------");
	}

}
