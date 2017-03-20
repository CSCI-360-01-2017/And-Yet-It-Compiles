/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;
/**
 *
 * @author Nicholas Johnson
 */
public class Clock {
    private Timer timer;
    private boolean mode; // True = 12 hour clock False = 24 hour clock.
    private boolean on = true;
    private UpdateTime updateTime;


    Clock(){
        timer = new Timer();
        updateTime = new UpdateTime();
        timer.scheduleAtFixedRate(updateTime, 0, 1000);
    }
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


