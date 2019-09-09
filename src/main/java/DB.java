import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evans
 */

    public class DB {

    public static Connection mysql() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedb", "evans", "evansMU#1");
            
            if (connection != null){
                System.out.println("connected!!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failure.");
            return connection;
        }
        return connection;
    }

    public static void main(String[] args) {
        DB.mysql();

        System.out.println("Testing application");
        great.Url();
        great.createTables();
        great.insertMovies();
        great.insertGenres();
        great.insertMoviesGenres();
//        great.insert();
//        great.countGenre();
    }

}

    

