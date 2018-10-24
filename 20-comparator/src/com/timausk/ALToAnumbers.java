package com.timausk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALToAnumbers {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        intList.add(5);
        intList.add(100);
        intList.add(21);
        intList.add(99);
        intList.add(2);

        System.out.println("Before sort: " + intList);

        // will sort from lower to higher values
        Collections.sort(intList);

        System.out.println("After sort (default): " + intList);

        Collections.sort(intList, new SortComparatorNumber());

        System.out.println("After sort (custom): " + intList);


        int index = intList.indexOf(21);
        intList.remove(index);


        // remove without knowing the index
        System.out.println("After removing:" + intList);

    }
}
