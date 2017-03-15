/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author joshjettie
 */
public class Alarm {
 private Time time = new Time();
 private Time time2Sound = new Time();
 private boolean mode = false; // False means radio and True means Buzz
 
    
 public void setMode(boolean newMode){
     mode = newMode;
 }   
 public boolean getMode(){
     return mode;
 }
 
 public void setAlarm(int hours,int minutes,int seconds){
     time2Sound.setHours(hours);
     time2Sound.setMinutes(minutes);
     time2Sound.setSeconds(seconds);
 }
 public void snooze(){
     int oldMins = time2Sound.getMinutes();
     int newMins = oldMins + 5;
     int oldHours = time2Sound.getHours();
     int newHours = oldHours;
     
     
     if(newMins >= 60){
         newMins -= 60;
         newHours += 1;
     }
     if(newHours >= 24){
         newHours = 00;
     }
     time2Sound.setHours(newHours);
     time2Sound.setMinutes(newMins);
     
     // also turn alarm off 
             
 }
     
 }
}
