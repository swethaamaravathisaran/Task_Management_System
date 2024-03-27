package com.example.t1;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "swetha@9524#");
             Statement smt = con.createStatement()) {

            // Use a different UserID to avoid the duplicate key violation
            String sql = "INSERT INTO user ( user_name, password, email_id) VALUES ( 'swetha', 'shanofa', 'rizu@email.com')";

            smt.executeUpdate(sql);
            System.out.println("Record inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

