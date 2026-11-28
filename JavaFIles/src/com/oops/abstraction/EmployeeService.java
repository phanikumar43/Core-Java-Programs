package com.oops.abstraction;

public abstract class EmployeeService implements EmployeePortal {

    public void addEmp() {
        System.out.println("Employee added successfully");
    }

    public void deleteEmp() {
        System.out.println("Employee deleted successfully");
    }

    @Override
    public void checkSal() {
        System.out.println("Employee salary is 30000");
    }

    public void grantPromotion() {
        System.out.println("Promotion granted successfully");
    }
}
