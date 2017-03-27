/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bask.corejava.ch2;

/**
 * 9. Implement a class Car that models a car traveling along the x-axis,
 * consuming gas as it moves. Provide methods to drive by a given number of
 * miles, to add a given number of gallons to the gas tank, and to get the
 * current distance from the origin and fuel level. Specify the fuel efficiency
 * (in miles/gallons) in the constructor. Should this be an immutable class?
 * Why or why not?
 * 
 * Answer: It is rather unsuitable to make this an immutable class. 
 * Because the mileage and fuel spent to travel represent changes 
 * happening in the car / object.
 * 
 * It would be more accurate to make this class mutable.
 * 
 * @author baskoroi
 */
public class Car {
    
    private double mileage;
    private double fuel;
    private final double efficiency;

    public Car(double efficiency) {
        this.efficiency = efficiency;
        this.mileage = 0;
        this.fuel = 14;
    }
    
    public void travel(double miles) {
        double fuelSpent = miles / this.efficiency;
        if (fuelSpent > this.fuel) {
            System.out.println("Your fuel is not enough. Enter the "
                    + "correct number of miles.");
            return;
        }
        
        this.mileage += miles;
        this.fuel -= fuelSpent;
    }

    public void refuel(double gallons) {
        this.fuel += gallons;
    }
    
    public double getFuel() {
        return fuel;
    }

    public double getMileage() {
        return mileage;
    }
    
}
