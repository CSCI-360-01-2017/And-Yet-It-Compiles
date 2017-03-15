/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.Date;
import java.util.GregorianCalendar; 
/**
 *
 * @author Nicholas Johnson
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public void setHours(int newHours){
        hours = newHours;
    }
    
    public void setMinutes(int newMinutes){
        minutes = newMinutes;
    }
    
    public void setSeconds(int newSeconds){
        seconds = newSeconds;
    }
    
    public int getHours(){
        return hours; // skeleton
    }
    
    public int getMinutes(){
        return minutes; // skeleton
    }
    
    public int getSeconds(){
        return seconds; // skeleton
    }
    public Date getTime(){
        GregorianCalendar time = new GregorianCalendar();
        
        Date ret = new Date();
        ret = time.getTime();
        
      return ret;  
    }



    
    
    
    
}
