package com.EmpSalary;

/**
 * Hello world!
 */


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();

            if (basic <= 0) {
                throw new IllegalArgumentException("Invalid Salary");
            }

            Employee emp = new Employee(id, name, basic);
            SalaryCaluculator calc = new SalaryCaluculator();

            double hra = calc.calculateHRA(basic);
            double da = calc.calculateDA(basic);
            double bonus = calc.calculateBonus(basic);
            double gross = basic + hra + da + bonus;
            double pf = calc.calculatePF(basic);
            double tax = calc.calculateTax(gross);
            double net = gross - (pf + tax);

            SalarySlip slip = new SalarySlip();
            slip.printSlip(emp, hra, da, bonus, gross, pf, tax, net);

            SalaryDAO dao = new SalaryDAO();
            dao.saveSalary(emp, hra, da, bonus, gross, pf, tax, net);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
