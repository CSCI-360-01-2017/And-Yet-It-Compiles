/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.util.Date;

/**
 *
 * @author Nicholas Johnson
 */
public class AlarmSystem {
    
    final int SNOOZE_MINS = 5;
    
    private Alarm alarmOne;
    private Alarm alarmTwo;
    private Radio radio = new Radio();
    private Clock clock = new Clock();
    private int volume;
    
    public void setVolume(int newVolume){
        volume = newVolume;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setAlarmOne(boolean mode, Date time){
        alarmOne = new Alarm(mode, time);
    }
    
    public void setAlarmTwo(boolean mode, Date time){
        alarmTwo = new Alarm(mode, time);
    }
    
    public void changeStation(float frequency){
        
        if(frequency > 88.0 && frequency < 106.0){
        radio.setStation(frequency);
        }
    }
    
    public void radioOnOrOff(boolean onOrOff){ // True = on False = off.
        if(onOrOff){
            radio.radioOn();
        }else{
            radio.radioOff();
        }
    }
    
    public Alarm getAlarmOne(){
        return alarmOne;
    }
    
    public Alarm getAlarmTwo(){
        return alarmTwo;
    }
    
    public Clock getClock(){
        return clock;
    }
    
    // Cancel the alarm and set it forward 5 mins.
    public void snoozeAlarmOne(){
        Date timeBeforeSnooze = alarmOne.getTime2Sound();
        timeBeforeSnooze.setMinutes(timeBeforeSnooze.getMinutes() + SNOOZE_MINS);
        alarmOne = new Alarm(alarmOne.getMode(), timeBeforeSnooze);
    }
}
