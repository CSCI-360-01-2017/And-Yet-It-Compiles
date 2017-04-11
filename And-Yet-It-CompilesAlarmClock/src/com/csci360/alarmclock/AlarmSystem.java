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
    private Clock clock;
    private int volume;
    
    AlarmSystem(javax.swing.JTextField field5){
        clock = new Clock(field5);
    }
    
    public void setVolume(int newVolume){
        volume = newVolume;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setAlarmOne(boolean mode, Date time, javax.swing.JTextField field3){
        alarmOne = new Alarm(mode, time, field3);
    }
    
    public void setAlarmTwo(boolean mode, Date time, javax.swing.JTextField field3){
        alarmTwo = new Alarm(mode, time, field3);
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
    public void snoozeAlarmOne(javax.swing.JTextField field3){
        Date timeOfSnooze = new Date();
        timeOfSnooze.setMinutes(timeOfSnooze.getMinutes() + SNOOZE_MINS);
        alarmOne = new Alarm(alarmOne.getMode(), timeOfSnooze, field3);
    }
    
    // Cancel the alarm and set it forward 5 mins.
    public void snoozeAlarmTwo(javax.swing.JTextField field3){
        Date timeOfSnooze = new Date();
        timeOfSnooze.setMinutes(timeOfSnooze.getMinutes() + SNOOZE_MINS);
        alarmTwo = new Alarm(alarmTwo.getMode(), timeOfSnooze, field3);
    }
}
