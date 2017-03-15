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
        int newVolume = 0;
        AlarmSystem instance = new AlarmSystem();
        instance.setVolume(newVolume);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm1 method, of class System.
     */
    @Test
    public void testSetAlarm1() {
        System.out.println("setAlarm1");
        int hours = 0;
        int mins = 0;
        int secs = 0;
        AlarmSystem instance = new AlarmSystem();
        instance.setAlarm1(hours, mins, secs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm2 method, of class System.
     */
    @Test
    public void testSetAlarm2() {
        System.out.println("setAlarm2");
        int hours = 0;
        int mins = 0;
        int secs = 0;
        AlarmSystem instance = new AlarmSystem();
        instance.setAlarm2(hours, mins, secs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soundAlarm method, of class System.
     */
    @Test
    public void testSoundAlarm() {
        System.out.println("soundAlarm");
        AlarmSystem instance = new AlarmSystem();
        instance.soundAlarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of killAlarm method, of class System.
     */
    @Test
    public void testKillAlarm() {
        System.out.println("killAlarm");
        AlarmSystem instance = new AlarmSystem();
        instance.killAlarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class System.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        AlarmSystem instance = new AlarmSystem();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
