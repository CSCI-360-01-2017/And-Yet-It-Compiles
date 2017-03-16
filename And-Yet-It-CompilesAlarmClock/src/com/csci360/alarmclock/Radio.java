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
public class Radio {
    
    private float station; // the station frequency.
    private boolean mode; // if True the radio is set to AM if false it is set to FM.
    private boolean status = false; // whether the radio is off or on.
    
    public void setStation(float newStation){
        station = newStation;
    }
    // Add station boundries
    public void setMode(boolean newMode){
        mode = newMode;
    }
    
    public void setStatus(boolean newStatus){
        status = newStatus;
    }
    
    public float getStation(){
        return station;
    }
    
    public boolean getMode(){
        return mode;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void radioOn(){
        // Turns the radio on.
        status = true;
    }
    
    public void radioOff(){
        // Turns the radio off.
        status = false;
    }
    
    public void scan(boolean upOrDown) { // True for scan up and false for down.
        // increments the station frequency
        if (upOrDown){
            station += .1;
        }else{
            station -= .1;
        }
       
        // TODO make sure the station frequency loops back on itself
    }
}
