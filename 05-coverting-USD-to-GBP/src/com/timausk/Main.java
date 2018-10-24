package com.timausk;

public class Main {

    public static void main(String[] args) {

        // 50 USD to eq. British Pounds
        double usd = 50d;
        double rate = 0.81d;
        double pounds;

        pounds = usd * rate;

        System.out.println("50 USD in British Pounds is " + pounds);

    }
}
