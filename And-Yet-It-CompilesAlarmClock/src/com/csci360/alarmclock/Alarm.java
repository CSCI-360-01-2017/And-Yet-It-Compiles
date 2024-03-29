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
 private Date time2Sound;
 
    /**
     * Constructor takes the mode (true = buzz, false = radio) and the time
     * to sound as a Date.
     */
    Alarm(boolean setMode, Date time, javax.swing.JTextField field3){
        alarm = new Timer();
        mode = setMode;
        time2Sound = time;
        soundAlarm = new SoundAlarm(setMode, field3);
        alarm.schedule(soundAlarm, time);
    }
 
    // These setters aren't used so we might trash them.
    public void setMode(boolean newMode){
         mode = newMode;
    }   
    public boolean getMode(){
        return mode;
    }
    
    public Date getTime2Sound(){
        return time2Sound;
    }
 }

