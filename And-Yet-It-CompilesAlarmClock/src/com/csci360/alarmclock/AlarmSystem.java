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
public class AlarmSystem {
    
    private Alarm alarmOne = new Alarm();
    private Alarm alarmTwo = new Alarm();
    private Radio radio = new Radio();
    //TODO add clock?
    private int volume;
    
    public void setVolume(int newVolume){
        volume = newVolume;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setAlarm1(int hours, int mins, int secs){
        alarmOne.setAlarm(hours, mins, secs);
    }
    
    public void setAlarm2(int hours, int mins, int secs){
        alarmTwo.setAlarm(hours, mins, secs);
    }
    
    public void changeStation(float frequency){
        // TODO make sure that the frequency is in the correct range.
        radio.setStation(frequency);
    }
    
    public void radioOnOrOff(boolean onOrOff){ // True = on False = off.
        if(onOrOff){
            radio.radioOn();
        }else{
            radio.radioOff();
        }
    }
    public void soundAlarm(){
        // TODO set off an alarm.
    }
    
    public void killAlarm(){
        //TODO turn off an alarm.
    }
    
    public void start(){
        //TODO connect to the GUI
    }
}
