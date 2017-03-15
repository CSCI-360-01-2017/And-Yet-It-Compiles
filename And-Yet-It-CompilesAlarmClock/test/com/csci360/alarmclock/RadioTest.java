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
 * @author Mikaila Johnson
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of setStation method, of class Radio.
     */
    @Test
    public void testSetStation() {
        System.out.println("setStation");
        float newStation = 0.0F;
        Radio instance = new Radio();
        instance.setStation(newStation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMode method, of class Radio.
     */
    @Test
    public void testSetMode() {
        System.out.println("setMode");
        boolean newMode = false;
        Radio instance = new Radio();
        instance.setMode(newMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Radio.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean newStatus = false;
        Radio instance = new Radio();
        instance.setStatus(newStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStation method, of class Radio.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        Radio instance = new Radio();
        float expResult = 0.0F;
        float result = instance.getStation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMode method, of class Radio.
     */
    @Test
    public void testGetMode() {
        System.out.println("getMode");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Radio.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radioOn method, of class Radio.
     */
    @Test
    public void testRadioOn() {
        System.out.println("radioOn");
        Radio instance = new Radio();
        instance.radioOn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radioOff method, of class Radio.
     */
    @Test
    public void testRadioOff() {
        System.out.println("radioOff");
        Radio instance = new Radio();
        instance.radioOff();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scan method, of class Radio.
     */
    @Test
    public void testScan() {
        System.out.println("scan");
        boolean upOrDown = false;
        Radio instance = new Radio();
        instance.scan(upOrDown);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
