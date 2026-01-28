package com.EmpSalary;

public class SalaryCaluculator {

    public double calculateHRA(double basic) {
        return basic * 0.20;
    }

    public double calculateDA(double basic) {
        return basic * 0.10;
    }

    public double calculatePF(double basic) {
        return basic * 0.12;
    }

    public double calculateBonus(double basic) {
        return basic > 40000 ? 5000 : 3000;
    }

    public double calculateTax(double gross) {
        return gross > 50000 ? gross * 0.10 : gross * 0.05;
    }
}
