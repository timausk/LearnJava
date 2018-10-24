package com.timausk;

public class Main {

    public static void main(String[] args) {

        boolean isUsa = true;        // can take true or false - byte differs from machine
        char alphabet1 = 'a';        // unicode supporting data type. can take only ONE letter - 2 byte of memory
        char alphabet2 = '\u00A3';   // as unicode car   - 2 byte of memory
        byte someNumber = 123;       //                  - 1 byte of memory

        System.out.println("is it USA? " + isUsa);
        System.out.println("alphabet " + alphabet1);
        System.out.println("alphabet in unicode " + alphabet2);
        System.out.println("some byte number " + someNumber);
    }
}
