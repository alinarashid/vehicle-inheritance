package com.pluralsight;

public class Car extends Vehicle{
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void honk(){
        System.out.println("Beep boop beep!");
    }
    public void lockDoors(){
        System.out.println("Doors locked!");
    }
}
