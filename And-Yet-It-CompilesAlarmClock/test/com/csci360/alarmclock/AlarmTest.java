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
 * @author joshjettie
 */
public class AlarmTest {
    
    public AlarmTest() {
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
     * Test of setMode method, of class Alarm.
     */
    @Test
    public void testSetMode() {
        System.out.println("setMode");
        boolean newMode = true;
        Alarm instance = new Alarm();
        instance.setMode(newMode);
        assertEquals(instance.getMode() , true );
        
    }

    /**
     * Test of getMode method, of class Alarm.
     */
    @Test
    public void testGetMode() {
        System.out.println("getMode");
        Alarm instance = new Alarm();
        boolean expResult = false;
        boolean result = instance.getMode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAlarm method, of class Alarm.
     */
    @Test
    public void testSetAlarm() {
        System.out.println("setAlarm");
        int hours = 10;
        int minutes = 33;
        int seconds = 15;
        Alarm instance = new Alarm();
        instance.setAlarm(hours, minutes, seconds);
        assertEquals(instance.getAlarmHours(), 10);
        assertEquals(instance.getAlarmMinutes(), 33);
        assertEquals(instance.getAlarmSeconds(), 15);
    }

    /**
     * Test of snooze method, of class Alarm.
     */
    @Test
    public void testSnooze() {
        System.out.println("snooze");
        Alarm instance = new Alarm();
        instance.setAlarm(05, 55, 00);
        instance.snooze();
        assertEquals(instance.getAlarmMinutes(), 00 );
        assertEquals(instance.getAlarmHours(), 06 );
        
       
    }
    
}
