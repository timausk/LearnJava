package com.timausk;

public class Car {

    // fields are set protected => can be used in child class
    private double mileage;
    private int price;
    private int doors;


    public String carStart() {
        return "Car started";
    }

    public void carShutOff() {
        System.out.println("Car Engine off");
    }



    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

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
