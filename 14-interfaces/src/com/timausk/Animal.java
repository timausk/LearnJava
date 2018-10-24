package com.timausk;

// an interface is somthing that contains method which are not defined
public interface Animal {

    // private/protected is NOT allowed!!

    // bad practice
    // WHY? => fields are always public, static final
    int legs = 0;

    // methods => without declaring a body
    // a pattern of methods each class, which implements an interface, should have
    // a template for a class
    // WHY we do it?

    void makeSound();
}
