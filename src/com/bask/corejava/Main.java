/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bask.corejava;

//import com.bask.corejava.ch2.CalendarPrinter;
import com.bask.corejava.ch2.Exercise4;
import com.bask.corejava.ch2.Point;
import org.omg.CORBA.IntHolder;

/**
 * Main class for other classes in the exercise.
 * @author baskoroi
 */
public class Main {
    
    public static void main(String[] args) {
//        CalendarPrinter cp = new CalendarPrinter(true, 1995, 7);
//        cp.printCalendar();

//        IntHolder i1 = new IntHolder(17);
//        IntHolder i2 = new IntHolder(5);
//        
//        Exercise4.intHolderSwap(i1, i2);
//        System.out.println(i1.value);
//        System.out.println(i2.value);

        Point pOld = new Point(3, 4);
        Point p = pOld.translate(1, 3).scale(0.5);
        
        System.out.println(pOld.getX());
        System.out.println(pOld.getY());
        
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
