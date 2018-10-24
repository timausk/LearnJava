package com.timausk;

public class Arrays {


    public static void main(String[] args) {

        // Array is a continuous representation of same elements in the memory

        // create array with length of 5
        int [] studentMathScore = new int[5];


        // get array element by index
        //System.out.println(studentMathScore[0]);


        for(int i = 0; i < studentMathScore.length; i++) {
            studentMathScore[i] = i;
        }


        for(int i = 0; i < studentMathScore.length; i++) {
            System.out.println(studentMathScore[i]);
        }
    }

}
