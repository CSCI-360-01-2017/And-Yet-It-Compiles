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
public class AlarmSystemTest {
    
    public AlarmSystemTest() {
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
     * Test of setVolume method, of class System.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        int newVolume = 10;
        AlarmSystem instance = new AlarmSystem();
        instance.setVolume(newVolume);
        assertEquals(newVolume, 10);
        
    }

    /**
     * Test of getVolume method, of class System.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        AlarmSystem instance = new AlarmSystem();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, result);
    }    
}
