/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;
/**
 * This is a timertask that is used to print out the current clock time.
 * @author Josh Jettie and Nicholas Johnson
 */
public class UpdateTime extends TimerTask{
    
        @Override
        public void run() {
        System.out.println(new Date()); // this will be used by the GUI
    }
}
