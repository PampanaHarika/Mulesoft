package com.company;
import java.sql.*;
public class CreateMoviesDB {
    public static void main(String[] args) {
try {

            Connection connection = null;
            Statement statement = null;

            connection = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");
            System.out.println("Database Connection Successful !!");
            
            statement = connection.createStatement();
            String qry = "CREATE TABLE MyMovies " + "(MovieName TEXT NOT NULL,"
                    + " ActorName TEXT NOT NULL, " + " ActressName TEXT NOT NULL, "
                    + " ReleaseYear INTEGER NOT NULL, " + " DirectorName TEXT NOT NULL )";

           statement.executeUpdate(qry);


            statement.close();

           connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table Created successfully");
    }
}