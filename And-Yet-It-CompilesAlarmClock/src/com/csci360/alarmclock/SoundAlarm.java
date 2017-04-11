/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;

/**
 * This is a timertask that is supposed to turn on the alarm.
 * @author Nicholas Johnson and Josh Jettie
 */
public class SoundAlarm extends TimerTask{
    
    private boolean mode; // False means radio and True means Buzz
    private javax.swing.JTextField displayField;
    
    /**
     * Constructor that sets the mode
     * @param setMode 
     */
    SoundAlarm(boolean setMode, javax.swing.JTextField field3){
        mode = setMode;
        displayField = field3;
    }
    
    @Override
    public void run() {
        if (this.mode){
            System.out.println("Buzz at:"+new Date());
            
            displayField.setText("Buzzing...");
        }else{
            System.out.println("Radio is playing at:"+new Date());
            
            displayField.setText("Radio is playing...");
        }
    }

    /**
     * @return the mode
     */
    public boolean getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(boolean mode) {
        this.mode = mode;
    }
}
