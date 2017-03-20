/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;

/**
 *
 * @author Nicholas Johnson and Josh Jettie
 */
public class Alarm {
 private Timer alarm;
 private SoundAlarm soundAlarm;
 private boolean mode = false; // False means radio and True means Buzz
 
    /**
     * Constructor takes the mode (true = buzz, false = radio) and the time
     * to sound as a Date.
     */
    Alarm(boolean setMode, Date time){
        alarm = new Timer();
        soundAlarm = new SoundAlarm();
        mode = setMode;
        alarm.schedule(soundAlarm, time);
    }
 
    
 public void setMode(boolean newMode){
     mode = newMode;
 }   
 public boolean getMode(){
     return mode;
 }

     
 }

