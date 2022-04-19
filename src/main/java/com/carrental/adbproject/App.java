package com.carrental.adbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
  public static void main(String[] args) {
//    System.out.println("Hello World!");
    try (Connection conn = DriverManager.getConnection(
//    		104.198.78.215
//            "jdbc:mysql://104.198.78.215", "root", "Radhakrishna@963")) {
    	 "jdbc:mysql://104.198.78.215:vinodadbproj?user=root")){

        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }

    } catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }



  }
}
