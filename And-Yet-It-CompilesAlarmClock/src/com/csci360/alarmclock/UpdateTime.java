/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;
import javax.swing.JTextField;
/**
 * This is a timertask that is used to print out the current clock time.
 * @author Josh Jettie and Nicholas Johnson
 */
public class UpdateTime extends TimerTask{
    
        private javax.swing.JTextField clockField;
    
        UpdateTime(javax.swing.JTextField field5){
            clockField = field5;
        }
    
        @Override
        public void run() {
        System.out.println("Clock Tick: " + new Date()); // this will be used by the GUI
        

        
        Date updateTime = new Date();
        String updateFormated = updateTime.getHours() + ":" + updateTime.getMinutes()
                + ":" + updateTime.getSeconds();
        clockField.setText(updateFormated);
    }
}
