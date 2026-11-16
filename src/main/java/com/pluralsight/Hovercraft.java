package com.pluralsight;

public class Hovercraft extends Vehicle {
    public void hover ()throws InterruptedException{
        System.out.println("Floating over the water…? ");
        Thread.sleep(1000);
        System.out.println("🌊🌊🌊");


    }
}
