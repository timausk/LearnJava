package com.timausk;

import java.util.Comparator;

public class SortComparator implements Comparator<String> {
    @Override

    // returns an integer based on the comparison we do
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);

        // compare in an alphabetic order
        // called lexicographically string comparison
        // a->b   <0      // returns a value lower then 0, in this case -1
        // a->a   == 0    // returns the value 0
        // c->a   >0      // returns a value greater then 0, in this case 2
    }
}
