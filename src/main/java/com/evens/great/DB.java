package com.evens.great;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.JSONArray;

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
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedb", "evans", "evansMU#1");

            if (con != null) {
                System.out.println("connected!!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failure.");
            return con;

        }
        return con;
    }

    public static void main(String[] args) {
//        Connection con;
        JSONArray jsonArray = great.Url();
        
        System.out.println("Running main method now!!");
        Connection con = DB.mysql();

        great.createTables(con);
        great.insertMovies(con, jsonArray);
        great.insertGenres(con, jsonArray);
        great.insertMoviesGenres(con, jsonArray);

    }

}
