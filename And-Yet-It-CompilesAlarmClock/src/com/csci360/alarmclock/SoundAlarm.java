/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import java.util.*;

/**
 *
 * @author Nicholas Johnson and Josh Jettie
 */
public class SoundAlarm extends TimerTask{
    
    @Override
    public void run() {
        System.out.println("Buzz at:"+new Date());
    }
}
