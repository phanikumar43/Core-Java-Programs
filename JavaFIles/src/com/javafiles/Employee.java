//Date:-15-07-2026 & 16-07-2026

package com.javafiles;

public class Employee {
	int eid;
	String ename;
	static int orgID = 555;
	static String orgName = "Vcube";

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Employee sr = new Employee();
		sr.eid=1;
		sr.ename="nani";
		sr.orgID=666;
		sr.orgName="VSS";
		System.out.println(orgID);
		System.out.println(orgName);
		System.out.println(Employee.orgID);
		System.out.println(Employee.orgName);
		System.out.println(sr.orgID);
		System.out.println(sr.orgName);
		System.out.println("_------------------------");
		System.out.println(sr.eid);
		System.out.println(sr.ename);

	}

}
