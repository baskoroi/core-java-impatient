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
        Point pOld = new Point(3, 4);
        Point p = pOld.translate(1, 3).scale(0.5);
        
        System.out.println(pOld.getX());
        System.out.println(pOld.getY());
        
        System.out.println(p.getX());
        System.out.println(p.getY());
        
        pOld.translateMutably(1, 3);
        pOld.scaleMutably(0.5);
        
        // check whether the mutator methods have worked: yes
        System.out.println(pOld.getX());
        System.out.println(pOld.getY());
    }
}
