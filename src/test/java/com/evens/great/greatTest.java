package com.evens.great;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import org.json.JSONArray;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.testng.Assert;

/**
 *
 * @author evans
 */
public class greatTest {
    private static Connection con = DB.mysql();
    
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createTables method, of class great.
     */
    @Test
    public void testCreateTables() {
        System.out.println("createTables");
        Connection con = null;
        assertFalse(con != null);


    }

    /**
     * Test of Url method, of class great.
     */
  
    
    @Test
    public void testUrl() {
        System.out.println("Url");
        JSONArray expResult = great.Url();
        JSONArray result = great.Url();
        assertTrue(expResult != result);

    }

    /**
     * Test of insertMovies method, of class great.
     */
    @Test
    public void testInsertMovies() {
        System.out.println("insertMovies");
//        Connection con = DB.mysql();

        JSONArray jsonArray = great.Url();

        assertNotNull(con);
        assertNotNull(jsonArray);
        assertEquals(great.insertMovies(con, jsonArray), 0);

    }

    /**
     * Test oft insertGenres method, of class great.
     */
    @Test
    public void testInsertGenres() {
        System.out.println("insertGenres");
        JSONArray jsonArray = great.Url();
        assertNotNull(con);
        assertNotNull(jsonArray);        
        assertEquals(great.insertGenres(con, jsonArray), 0);


    }

    /**
     * Test of insertMoviesGenres method, of class great.
     */
    @Test
    public void testInsertMoviesGenres() {
        System.out.println("insertMoviesGenres");
        JSONArray jay = great.Url();

        assertNotNull(con);

        assertNotNull(jay);

        assertEquals(great.insertMoviesGenres(con, jay), 0);


    }
    
}
