/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bask.corejava;

import com.bask.corejava.ch2.Queue;
import com.bask.corejava.ch2.Queue.Iterator;

/**
 * Main class for other classes in the exercise.
 * @author baskoroi
 */
public class Main {
    
    public static void main(String[] args) {
        
        Queue<String> queue = new Queue<>();
        queue.add("Baskoro");
        queue.add("Indrayana");
        queue.add("Jessica");
        queue.add("Lynn");
        queue.add("Marie");
        
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
//        queue.print();
//        System.out.println();
//        
//        String s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//
//        s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue.remove();
//        queue.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
        
//        Queue<String> queue2 = new Queue<>();
//        queue2.add("Janji-Mu");
//        queue2.add("S'perti");
//        queue2.add("Fajar");
//
//        s = queue2.remove();
//        queue2.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue2.remove();
//        queue2.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue2.remove();
//        queue2.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
//        
//        s = queue2.remove();
//        queue2.print();
//        System.out.println("Removed item: " + s);
//        System.out.println();
        
//        CSVReader reader = new CSVReader(
//                new FileReader("SacramentocrimeJanuary2006.csv"));
//        
//        String[] nextLine;
//        
//        while ((nextLine = reader.readNext()) != null) {
//            for (int i = 0; i < nextLine.length; i++) 
//                System.out.printf("| %4s ", nextLine[i]);
//            System.out.println("|");
//        }
        
//        Car car = new Car(23.6);
//        System.out.println("Fuel #1: " + car.getFuel());
//        System.out.println("Mileage #1: " + car.getMileage());
//        
//        car.travel(200);
//        System.out.println("Fuel #2: " + car.getFuel());
//        System.out.println("Mileage #2: " + car.getMileage());
//        
//        car.refuel(10);
//        System.out.println("Fuel #3: " + car.getFuel());
//        System.out.println("Mileage #3: " + car.getMileage());
//        
//        car.travel(300);
//        System.out.println("Fuel #4: " + car.getFuel());
//        System.out.println("Mileage #4: " + car.getMileage());
    }
}
