package com.timausk;

public class Main {

    public static void main(String[] args) {

        // equal to define properties via object
        Car porsche = new Car();

        porsche.setMileage(6.123);
        porsche.setPrice(65900);
        porsche.setDoors(2);

        System.out.println("mileage is " + porsche.getMileage());
        System.out.println("price is " + porsche.getPrice());
        System.out.println("amount of doors is " + porsche.getDoors());
    }
}
