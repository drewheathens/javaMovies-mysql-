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

/**
 *
 * @author evans
 */
public class greatTest {
    
    @BeforeClass
    public static void setUpClass() {
        Connection con = DB.mysql();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        DB.mysql();
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of Url method, of class great.
     */
    @Test
    public void testUrl() {
        System.out.println("Url");
        JSONArray expResult = null;
        JSONArray result = great.Url();
        assertTrue(expResult != result);

    }

    /**
     * Test of createTables method, of class great.
     */
    @Test
    public void testCreateTables() {
        System.out.println("createTables");
        great.createTables();

    }

    /**
     * Test of insertMovies method, of class great.
     */
    @Test
    public void testInsertMovies() {
        System.out.println("insertMovies");
        great.insertMovies();

    }

    /**
     * Test of insertGenres method, of class great.
     */
    @Test
    public void testInsertGenres() {
        System.out.println("insertGenres");
        great.insertGenres();
//        great genre = new great();
//        assertTrue();
        

    }

    /**
     * Test of insertMoviesGenres method, of class great.
     */
    @Test
    public void testInsertMoviesGenres() {
        System.out.println("insertMoviesGenres");
        great.insertMoviesGenres();

    }


    
}
