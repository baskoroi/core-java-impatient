/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bask.corejava;

//import com.bask.corejava.ch2.CalendarPrinter;
import com.bask.corejava.ch2.Car;

/**
 * Main class for other classes in the exercise.
 * @author baskoroi
 */
public class Main {
    
    public static void main(String[] args) {
        Car car = new Car(23.6);
        System.out.println("Fuel #1: " + car.getFuel());
        System.out.println("Mileage #1: " + car.getMileage());
        
        car.travel(200);
        System.out.println("Fuel #2: " + car.getFuel());
        System.out.println("Mileage #2: " + car.getMileage());
        
        car.refuel(10);
        System.out.println("Fuel #3: " + car.getFuel());
        System.out.println("Mileage #3: " + car.getMileage());
        
        car.travel(300);
        System.out.println("Fuel #4: " + car.getFuel());
        System.out.println("Mileage #4: " + car.getMileage());
    }
}
