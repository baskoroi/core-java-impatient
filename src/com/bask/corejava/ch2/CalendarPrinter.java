/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bask.corejava.ch2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author baskoroi
 */
public class CalendarPrinter {
    
    private LocalDate date;
    private int currentMonth;
    private boolean isSundayFirst;

    public CalendarPrinter(boolean isSundayFirst) {
        LocalDate temp = LocalDate.now();
        this.date = LocalDate.of(temp.getYear(), temp.getMonth(), 1);
        this.currentMonth = date.getMonthValue();
        this.isSundayFirst = isSundayFirst;
    }
    
    public CalendarPrinter(boolean isSundayFirst, int year, int month) {
        this.date = LocalDate.of(year, month, 1);
        this.currentMonth = month;
        this.isSundayFirst = isSundayFirst;
    }
    
    private void printCalendarHeader() {
        System.out.printf("Month/Year: %s %d\n", date.getMonth().getDisplayName(
                TextStyle.FULL, Locale.ENGLISH), date.getYear());
        
        if (isSundayFirst) {
            System.out.printf("%4c %4c %4c %4c %4c %4c %4c\n",
                'S', 'M', 'T', 'W', 'T', 'F', 'S');   
        } else {
            System.out.printf("%4c %4c %4c %4c %4c %4c %4c\n",
                'M', 'T', 'W', 'T', 'F', 'S', 'S');
        }
    }
    
    /**
     * if the date doesn't start on Sunday,
     * print heading spaces
     */
    private void printHeadingSpaces() {
        DayOfWeek comparisonDow = isSundayFirst ? 
                DayOfWeek.SUNDAY : DayOfWeek.MONDAY;
        int startingIndex = isSundayFirst ? 0 : 1;
        DayOfWeek dow = date.getDayOfWeek();
        if (dow != comparisonDow) {
            for (int i = startingIndex; i < dow.getValue(); i++) {
                System.out.printf("%4c ", ' ');
            }
        }
    }
    
    /**
     * print all the date numbers for the calendar
     */
    private void printDateNumbers() {
        DayOfWeek comparisonDow = isSundayFirst ? 
                DayOfWeek.SUNDAY : DayOfWeek.MONDAY;
        while (date.getMonthValue() == this.currentMonth) {
            System.out.printf("%4d ", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek() == comparisonDow)
                System.out.println();
        }
        
        // endline for format tidiness
        System.out.println();
    }
    
    /**
     * Print the calendar
     */
    public void printCalendar() {
        this.printCalendarHeader();
        this.printHeadingSpaces();
        this.printDateNumbers();
    }
    
}
