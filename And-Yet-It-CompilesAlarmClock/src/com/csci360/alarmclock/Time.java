/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package com.csci360.alarmclock;
import java.util.Date;
/**
 *
 * This class is used to subscribe to the computer clock and
 * track time so that we can sound the Alarms.
 * 
 * @authors Nicholas Johnson and Josh Jettie
 */
public class Time {
      
    // These variables are used to track the computer clock.
    private int hours;
    private int minutes;
    private int seconds;
    
    
    /**
     * set the hours variable and be sure to check the bounds.
     * @param newHours 
     */
    public void setHours(int newHours){
        
        if(newHours >= 60 || newHours < 0){
           // TODO throw an error.
        }else{
           hours = newHours;
        }
    }
    
    /**
     * set the minutes variable and be sure to check bounds.
     * @param newMinutes 
     */
    public void setMinutes(int newMinutes){
        
        if(newMinutes >= 60 || newMinutes < 0){
           // TODO throw an error.
        }else{
           hours = newMinutes;
        }
    }
    
    /**
     * set the seconds variable and be sure to check bounds.
     * @param newSeconds 
     */
    public void setSeconds(int newSeconds){
        
        if(newSeconds >= 60 || newSeconds < 0){
           // TODO throw an error.
        }else{
           hours = newSeconds;
        }
    }
    
    /**
     * 
     * @return hours 
     */
    public int getHours(){
        return hours;
    }
    
    /**
     * 
     * @return minutes
     */
    public int getMinutes(){
        return minutes;
    }
    
    /**
     * 
     * @return seconds
     */
    public int getSeconds(){
        return seconds;
    }
    
    /**
     * set all time variables to the time of the computer clock.
     */
    public void updateTime(){
        
       Date date = new Date();
       setHours(date.getHours());
       setMinutes(date.getMinutes());
       setSeconds(date.getSeconds());

    } 
}
