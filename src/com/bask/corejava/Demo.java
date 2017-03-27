/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bask.corejava;

import com.bask.corejava.ch2.CalendarPrinter;

/**
 * Demo class for other classes in the exercise.
 * @author baskoroi
 */
public class Demo {
    
    public static void main(String[] args) {
        CalendarPrinter cp = new CalendarPrinter(true, 1995, 7);
        cp.printCalendar();
    }
}
