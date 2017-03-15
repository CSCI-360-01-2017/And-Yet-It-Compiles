/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josh Jettie
 */
public class TimeTest {
    
    public TimeTest() {
    }
    
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
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getHours();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMinutes method, of class Time.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getMinutes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeconds method, of class Time.
     */
    @Test
    public void testGetSeconds() {
        System.out.println("getSeconds");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getSeconds();
        assertEquals(expResult, result);
    }
    /**
     * Test of setHours method, of class Time.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int newHours = 0;
        Time instance = new Time();
        instance.setHours(newHours);
    }

    /**
     * Test of setMinutes method, of class Time.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int newMinutes = 0;
        Time instance = new Time();
        instance.setMinutes(newMinutes);
    }

    /**
     * Test of setSeconds method, of class Time.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        int newSeconds = 0;
        Time instance = new Time();
        instance.setSeconds(newSeconds);
    } 
    @Test
    public void testgetTime() {
        System.out.println("Test getTime");
        Time instance = new Time();
        System.out.println(instance.getTime());
    } 

}
