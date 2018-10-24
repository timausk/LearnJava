package com.timausk;

public class Car {

    private double mileage;
    private int price;
    private int doors;


    // constructor
    public Car(double mileage, int price, int doors) {
        this.mileage = mileage;
        this.price = price;
        this.doors = doors;
    }

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
