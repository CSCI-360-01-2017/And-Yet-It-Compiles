/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;
import javax.swing.JTextField;
/**
 * This clock is used to keep track of time by displaying the time every second
 * taken from the Date class, using a timer to make the updates each second.
 * @author Nicholas Johnson
 */
public class Clock {
    private Timer timer;
    private boolean mode; // True = 12 hour clock False = 24 hour clock.
    private boolean on = true;
    private UpdateTime updateTime;

    /**
     * Constructor initializes the timer the moment it is constructed.
     */
    Clock(javax.swing.JTextField field5){
        timer = new Timer();
        updateTime = new UpdateTime(field5);
        timer.scheduleAtFixedRate(updateTime, 0, 1000);
    }
    
    //TODO: add some functionality to allow for 12-hour mode.
    
    /**
     * @return the isOn
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param isOn the isOn to set
     */
    public void setIsOn(boolean isOn) {
        this.on = isOn;
    }
}


