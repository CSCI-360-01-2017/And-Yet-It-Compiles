/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.sql.Date;

/**
 *
 * @author Nicholas Johnson
 */
public class AlarmSystem {
    
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
    
    public void setAlarm1(boolean mode, Date time){
        alarmOne = new Alarm(mode, time);
    }
    
    public void setAlarm2(boolean mode, Date time){
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
}
