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
import java.util.*;

/**
 *
 * @author Nicholas Johnson and joshjettie
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
    * test alarm
    */
    @Test
    public void testAlarm() {
        System.out.println("alarm");
        Date time = new Date();
        System.out.println("Start time:" + time);
        time.setSeconds(time.getSeconds() + 30);
        boolean mode = true;
        Alarm instance = new Alarm(mode,time);
        try {
            //assuming it takes 30 secs to complete the task
            Thread.sleep(30*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }
    
   /**
    * test the snooze method.
    */
    @Test
    public void testSnooze() {
        System.out.println("snooze");        
       
    }
    
}
