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
 * @author Nicholas Johnson
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
    
    @Test
    public void testRadioOn() {
        System.out.println("Turns the radio On");
        Radio instance = new Radio();
        instance.radioOn();
        assertEquals(instance.getStatus(), true);
        
    }

    /**
     * Test of radioOff method, of class Radio.
     */
    @Test
    public void testRadioOff() {
        System.out.println("Turns the radio off");
        Radio instance = new Radio();
        instance.radioOff();
        assertEquals(instance.getStatus(), false);
    }

    /**
     * Test of scan method, of class Radio.
     */
    @Test
    public void testScan() {
        System.out.println("Decrease Frequency with the scan");
        boolean upOrDown = false;
        Radio instance = new Radio();
        float expectResult = instance.getStation();
        instance.setStation(0.5F);
        instance.scan(upOrDown);
        assertEquals(expectResult, 0.0,  0.4F);
    }
    
    
    
    @Test 
        public void testScan2() {
        System.out.println("Increase Frequency with the scan");
        boolean upOrDown = true;
        Radio instance = new Radio();
        float expectResult = instance.getStation();
        instance.setStation(0.5F);
        instance.scan(upOrDown);
        assertEquals(expectResult, 0.0,  0.6F);
    }
}
