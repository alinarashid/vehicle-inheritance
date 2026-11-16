package com.pluralsight;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Moped extends Vehicle {
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public void pedal() throws InterruptedException{
        System.out.println("Pedaling the moped!");
        Thread.sleep(1000);
        System.out.println("🏍️🏍️🏍️");
        Thread.sleep(500);
    }
}
