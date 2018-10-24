package com.timausk;

public class Main {

    public static void main(String[] args) {

        // equal to define properties via object
        Car benz = new Car(10.54, 64000, 5);

        //benz.mileage = 10.54;
        //benz.price = 30000;
        //benz.doors = 4;

        System.out.println("Benz has " + benz.doors + " doors");
        System.out.println("The price of Benz is " + benz.price + " USD");
        System.out.println("Benz has a mileage of " + benz.mileage + " ..");

        benz.carStart();
        benz.carShutOff();


        Car ford = new Car();
        System.out.println("Ford has " + ford.doors + " doors");
        System.out.println("The price of Ford is " + ford.price + " USD");
        System.out.println("Ford has a mileage of " + ford.mileage + " ..");


        Car ram = new Car(3.33);
        System.out.println("Ram has " + ram.doors + " doors");
        System.out.println("The price of Ram is " + ram.price + " USD");    // will become 0 because not defined in constructor
        System.out.println("Ram has a mileage of " + ram.mileage + " ..");  // will become 0 because not defined in constructor *
        // * primitive values bocome zeros if not defined/set


    }
}
