package com.company;

import java.sql.*;
public class RetrieveDataFromDb {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MyMovies;");

            while (rs.next()) {
       
                  String movieName = rs.getString("MovieName");

                  String movieDirector = rs.getString("DirectorName");

                  String maleActor = rs.getString("ActorName");
                  String femaleActor = rs.getString("ActressName");

                 int releaseYear = rs.getInt("ReleaseYear");
                 System.out.println("Movie         : " + movieName);

                System.out.println("Director      : " + movieDirector);

                System.out.println("Actor         : " + maleActor);

                System.out.println("Actress       : " + femaleActor);

                System.out.println("Release Year  : " + releaseYear);

                System.out.println();

}

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Data retrieval successful!!");
    }
}