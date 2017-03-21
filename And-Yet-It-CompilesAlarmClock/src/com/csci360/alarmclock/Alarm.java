/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;

/**
 * This class deals with setting an alarm that will sound at the specified date.
 * @author Nicholas Johnson and Josh Jettie
 */
public class Alarm {
 private Timer alarm;
 private SoundAlarm soundAlarm;
 private boolean mode; // False means radio and True means Buzz
 
    /**
     * Constructor takes the mode (true = buzz, false = radio) and the time
     * to sound as a Date.
     */
    Alarm(boolean setMode, Date time){
        alarm = new Timer();
        mode = setMode;
        soundAlarm = new SoundAlarm(setMode);
        alarm.schedule(soundAlarm, time);
    }
 
    // These aren't used so we might trash them.
     public void setMode(boolean newMode){
         mode = newMode;
    }   
    public boolean getMode(){
        return mode;
    }
 }

