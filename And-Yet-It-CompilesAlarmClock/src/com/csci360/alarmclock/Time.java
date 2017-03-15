/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author Nicholas Johnson
 */
public class Time {
    int hours;
    int minutes;
    int seconds;
    
    public void setHours(int newHours){
        hours = newHours;
    }
    
    public void setMinutes(int newMinutes){
        minutes = newMinutes;
    }
    
    public void setSeconds(int newSeconds){
        seconds = newSeconds;
    }
    
    public static int getHours(){
        return 1; // skeleton
    }
    
    public static int getMinutes(){
        return 1; // skeleton
    }
    
    public static int getSeconds(){
        return 1; // skeleton
    }
}
