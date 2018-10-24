package com.timausk;

// a class ENCAPSULATES methods and properties
public class Car {

    // properties, fields
    double mileage;
    int price;
    int doors;


    // constructor - a special methods which creates objects - implicitly/automatically calls
    public Car(double mileage, int price, int doors) {
        // this refers to the field/property variable
        // this refers to whoever is using it
        // class that is using "this" keyword
        this.mileage = mileage;  // set class's field mileage equal to mileage from method.
        this.price   = price;
        this.doors   = doors;
    }

    // you can have as many constructors you like ...
    public Car() {

        // this can be simplified into ..
        //this.mileage = 5.23;
        //this.price = 50500;
        //this.doors = 4;

        // this:
        this(5.23, 50500, 4);
    }

    public Car(double mileage) {
        this.mileage = mileage;
    }

    // functions

    public void carStart() {
        System.out.println("Car started");
    }

    public void carShutOff() {
        System.out.println("Car Engine off");
    }


}
