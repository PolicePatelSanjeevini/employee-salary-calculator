package com.EmpSalary;

public class Employee {

    private int empId;
    private String empName;
    private double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

