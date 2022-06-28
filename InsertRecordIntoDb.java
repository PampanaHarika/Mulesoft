package com.company;

import java.sql.*;

public class InsertRecordIntoDb {
    public static void main(String[] args) {
        try {
             Connection con = null;
             Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");
            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement
            
            String query0 = "INSERT INTO MyMovies values ('bigil','vijay','nayanathara', 2019,'atlee');";
            stmt.executeUpdate(query0); // Create Query-1
            
            String query1 = "INSERT INTO MyMovies values ('master','vijay','malavika', 2020,'lokesh');";
            stmt.executeUpdate(query1); // Create Query-1
 
            String query2 = "INSERT INTO MyMovies values ('beast','vijay','pooja',2022,'nelson');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO MyMovies values ('jersey','nani','Shradda',2018,'gowtham');";
            stmt.executeUpdate(query3); // Create Query-3
            
            String query4 = "INSERT INTO MyMovies values ('don','sivakarthikeya','priyanka',2022,'C.B chakravarthi');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO MyMovies values ('karnan','dhanush','rajishavijayan',2019,'mariselvaraj');";
            stmt.executeUpdate(query5);
            stmt.close();
            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}