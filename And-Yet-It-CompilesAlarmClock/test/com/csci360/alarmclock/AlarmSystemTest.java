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
 * Tests for the alarm system class
 * @author Nicholas Johnson and Josh Jettie
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
    * test the snooze method.
    
    @Test
    public void testSnooze() {
        System.out.println("snooze");        
        Date time = new Date();
        System.out.println("Start time:" + time);
        time.setSeconds(time.getSeconds() + 3);
        boolean mode = false;
        AlarmSystem system = new AlarmSystem();
        system.setAlarmOne(mode,time);
        system.snoozeAlarmOne();        
        try {
            //assuming it takes 6 secs to complete the task
            Thread.sleep(6*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    */
}
