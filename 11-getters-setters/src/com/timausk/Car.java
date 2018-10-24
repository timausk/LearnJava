package com.timausk;

public class Car {

    // fields are set private => encapsulation
    private double mileage;
    private int price;
    private int doors;


    public void carStart() {
        System.out.println("Car started");
    }

    public void carShutOff() {
        System.out.println("Car Engine off");
    }


    // WHY using GETTER/SETTER
    // - protect class properties from outside being accessible
    // - a security layer, we try to encapsulate
    // - good practice to use access modifiers (private, public, protected)
    // - anyone could access classes public properties

    // SETTER for a filed
    // set a class private property from outside via a SETTER
    // setter are always VOID
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // GETTER for a filed
    // get a class private property from outside via a GETTER
    // getter always return a value
    public double getMileage() {
        return this.mileage;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
