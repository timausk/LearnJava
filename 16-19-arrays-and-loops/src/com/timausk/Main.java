package com.timausk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // similar to arrays int [] arrayValues = new int[5]
        // arrayList we do not specify the length
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(35);
        integerList.add(75);
        integerList.add(105);
        //integerList.add("String"); // not possible, because we defined as <Integer>

        System.out.println(integerList);

        // get the first entry
        System.out.println(integerList.get(0));

        // for each
        for (int currentInt:integerList) {
            System.out.println("foreach way: " + currentInt);
        }

        // for
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("for way: " + integerList.get(i));
        }

        // remove the first entry (5)
        integerList.remove(0);

        System.out.println("After removing " + integerList);


        // array Iterator
        // iterator can be used on all collections (List, Arrays, ...)

        Iterator iterator = integerList.iterator();

        // as ong array has a next element, run
        while(iterator.hasNext()) {
            System.out.println("Next element is: " + iterator.next());
        }

        // get the index of an element
        System.out.println(integerList.indexOf(75));

        // check if an value exist in a array. returns a boolean
        System.out.println(integerList.contains(105));

    }
}
