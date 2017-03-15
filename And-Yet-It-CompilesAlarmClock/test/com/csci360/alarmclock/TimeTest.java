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
import java.util.Date;
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

    @Test
    public void testUpdateTime() {
        System.out.println("Test UpdateTime");
        Time instance = new Time();
        instance.updateTime();
    } 

    /**
     * Test of getHours method, of class Time.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Time instance = new Time();
        Date comp = new Date();
        instance.updateTime();
        int expResult = comp.getHours();
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
        Date comp = new Date();
        instance.updateTime();
        int expResult = comp.getMinutes();
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
        Date comp = new Date();
        instance.updateTime();
        int expResult = comp.getSeconds();
        int result = instance.getSeconds();
        assertEquals(expResult, result);
    }
    /**
     * Test of setHours method, of class Time.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int newHours = 13;
        Time instance = new Time();
        instance.setHours(newHours);
        assertEquals(instance.getHours(), newHours);
    }
        @Test
    public void testSetIncorrectHours() {
        System.out.println("SetIncorrectHours");
        int newHours = 90;
        Time instance = new Time();
        instance.setHours(newHours);
        assertEquals("Incorrect Hours", newHours);
    }

    /**
     * Test of setMinutes method, of class Time.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int newMinutes = 13;
        Time instance = new Time();
        instance.setMinutes(newMinutes);
        assertEquals(instance.getMinutes(), newMinutes);
    }

    /**
     * Test of setSeconds method, of class Time.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        int newSeconds = 13;
        Time instance = new Time();
        instance.setSeconds(newSeconds);
        assertEquals(instance.getSeconds(), newSeconds);
    } 

}

