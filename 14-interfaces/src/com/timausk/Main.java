package com.timausk;

public class Main {
    public static void main(String[] args) {

        Cat rasie  = new Cat();
        Dog markie = new Dog();
        Lion simba = new Lion();

        rasie.makeSound();
        markie.makeSound();
        simba.makeSound();

        System.out.println(Animal.legs);
    }
}
