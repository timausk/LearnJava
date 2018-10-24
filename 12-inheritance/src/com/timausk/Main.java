package com.timausk;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        DirtCar dirtCar = new DirtCar();


        porsche.setMileage(6.123);
        porsche.setPrice(65900);
        porsche.setDoors(2);

        System.out.println("- - - - - PORSCHE - - - - -");
        System.out.println("mileage is " + porsche.getMileage());
        System.out.println("price is " + porsche.getPrice());
        System.out.println("amount of doors is " + porsche.getDoors());



        dirtCar.setMileage(6);
        dirtCar.setDoors(2);
        dirtCar.setPrice(19000);
        dirtCar.setDirtyTerrainTopSpeed(85);

        System.out.println("- - - - - DIRT CAR - - - - -");
        System.out.println("mileage is " + dirtCar.getMileage());
        System.out.println("price is " + dirtCar.getPrice());
        System.out.println("amount of doors is " + dirtCar.getDoors());
        System.out.println("top speed of " + dirtCar.getDirtyTerrainTopSpeed());

        // call super
        System.out.println(dirtCar.startDirtCar());

    }
}
