package com.oops;

//DTO:- Data Transfer Object
///POJO:-Plain Old Java Object
public class Employee {
	int eid;
	String ename;
	double sal;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	String getEname() {
		return ename;
	}

	void setSal(double sal) {
		this.sal = sal;
	}

	public double getsal() {
		return sal;
	}
}
