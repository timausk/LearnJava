package com.timausk;

public class Main {

    public static void main(String[] args) {

        DirtCar dirtCar = new DirtCar(6, 73555, 2, 75);


        System.out.println("- - - - - DIRT CAR - - - - -");
        System.out.println("mileage is " + dirtCar.getMileage());
        System.out.println("price is " + dirtCar.getPrice());
        System.out.println("amount of doors is " + dirtCar.getDoors());
        System.out.println("top speed of " + dirtCar.getDirtyTerrainTopSpeed());

        // call super
        System.out.println(dirtCar.startDirtCar());

    }
}
