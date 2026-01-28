package com.EmpSalary;

public class SalarySlip {

    public void printSlip(Employee emp, double hra, double da, double bonus,
                          double gross, double pf, double tax, double net) {

        System.out.println("\n=========== SALARY SLIP ===========");
        System.out.println("ID      : " + emp.getEmpId());
        System.out.println("Name    : " + emp.getEmpName());
        System.out.println("Basic   : " + emp.getBasicSalary());
        System.out.println("----------------------------------");
        System.out.println("HRA     : " + hra);
        System.out.println("DA      : " + da);
        System.out.println("Bonus   : " + bonus);
        System.out.println("Gross   : " + gross);
        System.out.println("----------------------------------");
        System.out.println("PF      : " + pf);
        System.out.println("Tax     : " + tax);
        System.out.println("Net Pay : " + net);
        System.out.println("==================================");
    }
}

