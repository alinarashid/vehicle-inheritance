package com.pluralsight;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Moped
        Moped peachMoped = new Moped();
        peachMoped.setColor("Pink");
        peachMoped.setFuelCapacity(5);
        System.out.println("Princess Peach's moped is " + peachMoped.getColor() + " 🩷");
        peachMoped.pedal();

        // Mario's red car
        Car marioCar = new Car();
        marioCar.setColor("Red");
        marioCar.setNumberOfPassengers(2);
        System.out.println("Mario's car is " + marioCar.getColor() + " 🔴");
        marioCar.honk();

        // Bowser's big truck
        SemiTruck bowserTruck = new SemiTruck();
        bowserTruck.setColor("Orange");
        bowserTruck.setCargoCapacity(5000);
        System.out.println("Bowser's truck is " + bowserTruck.getColor() + " 🟠");
        bowserTruck.hookTrailer();

        // Luigi's green hovercraft
        Hovercraft luigiHover = new Hovercraft();
        luigiHover.setColor("Green");
        luigiHover.setNumberOfPassengers(4);
        System.out.println("Luigi's hovercraft is " + luigiHover.getColor() + " 🟢");
        luigiHover.hover();
    }
}
