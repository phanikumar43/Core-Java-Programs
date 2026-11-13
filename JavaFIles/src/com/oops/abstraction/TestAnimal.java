package com.oops.abstraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class TestAnimal {

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to Animal Walk !!");

//		List<Integer>list = new ArrayList<>();
//		list.add(10);

		// A connection (session) with a specific database.
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
		System.out.println("-------------------------------------------");
		System.out.println("Dog Information: ");
		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		d.sleep();
		System.out.println("-------------------------------------------");
		System.out.println("Monkey Information: ");
		Animal m=new Monkey();
		m.eat();
		m.sound();
		m.walk();
		m.sleep();
		System.out.println("-------------------------------------------");
	}

}
