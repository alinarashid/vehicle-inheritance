package com.pluralsight;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Moped
        Moped peachMoped = new Moped("Pink", 1, 10, 5);
        System.out.println("Princess Peach's moped is " + peachMoped.getColor() + " 🩷");
        peachMoped.pedal();

        // Mario's red car
        Car marioCar = new Car("Red", 4, 300, 12);
        System.out.println("Mario's car is " + marioCar.getColor() + " 🔴");
        marioCar.honk();

        // Bowser's big truck
        SemiTruck bowserTruck = new SemiTruck("Orange", 2, 40000, 150);
        System.out.println("Bowser's truck is " + bowserTruck.getColor() + " 🟠");
        bowserTruck.hookTrailer();

        // Luigi's green hovercraft
        Hovercraft luigiHover = new Hovercraft("Green", 8, 1000, 60);
        System.out.println("Luigi's hovercraft is " + luigiHover.getColor() + " 🟢");
        luigiHover.hover();
    }
}
