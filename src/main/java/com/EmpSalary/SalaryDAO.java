package com.EmpSalary;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SalaryDAO {

    public void saveSalary(Employee emp, double hra, double da, double bonus,
                           double gross, double pf, double tax, double net) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO employee_salary VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp.getEmpId());
            ps.setString(2, emp.getEmpName());
            ps.setDouble(3, emp.getBasicSalary());
            ps.setDouble(4, hra);
            ps.setDouble(5, da);
            ps.setDouble(6, bonus);
            ps.setDouble(7, gross);
            ps.setDouble(8, pf);
            ps.setDouble(9, tax);
            ps.setDouble(10, net);

            ps.executeUpdate();

            System.out.println("\n✔ Salary details saved to database");

            con.close();

        } catch (Exception e) {
            System.out.println("Error Saving Data: " + e);
        }
    }
}

